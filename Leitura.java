//Maria Eduarda da Silva Lima RA: 2614561

import java.util.Scanner;

public class Leitura {
    private Scanner scanner = new Scanner(System.in);

    public String entDados(String mensagem) {
        System.out.print(mensagem + ": ");
        return scanner.nextLine();
    }
}