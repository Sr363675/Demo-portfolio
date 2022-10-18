class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fir(){
        System.out.println("Firing on the enemy");
    }
}

public class Set8_q5_63 {
    public static void main(String[] args) {
        Tommy player = new Tommy();
        player.hit();
        player.run();
        player.fir();
    }
}
//Output
//Hitting the enemy
//Running from the enemy
//Firing on the enemy