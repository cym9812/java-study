package practice;

public class KMP {
    public static int count = 0;
    public static int kmp(String str, String dest,int[] next){//str文本串  dest 模式串
        for(int i = 0, j = 0; i < str.length(); i++){
            while(j > 0 && str.charAt(i) != dest.charAt(j)){
                j = next[j - 1];
            }
            if(str.charAt(i) == dest.charAt(j)){
                j++;
                count += 1;
            }
            if(j == dest.length()){
                return i-j+1;
            }
        }
        return 0;
    }
    public static int[] kmpnext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;
        for(int i = 1,j = 0; i < dest.length(); i++){
            while(j > 0 && dest.charAt(j) != dest.charAt(i)){
                j = next[j - 1];
            }
            if(dest.charAt(i) == dest.charAt(j)){
                j++;
                count += 1;
            }
            next[i] = j;
        }
        return next;
    }
    public static void main(String[] args){
        long startTime = System.nanoTime();
        String a = "bbbabbba";
        String b = "abaaabababbabababbababbbbaaaaaabbbaababababbabababababababbabaababbabababababbabababbababbbabbabaababbabababbabbabbababbababababbababababbbb";
        int[] next = kmpnext(a);
        int res = kmp(b, a,next);
        System.out.println(res);
        for(int i = 0; i < next.length; i++){
            System.out.print(next[i]);
        }
        System.out.println(next.length);
        System.out.println(count);
        long endTime = System.nanoTime();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
    }
}