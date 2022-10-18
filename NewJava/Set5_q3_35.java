import java.util.Scanner;

//Multiplication table
public class Set5_q3_35 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for table:");
        int n = sc.nextInt();
      /*  for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i +" = "+ n*i);
        }*/


        //--------------++++++++++++++++-------------------------
        //Q4--> Reverse table for 10
/*

        for (int i = 10; i >= 1 ; i--) {
            System.out.println(n + "X" + i + "=" + n*i);
        }
*/

        //***************************----------------------***************

        //Q9).add multiplication table
        int sum =0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i +" = "+ n*i);

         sum += n*i;
        }
        System.out.println("Sum of table:" + sum);
    }
}
