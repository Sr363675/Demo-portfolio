import java.util.Scanner;

public class Set5_q567_36 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number for factorial:");
        int n = sc.nextInt();
       /* int i ;
        int fact = 1;
        //int mul= 1;


        for ( i = 1; i <= n; i++) {
            fact *= i;
            System.out.println(fact);


        }*/
        //System.out.println(" total factorial:" + mul * (fact *= i));


        //Q6). using while loop
        int i = 1;
        int fact = 1;
        while (i<=n){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
