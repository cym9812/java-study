package practice;

public class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        }else {
            this.age = 0;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void yearPasses() {
        age += 1;
    }
    public String toString() {
        return String.format("%s(%d)", name, age);
    }
}

