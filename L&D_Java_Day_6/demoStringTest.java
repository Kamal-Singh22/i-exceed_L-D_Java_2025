class StringConcatBench {
    private static final int N = 100_000;
    private static final String BASE = "iexceed";
    private static final String ADD = "technology";

    public String concatWithString() {
        String str = BASE;
        for (int i = 0; i < N; i++) {
            str += ADD; // new String each time
        }
        return str;
    }

    public String concatWithBuffer() {
        StringBuffer sb = new StringBuffer(BASE);
        for (int i = 0; i < N; i++) {
            sb.append(ADD);
        }
        return sb.toString();
    }

    public String concatWithBuilder() {
        // Pre-size to avoid growth: base + N * add
        int cap = BASE.length() + N * ADD.length();
        StringBuilder sb = new StringBuilder(cap);
        sb.append(BASE);
        for (int i = 0; i < N; i++) {
            sb.append(ADD);
        }
        return sb.toString();
    }
}

public class demoStringTest {
    static long time(Runnable r) {
        long t0 = System.nanoTime();
        r.run();
        return System.nanoTime() - t0;
    }

    public static void main(String[] args) {
        StringConcatBench bench = new StringConcatBench();

        // Warm-up (let JIT optimize)
        for (int i = 0; i < 3; i++) {
            bench.concatWithString();
            bench.concatWithBuffer();
            bench.concatWithBuilder();
        }

        // Measure and consume results to prevent dead-code elimination
        long t1 = time(() -> {
            String s = bench.concatWithString();
            System.out.println("String length: " + s.length());
        });

        long t2 = time(() -> {
            String s = bench.concatWithBuffer();
            System.out.println("StringBuffer length: " + s.length());
        });

        long t3 = time(() -> {
            String s = bench.concatWithBuilder();
            System.out.println("StringBuilder length: " + s.length());
        });

        System.out.println("concatWithString  (ms): " + t1 / 1_000_000.0);
        System.out.println("concatWithBuffer  (ms): " + t2 / 1_000_000.0);
        System.out.println("concatWithBuilder (ms): " + t3 / 1_000_000.0);
    }
}
