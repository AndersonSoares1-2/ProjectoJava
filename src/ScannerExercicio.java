import java.util.Scanner;

public class ScannerExercicio {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigete um valor: ");
        String valor = sc.nextLine();
        System.out.println("\nO valor digitado foi: " + valor + "\n");
        sc.close();
    }
}
