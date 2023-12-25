import java.util.Scanner;

public class AdditionalTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int result = 0;
        while (n > 10) {
            result += n % 10;
            n/=10;
        }
        result+=n;
        System.out.println("Ответ =" + result);
        in.close();
    }
}