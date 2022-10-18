public class Pattern12 {
    public static void main(String[] args) {
        int n =5;
        //upper hal
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2*i-1; j++)
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 0; j < n-i; j++) {
              System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2*i-1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
