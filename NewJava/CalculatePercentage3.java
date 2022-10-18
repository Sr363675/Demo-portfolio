import java.util.Scanner;

public class CalculatePercentage3 {
    public static void main(String[] args)
    {
        System.out.println("Student marks in class 10th:-");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maths marks");
        double m = sc.nextDouble();
        System.out.println("Enter science marks");
        double s = sc.nextDouble();
        System.out.println("Enter sst marks");
        double ss = sc.nextDouble();
        System.out.println("Enter english marks");
        double e = sc.nextDouble();
        System.out.println("Enter hindi marks");
        double h = sc.nextDouble();

        double sum = m+s+ss+e+h;
        System.out.print("Total marks = ");
        System.out.println(sum);
       double per = (sum*100/500);
        System.out.print("Percentage = "+per+"%");
       // System.out.println(per);
    }
}
