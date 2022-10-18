//first n even num...using while loop
public class Set5_q2_34 {
    public static void main(String args[]){
        int sum = 0;
        int n = 4;
        int i =1;
        while (i < n){
            //System.out.println(sum + (2*i));
            sum = sum + (2*i);
            i++;
        }
        System.out.println("sum of two even numbers");
        System.out.println(sum);
    }
}
