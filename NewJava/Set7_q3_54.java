public class Set7_q3_54 {
    //WA recursive funtion to calculate sum of first n natural numbers.
    static int sumrect(int n){
        if (n==1){
            return 1;
        }
        return n + sumrect(n-1);
    }
    public static void main(String[] args) {
        int c = sumrect(4);
        System.out.println(c); // 10
    }
}
