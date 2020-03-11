package practice;

public class SavingsAccount extends BaseAccount {
    protected double interest;
    public SavingsAccount(int id, int balance, double interest){
        super(id, balance);
        this.interest = interest;
    }
    public SavingsAccount(int id, int balance){
        super(id, balance);
        this.interest = 0;
    }
    public double getInterest(){
        return balance * interest / 100 / 12;
    }

}
