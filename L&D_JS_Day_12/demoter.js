function validateMe(marks) {
  let res = marks < 40 ? "re-appear" :
            marks >= 40 && marks < 60 ? "Pass" :
            marks >= 60 && marks < 80 ? "A grade" :
            marks >= 80 && marks <= 100 ? "A++ grade" :
            "Enter proper marks";
  return res;
}

console.log(validateMe(99));
