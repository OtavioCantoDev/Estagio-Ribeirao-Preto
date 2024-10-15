import java.util.Scanner;

public class VerificaLetraA {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        int contador = 0;

        for (char letra : entrada.toCharArray()) {
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        System.out.println("A letra 'a' aparece " + contador + " vez(es) na string.");

        scanner.close();
	}

}
