package 基础语法.继承测试;

public class Father {
    public Father() {
        System.out.println("父类无参构造方法被调用");
    }

    private String PrivateString = "abc";
    public String PublicString = "父类的PublicString";

    private void fatherPrivate() {
        System.out.println("父类private方法");
    }

    public void fatherPublic() {
        System.out.println("父类public方法");
    }
}
