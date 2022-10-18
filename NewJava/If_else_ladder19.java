import java.util.Scanner;

public class If_else_ladder19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        if(marks > 79){
            System.out.println("first division");
        }
        else if(marks > 59){
            System.out.println("second division");
        }
        else if (marks > 49) {
            System.out.println("third division");
        }
        else{
            System.out.println("fail");
        }
    }
}
