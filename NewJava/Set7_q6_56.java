public class Set7_q6_56 {
    //Question-8

    /*static void pattern1_rec(int n){
        if (n > 0){
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1_rec(5);
        //*
        //**
        //***
        //****
        //*****
    }*/

    //Question-7
    static void pattern1_rec(int n){
        if (n > 0){
            for (int i = n; 0 < i; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern1_rec(n - 1);

        }
    }

    public static void main(String[] args) {
        pattern1_rec(4);


        //****
        //***
        //**
        //*
    }
}
