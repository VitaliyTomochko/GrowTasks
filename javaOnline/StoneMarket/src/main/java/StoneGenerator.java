import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoneGenerator {
    private static final Random RANDOM = new Random();
    private String[] presiousStones = {"Diamond ", "Sapphire", "Ruby", "Tourmaline", "Emerald"};
    private String[] semiPresiousStones = {"Chrysoprase ", "Cornaline", "Ruby", "Tourmaline", "Emerald"};
    private List<Stone> stone = new ArrayList<>();

    public List<Stone> getStone() {
        return stone;
    }


    public double generatePrice() {

        Random ran = new Random();
        return (ran.nextInt(20) + 10) + 0.99;
    }

    public int generateWeight() {

        Random ran = new Random();
        return (ran.nextInt(2000) + 100);
    }

    public void create() {
        for (int i = 0; i < presiousStones.length; i++) {
            stone.add(new PresiousStone(generateName(presiousStones), generateWeight(), generateWeight(), generateClarity(), StoneValue.Precious));
        }
        for (int i = 0; i < presiousStones.length; i++) {
            stone.add(new SemiPresiousStone(generateName(semiPresiousStones), generateWeight(), generateWeight(), generateClarity(), StoneValue.SemiPresious));
        }
    }

    public StoneClarity generateClarity() {
        StoneClarity[] VALUES = StoneClarity.values();
        return VALUES[RANDOM.nextInt(VALUES.length)];
    }

    public String generateName(String[] name) {

        return name[RANDOM.nextInt(name.length)];
    }

//    public StoneValue generateValue() {
//        StoneValue[] VALUES = StoneValue.values();
//        return VALUES[RANDOM.nextInt(VALUES.length)];
//    }

}
