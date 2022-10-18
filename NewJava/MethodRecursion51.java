public class MethodRecursion51 {
    //factorial(n) = n * n-1....1
    //factorial(n) = n * factorial(n-1)
    static int facorial(int n){
        if (n==0 || n==1){
            return 1;
        }else {
            return n * facorial(n-1);
        }
    }
    //----------------------
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }else {
            int product = 1;
            for (int i = 1; i <= n ; i++) {
                product *= i;
            }
            return product;
        }
    }


    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factorial x is: " + facorial(x));
        System.out.println("The value of factorial_iterative x is: " + factorial_iterative(x));

    }
}
