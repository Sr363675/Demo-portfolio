import java.util.Scanner;

public class Set4_q4_25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for days");
        int Day = sc.nextInt();
        switch (Day){
            case 1 -> System.out.println("sun...");
            case 2 -> System.out.println("mon...");
            case 3 -> System.out.println("tue...");
            case 4 -> System.out.println("wed...");
            case 5 -> System.out.println("thu...");
            case 6 -> System.out.println("fri...");
            case 7 -> System.out.println("stu...");

        }
    }
}
