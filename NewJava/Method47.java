public class Method47 {
   /* static class calculate{
        int sum(int a,int b){
            return a+b;
        }

        public static void main(String[] args) {
            Method47 obj = new Method47();
            int c = obj.sum(5,6);
            System.out.println(c);
        }
       }*/

    //*-----------------------------*-------------------*---------
    static int logic(int x, int y){
        int z;
        if(x>y){
            z= x+y;
        }else {
            z = (x+y)*5;
        }
        x = 555;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b);
        System.out.println(a + " " + b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c1);
        System.out.println(c);

    }

}
