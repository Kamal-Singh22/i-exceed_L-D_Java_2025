const bankAccount={
    balance:1,
    deposit:function(amount)
    {
        this.balance+=amount;
    },
    withdraw:function(amount)
    {
       if (amount > this.balance) {
            console.log("Insufficient balance.");
        } else {
            this.balance -= amount;
            console.log("Withdrawal successful.");
        }

    },
    getAmt:function()
    {
        return this.balance
    }
}
let savingAccount=Object.create(bankAccount);
savingAccount.acc_number="Ac12123";
savingAccount.AccountHolder_name="Ashish";
savingAccount.bank="NIC Asia";
savingAccount.branch="Biratnagar";


let currentAccount=Object.create(bankAccount);
currentAccount.acc_number="Ac12123";
currentAccount.AccountHolder_name="Ashish";
currentAccount.bank="NIC Asia";
currentAccount.branch="Biratnagar";

console.log(savingAccount.AccountHolder_name);
savingAccount.deposit(2);
savingAccount.withdraw(5);
console.log("Saving Amount: "+savingAccount.getAmt());
