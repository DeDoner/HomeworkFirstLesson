import java.util.Scanner;
// Сдаюсь, не понимаю в чем проблема... Работает только при вводе через запятую.
public class AdditionalTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        double w = in.nextDouble();
        long x = (int)Math.round(w);
        System.out.println("Результат: "+ x);
        in.close();
    }
}