//Fail or promoted
import java.util.Scanner;

public class Set4_q2_23 {
    public static void main(String args[]) {
        System.out.println("Enter your marks:");
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3;
        System.out.println("Enter maths marks");
        m1 = sc.nextInt();
        System.out.println("Enter Physics marks");
        m2 = sc.nextInt();
        System.out.println("Enter Chemistry marks");
        m3 = sc.nextInt();
        float per = (m1 + m2 + m3) / 3;
        System.out.println("Total percentage:" + per + "%");

        if (per >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("You have been promoted");
        } else {
            System.out.println("You have been fail");
        }
    }
}