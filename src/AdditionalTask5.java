import java.util.Scanner;

public class AdditionalTask5 {
    public static void main(String[] args) {
        System.out.println("Программа деления без остатка");
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int q = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int w = in2.nextInt();
        int result = q / w;
        int remnant = q % w;
        System.out.println("Результат: "+ result + " и " + remnant + " в остатке.");
        in1.close(); in2.close();
    }
}
