import java.util.Random;

public class Losowanie {



    public int[] losuj() {
        Random random = new Random();
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++)  {
            int randomNumber = random.nextInt(1,49);
            array[i] = randomNumber;
        }
        return array;
    }
}
