import java.util.Scanner;

public class Homework {
    private static Scanner input = new Scanner(System.in);
    int n = getNumberByUser("Введите количество элементов ");
    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }
}
