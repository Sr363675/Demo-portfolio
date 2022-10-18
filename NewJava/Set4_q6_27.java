import java.util.Scanner;

public class Set4_q6_27 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website name");
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("This is an organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is an commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }
    }
}