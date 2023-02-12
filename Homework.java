import java.util.Scanner;

public class Homework {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    int n = getNumberByUser("Введите количество элементов ");
    System.out.println("Треугольное число = " + Triangle(n)+ "\n");
    }
    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }
    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}
