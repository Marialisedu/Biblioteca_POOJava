//Maria Eduarda da Silva Lima RA: 2614561

public class Controle {
    Leitura leitura = new Leitura();
    Biblioteca biblioteca = new Biblioteca();

    public void iniciar() {
        while (true) {
            System.out.println("\nBem-vindo à biblioteca!\n");
            System.out.println("1. Acessar");
            System.out.println("2. Cadastrar");
            System.out.println("3. Sair");

            int opcao = Integer.parseInt(leitura.entDados("\nEscolha uma opção\n"));

            switch (opcao) {
                case 1:
                    acessar();
                    break;
                case 2:
                    cadastrar();
                    break;
                case 3:
                    System.out.println("Obrigado por usar nossa biblioteca!");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }

    private void acessar() {
        System.out.println("\nQual tipo gostaria de acessar?");
        System.out.println("1. Livro");
        System.out.println("2. Revista");
        System.out.println("3. Mangá");

        int opcao = Integer.parseInt(leitura.entDados("\nEscolha uma opção\n"));
        switch (opcao) {
            case 1:
                biblioteca.acessarLivros();
                break;
            case 2:
                biblioteca.acessarRevistas();
                break;
            case 3:
                biblioteca.acessarMangas();
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }
    }

    private void cadastrar() {
        System.out.println("\nO que gostaria de cadastrar?");
        System.out.println("1. Livro");
        System.out.println("2. Revista");
        System.out.println("3. Mangá");

        int opcao = Integer.parseInt(leitura.entDados("\nEscolha uma opção\n"));
        switch (opcao) {
            case 1:
                biblioteca.cadastrarLivro();
                break;
            case 2:
                biblioteca.cadastrarRevista();
                break;
            case 3:
                biblioteca.cadastrarManga();
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }
    }
}
