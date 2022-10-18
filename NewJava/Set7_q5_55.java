public class Set7_q5_55 {
    // write a function to print nth term of fibonacci series using recursion.
    static void fib(int n) {
       /* if (n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }*/
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.print(num1 + ",");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String[] args) {

        fib(10); //0,1,1,2,3,5,8,13,21,34


       /*int result = fib(10);
        System.out.println(result);*/
    }
}
