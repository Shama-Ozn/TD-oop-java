public class Bank {
    private int accountNumber;// to follow Java naming conventions.
    private Double balance;
    private String cin;
//________conctructors_____________
    public Bank(int accountNumber,Double balance, String cin)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.cin=cin;
    }
//____________Setters________________unnecessary just a good practice 
public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
}
public void setBalance(Double balance) {
    this.balance = balance;
}
public void setCin(String cin) {
    this.cin = cin;
}
//___________Getters________________only balance is needed but yet it's a good practice
public Double getBalance() {
    return balance;
}
public int getAccountNumber() {
    return accountNumber;
}
public String getCin() {
    return cin;
}
//_____________methods_________________
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public boolean withdraw (double amount)//changed the return type to bool
    {
        if(balance-amount>=0)
        {balance-=amount;
        return true;}
        else {
        return false;}
    }
    //Updated the deposit and withdraw methods to use double instead of float for consistency with the balance attribute.
    public String toString()
    {
        return "account number : "+accountNumber+" Balance : "+balance+" CIN : "+cin;
    }
    //_____________main__________________
    public static void main(String[] args) {
         Bank account = new Bank(1,5000.75 , "AB 1200");
         System.out.println(account.toString());
         System.out.println("Balance : "+account.getBalance());
         account.deposit(500);
         System.out.println(account.toString());
         System.out.println("Balance : "+account.getBalance());
         account.withdraw(200);
         System.out.println(account.toString());
         System.out.println(account.getBalance());
    }
}// 've tried to respect the class diagram , but it needs some changes to provide best results and follow java conventions so .. it ends up like this..
