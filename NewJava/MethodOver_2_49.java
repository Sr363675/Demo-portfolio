public class MethodOver_2_49 {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning" + a +"bro!");
    }
    static void foo(int a ,int b){
        System.out.println("Good morning" + a +"bro!");
        System.out.println("Good morning" + b +"bro!");

    }
    static void foo(int a,int b,int c){
        System.out.println("Good morning" + a + "bro!");
        System.out.println("Good morning" + b + "bro!");
        System.out.println("Good morning" + c + "bro!");


    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){

    }

    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(3000,4000);
        foo(3000,4000,5000);

    }
}
