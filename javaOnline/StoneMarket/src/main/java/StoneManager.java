import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.compare;

public class StoneManager implements IStoneManager {

    List<Stone> stoneList;

    public StoneManager(List<Stone> stoneList) {
        this.stoneList = stoneList;
    }

    @Override
    public void sortByPrice() {
        Collections.sort(stoneList, (o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
        print();
    }


    @Override
    public void sortByWeight() {
        Collections.sort(stoneList, (o1, o2) -> Integer.compare(o2.getWeight(), o1.getWeight()));
        print();
    }

    @Override
    public void findByClarity(StoneClarity clarity) {

        for (Stone elem : stoneList) {
            if (elem.getStoneClarity().equals(clarity)) {
                System.out.println(elem.toString());
            }

        }
    }

    @Override
    public void findByValue(StoneValue value) {
        for (Stone elem : stoneList) {
            if (elem.getStoneValue().equals(value)) {
                System.out.println(elem.toString());
            }

        }
    }


    public void print() {


        for (Stone stone : stoneList) {

            System.out.println(stone.toString());
        }
    }
}
