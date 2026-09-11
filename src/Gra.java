import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Gra {
    private static boolean isGenerated = false;
    private static HashSet<Integer> generatedRandomNumbers = new HashSet<>();
    private static ArrayList<Integer> givenNumbers = new ArrayList<>();


    public Gra() {
        if (!isGenerated) {
            generatedRandomNumbers = generateNumbers();
            isGenerated = true;
        }
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean isEnd = false;

        while (!isEnd) {
           try {
               System.out.println("Podaj liczbe:");
               Integer liczba = sc.nextInt();
               if (givenNumbers.contains(liczba)) {
                   System.out.println("Podales juz taka liczbe");
               } else {
                   givenNumbers.add(liczba);
               }

               if (givenNumbers.size() == 6) {
                   isEnd = true;
               }
           } catch (Exception e) {
               System.out.println("Wystapil blad.");
           }

        }

    }

    public  HashSet<Integer> getGeneratedRandomNumbers() {
        return generatedRandomNumbers;
    }

    public  ArrayList<Integer> getGivenNumbers() {
        return givenNumbers;
    }

    public  boolean getIsGenerated() {
        return isGenerated;
    }

    /// name: generateNumbers
    /// description: generate random numbers
    /// params: none
    /// return: Hashset with random generated numbers
    /// author: Glueeed

    private HashSet<Integer> generateNumbers() {
        Random random = new Random();
        HashSet<Integer> array = new HashSet<>();


        while (array.size() < 6) {

            int randomNumber = random.nextInt(1,49);
            array.add(randomNumber);

        }

        return array;
    }
}
