import java.util.Locale;
import java.util.Scanner;

public class AdditionalTask0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String userName = scanner.nextLine().toLowerCase(Locale.ROOT).trim().replaceAll(" ", "");
        String outUserName = userName.substring(0, 1).toUpperCase() + userName.substring(1);


        System.out.printf("Привет, " + outUserName + "!");
        scanner.close();
    }
}
