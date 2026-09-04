import java.util.HashSet;
import java.util.Random;

public class Numbers {



    public HashSet<Integer> draw() {
        Random random = new Random();
        HashSet<Integer> array = new HashSet<>();


        while (array.size() < 6) {

            int randomNumber = random.nextInt(1,49);
            array.add(randomNumber);

        }

        return array;

    }
}
