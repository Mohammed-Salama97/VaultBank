package product;

public class Account {

    private String accountNum;
    private String accountType;
    private double balance;

    void deposit(double amount){
        this.balance =+ amount;
    }
    double withdraw(double amount){
        return 0.0;
    }

//    public enum AccountType{
//        PREMIUM, PLATINUM, SILVER, CURRENT, SAVING
//    }

}
