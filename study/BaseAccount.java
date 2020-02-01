package study;

public class BaseAccount{
    protected int id;
    protected double balance;
    public BaseAccount(int id, int balance){
        this.id = id;
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
    public String toString(){
        return String.format("%d: %.2f", id, balance);
    }
    public void deposit(int number){
        if (number >= 0){
            balance += number;
        }
    }
    public void withdraw(int number){
        if (number > balance || number < 0) {
            System.out.println("Amount exceeded account balance!");
        }else {
            balance -= number;
        }
    }
}
