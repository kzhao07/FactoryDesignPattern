import java.util.Random;

public class Alien {
    private final String NAME;
    private static Random r = new Random();

    public Alien(String type){
        this.NAME = type + r.nextInt(100);
    }

    @Override public String toString(){
        return this.NAME;
    }

    public String getNAME() {
        return NAME;
    }
}
