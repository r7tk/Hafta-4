import java.util.Random;

public class Knight extends GameChar {
    public Knight() {
        super(3,"Şovalye",new Random().nextInt(10,15),20,15);
    }
}
