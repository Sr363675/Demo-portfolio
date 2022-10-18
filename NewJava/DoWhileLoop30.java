import java.util.Scanner;

public class DoWhileLoop30 {
    public static void main(String args[]){
       /* int a=1;
        do {
            System.out.println(a);
            a++;
        }while (a<=5);
        */


        //Write a program to print first n natural numbers using do-while loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int b = 1;
        do {
            System.out.println(b);
            b++;
        }while (b<=n);



    }
}
