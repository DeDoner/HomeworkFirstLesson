import java.util.Scanner;

public class AdditionalTask6 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int b = input2.nextInt();
        swap(a, b);
        input1.close();
        input2.close();
    }

    static void swap(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
    }
}
