import java.util.ArrayList;
import java.util.Random;

public class Numbers {



    public ArrayList<Integer> draw() {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();


        while (array.size() < 6) {

            int randomNumber = random.nextInt(1,49);
            if (array.contains(randomNumber)) {
                continue;
            }

            array.add(randomNumber);

        }

        return array;

    }
}
