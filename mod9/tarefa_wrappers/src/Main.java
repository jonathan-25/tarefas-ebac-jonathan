import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int numero = scanner.nextInt();
        Integer numeroWrapper = Integer.valueOf(numero);

        System.out.println("Número primitivo: " + numero);
        System.out.println("Número wrapper: " + numeroWrapper);

        scanner.close();


    }
}