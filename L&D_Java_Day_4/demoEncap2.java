class Account {
    

    private long acc_No; 
    private String name;
    private String email;
    private float amount;

    public long getAcc_No() { 
        return acc_No; 
    }

    public void setAcc_No(long accNo) { 
        this.acc_No = accNo;
     }

    public String getName() {
         return name;
        
        }

    public void setName(String name) {
        
        this.name = name;
     }

    public String getEmail() {
         return email; 
        }

    public void setEmail(String email) { 
        this.email = email; 
    }

    public float getAmount() {
         return amount;
         }

    public void setAmount(float amount) {
         this.amount = amount; 
        }
}

public class demoEncap2
{
    public static void main(String[] args) 
    {

        Account acc = new Account(); 

        acc.setAcc_No(1234567890);
        acc.setName("asdfghj");
        acc.setEmail("abcasdfg@gmail.com");
        acc.setAmount(11234f);

        System.out.println("Account Number: " + acc.getAcc_No());
        System.out.println("Name: " + acc.getName());
        System.out.println("Email: " + acc.getEmail());
        System.out.println("Amount: " + acc.getAmount());
    }
}