package study.继承测试;

public class TestCD {
    public static void main(String[] args){
        C a1 = new C();
        C b1 = new D();
        D b2 = new D();

        D.f();
        a1.h();
        a1.g();
        b1.h();
        b1.g();
        b1.f();
        b2.h();
        b2.g();
        b2.f();
        C.f();

    }
}
