import java.util.Random;

public class Numbers {



    public int[] draw() {
        Random random = new Random();
        int[] array = new int[6];
        boolean isExists = false;

        for (int i = 0; i < array.length; i++)  {
            int randomNumber = random.nextInt(1,49);

            for (int y = 0; y < array.length; y++) {
                if (array[y] == randomNumber) {
                    isExists = true;
                    break;
                }
            }

            if (!isExists) {
                array[i] = randomNumber;
            }

        }
        return array;
    }
}
