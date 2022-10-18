//import java.sql.SQLOutput;
import java.util.Scanner;

public class TakingInput4 {
    public static void main(String[] args){
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The sum of the number is:");
        System.out.println(sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

       // String str =sc.next();
       // System.out.println(str);
    }
}
