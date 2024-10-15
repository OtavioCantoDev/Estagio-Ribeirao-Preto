import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Cálculo da sequência de Fibonacci: " + a); 
        
        while (a < numero) {
            System.out.print(", " + b);
            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println();
        if (a == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();

	}

}
