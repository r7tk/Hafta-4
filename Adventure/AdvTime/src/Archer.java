import java.util.Random;

public class Archer extends GameChar {
    public Archer() {
        super(2,"Okçu    ",new Random().nextInt(9,11),20,20);
    }

}
