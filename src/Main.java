import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        ArrayList<Integer> numbersList = numbers.draw();


        System.out.println("Wylosowana lista:");

        System.out.println(numbersList);


    }
}