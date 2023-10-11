import java.util.Random;

public class BetterAlienFactory {
    private enum Types {SquidAlien, TigerAlien, MonkeyAlien, RatAlien};
    private static Random r = new Random();
    public Alien getAlien(){
        int rand = r.nextInt(Types.values().length);
        Types t = Types.values()[rand];
        Alien alien = null;
        try {
            alien =
                    (Alien)(Class.forName(t.toString()).getDeclaredConstructor().newInstance());
        } catch (Exception e){
            System.out.println("Unknown Alien");
        }
        return alien;
    }
}
