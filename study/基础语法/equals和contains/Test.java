package 基础语法.equals和contains;

public class Test {
    private String value = null;

    public Test(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Test) {

            Test test = (Test) o;
            return value.equals(test.value);

        }
        return false;
    }
}
