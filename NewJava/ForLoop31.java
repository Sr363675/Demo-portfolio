import java.util.Scanner;

public class ForLoop31 {
    public static void main(String args[]){
        /*for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
        }
        */


        //WAP to print first n odd number using a for loop.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println(2*i+1);
        }*/

        //***********---------------------**************
        //Decrementing for loop
        /*for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }*/

        //natural number in reverse order
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = n; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
