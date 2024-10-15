import java.util.Scanner;

public class InterruptoresLampadas {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informações iniciais
        System.out.println("Você está em uma sala com três interruptores (A, B, C).");
        
        // 1. Ligue o interruptor A
        System.out.println("Ligue o interruptor A por 5-10 minutos e depois desligue.");
        
        // 2. Ligue o interruptor B
        System.out.println("Desligue o interruptor A e ligue o interruptor B.");
        
        // 3. Peça ao usuário para ir até a sala das lâmpadas
        System.out.println("Agora, vá até a sala das lâmpadas e observe os resultados.");
        System.out.println("Pressione Enter quando estiver de volta...");
        scanner.nextLine(); // Espera o usuário voltar

        // Resultados
        System.out.println("Identificação das lâmpadas:");
        System.out.println("Lâmpada quente e desligada = Interruptor A");
        System.out.println("Lâmpada ligada = Interruptor B");
        System.out.println("Lâmpada fria e desligada = Interruptor C");

        // Encerrando o scanner
        scanner.close();

	}

}
