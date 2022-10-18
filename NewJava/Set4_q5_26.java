import java.util.Scanner;

public class Set4_q5_26 {
    public  static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = sc.nextDouble();
        if (365 >= num){
            System.out.println("In thid year are leap");
        }
        else {
            System.out.println("In this year are mot leap");
        }
    }
}
