package study;

public class Employee extends Person{
    protected String jobTitle;
    protected double pay;
    public Employee(String name, int age, String jobTitle, double pay){
        super(name, age);
        this.jobTitle = jobTitle;
        this.pay = pay;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString(){
        return String.format("Employee[%s(%d), %s, %.2f]", name, age, jobTitle, pay);
    }
}
