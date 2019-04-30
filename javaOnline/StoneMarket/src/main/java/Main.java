import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StoneGenerator stoneGenerator = new StoneGenerator();
        stoneGenerator.create();


        List<Stone> stones = stoneGenerator.getStone();
        StoneManager manager = new StoneManager(stones);

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        switch (Integer.parseInt(command)) {
            case 1:
                manager.sortByPrice();
                break;
            case 2:
                manager.sortByWeight();
                break;

            case 3:
                //manager.findByClarity();
                break;

            case 4:
                manager.sortByPrice();
                break;


        }
    }
}
