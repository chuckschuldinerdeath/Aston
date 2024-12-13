import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("введите первое число: ");
        float a = scanner.nextFloat();
        System.out.println("введите второе число: ");
        float b = scanner.nextFloat();

        if(a > b){
            System.out.println("a > b");
        }
        else if(b > a){
            System.out.println("b > a");
        }
        else{
            System.out.println("a = b");
        }

        float sum = a + b;
        System.out.println("Сумма числе равнa: " + sum);
        float subtraction = a - b;
        System.out.println("Разность: " + subtraction);
        float division = a/b;
        if(b == 0){
            System.out.println("нельзя делить на ноль");
        } else {
            System.out.println("деление: " + division);
        }
        float multiplication = a * b;
        System.out.println("Умножение: " + multiplication);

    }
}