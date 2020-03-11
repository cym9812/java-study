package practice;
public class MyClass1 {
	public void method1() {
		System.out.println("Some output!");
		MyClass2 otherObject = init();
		otherObject.method2();
	}
	
	public MyClass2 init() {
		return null;
	}
}
