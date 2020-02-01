package study;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account (int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public Account (int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setBalance(int newbalance){
        balance = newbalance;
    }
    public void setAnnualInterestRate(int newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return annualInterestRate / 12 * balance / 100;
    }
    public void deposit(int number){
        if (number > 0){
            balance += number;
        }
    }
    public void withdraw(int number){
        if (number >= balance || number < 0){
            System.out.println("Invalid operation!");
        }else{
            balance -= number;
        }
    }
    public String toString() {
        return String.format("%d: %.2f%n", id, balance);
    }
}

