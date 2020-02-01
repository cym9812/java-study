package study;

public class tryfinally {
    public static int testfinally(){
        try{
            System.out.println("start");
            int a = 1/0;
            return a;
        }
        catch (Exception e){
            System.out.println("catch 执行");
            return 0;
        }
        finally {
            System.out.println("finally 仍然执行");
        }
    }
    public static void main(String[] args){
        System.out.println(testfinally());
    }
}


