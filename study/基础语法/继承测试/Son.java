package 基础语法.继承测试;

public class Son extends Father{
    private String PrivateString = "efg";
    public String PublicString = "子类的PublicString";

    public Son() {
        System.out.println("子类无参构造方法被调用");
    }

    public Son(String a){
        System.out.println("子类带参构造方法被调用");
        super.PublicString = a;
    }

    @Override
    public void fatherPublic() {
        System.out.println("子类重写fatherPublic方法");
    }

    private void sonPrivate(){
        System.out.println("子类private方法");
    }

    public void sonPublic(){
        System.out.println("子类public方法");
    }
}
