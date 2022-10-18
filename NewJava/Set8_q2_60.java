class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Sonu...");
    }
}
public class Set8_q2_60 {
    public static void main(String[] args) {
        CellPhone poco = new CellPhone();
        poco.ring();
        poco.callFriend();
        poco.vibrate();
    }
}
//Output:-
  //Ringing...
  //Calling Sonu...
  //Vibrating...
