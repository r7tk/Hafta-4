import java.util.Random;

public class Snake extends Mob{
    public Snake() {
        super(4, "Yılan",new Random().nextInt(3,7), 20, new Random().nextInt(5,10));
    }
}
