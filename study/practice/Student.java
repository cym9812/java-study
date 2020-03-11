package practice;

public class Student extends Person{
    protected String program;
    public Student(String name, int age, String program) {
        super(name, age);
        this.program = program;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    @Override
    public String toString() {
        return String.format("Student[%s(%d), %s]", name, age, program);
    }
}
