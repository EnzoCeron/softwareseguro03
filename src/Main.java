import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Dados da pessoa-> \n");
        System.out.println("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Dados da música-> \n");
        System.out.println("Digite o título da música: ");
        String titulo = scanner.nextLine();
        System.out.println("Digite o compositor da música: ");
        String compositor = scanner.nextLine();
        System.out.println("Digite a duração da música: ");
        float duracao = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Dados do álbum-> \n");
        System.out.println("Digite o gênero do álbum: ");
        String genero = scanner.nextLine();
        System.out.println("Digite o artista do álbum: ");
        String artista = scanner.nextLine();
        System.out.println("Digite o ano do álbum: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do álbum: ");
        String nomeAlbum = scanner.nextLine();

        System.out.println("Digite a quantidade de músicas do álbum: ");
        int qtdMusicas = scanner.nextInt();
        scanner.nextLine();
        String musicas = "";
        for (int i = 0; i < qtdMusicas; i++) {
            System.out.println("Digite o título da música: ");
            musicas += scanner.nextLine() + ", ";
        }
        System.out.println("--------------------------------");

        System.out.println("Dados do álbum->");
        System.out.println("Gênero: " + genero);
        System.out.println("Artista: " + artista);
        System.out.println("Ano: " + ano);
        System.out.println("Nome: " + nomeAlbum);
        System.out.println("Músicas: " + musicas);
        System.out.println("--------------------------------");



     
    }
}