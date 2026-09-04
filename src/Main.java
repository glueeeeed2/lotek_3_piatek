//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        int[] numbersArr = numbers.draw();

        System.out.println("Wylosowana tablica:");

        for (int number : numbersArr) {
            System.out.println(number);
        }


    }
}