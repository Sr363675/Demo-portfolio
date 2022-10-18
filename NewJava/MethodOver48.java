public class MethodOver48 {
    int multiply(int a, int b){
        return a*b;
    }
    double multiply(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        MethodOver48 obj = new MethodOver48();
        int c = obj.multiply(5,6);
        double d = obj.multiply(5.1,4.2);
        System.out.println("Multiply method : returns integer :" + c);
        System.out.println("Multiply method : returns double  :" + d);

    }

}
