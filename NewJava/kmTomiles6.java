import java.util.Scanner;

public class kmTomiles6 {
    public static void main(String[] args){
        System.out.println("Convert kilometer to miles");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your kilometers:");
        double kilo = sc.nextDouble();
        double miles = kilo * 0.62137119;
        System.out.println("miles =" + miles );
    }

}
