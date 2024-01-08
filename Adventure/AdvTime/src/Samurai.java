import java.util.Random;

public class Samurai extends GameChar{
    public Samurai() {
        super(1,"Samuray",new Random().nextInt(9,15),24,15);
    }
}
