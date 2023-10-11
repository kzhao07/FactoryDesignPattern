import java.util.Random;

public class AlienFactory {
    private enum Types {SQUID, TIGER, MONKEY, RAT};
    private static Random r = new Random();
    public Alien getAlien(){
        Types a = Types.values()[r.nextInt(Types.values().length)];
        switch(a){
            case SQUID:
                return new SquidAlien();
            case TIGER:
                return new TigerAlien();
            case MONKEY:
                return new MonkeyAlien();
            case RAT:
                return new RatAlien();
            default:
                System.out.println("Unknown Error Encountered");
                System.exit(1);
                return null;
        }
    }
}
