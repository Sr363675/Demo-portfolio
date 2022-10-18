import java.util.Scanner;
public class Strings15 {
    public static void main(String[] args){

        String str1 = "Sandeep Kumar";
        String str2 = "Sandeep Kumar";
        System.out.println(str1 == str2);

       String name = new String("Sandeep");
     // String name = "Sandeep";
        System.out.printf("The name is :");
        System.out.printf(name);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %f",a,b);
        Scanner sc = new Scanner(System.in);
          String st = sc.next();
        //String st = sc.nextLine();
        System.out.println(st);

    }
}
