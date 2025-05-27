class cellphone{

public void ring(){
    System.out.println("Ringing.....");
}
public void vibrate(){
    System.out.println("vibrating...");
}
}


public class OopBasics2 {
    public static void main(String[] args) {
        cellphone vivo = new cellphone();
        vivo.ring();
        vivo.vibrate();
        
    }
}
