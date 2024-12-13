import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первую строку: ");
        String a = scanner.nextLine();
        System.out.print("введите вторую строку: ");
        String b = scanner.nextLine();

        if(b.equals(a)){
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
