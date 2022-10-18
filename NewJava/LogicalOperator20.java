public class LogicalOperator20 {
    public static void main(String[] args){
        //AND Operator
        System.out.println("For logical AND....");
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        //OR Operator
        System.out.println("For logical OR....");
        if (a || b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        //NOT Operator
        System.out.println("For logical NOT.......");
        System.out.println("Not(a) is ");
        System.out.println(!a);
        System.out.println("NOT(b) is");
        System.out.println(!b);
    }
}
