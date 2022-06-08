import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        try (Scanner ler = new Scanner(System.in)) {
            int i = 1, menu;
            String email, telefone, conta, senha;
            System.out.println("Digite: \n1 - Adicionar registro \n2 - Mostrar todos os registros");
            menu = ler.nextInt();
            if (menu == 1) {
                try (Scanner texto = new Scanner(System.in)) {
                    System.out.println("Digite o email:");
                    email = texto.nextLine();
                    System.out.println("Digite o telefone:");
                    telefone = texto.nextLine();
                    System.out.println("Digite a conta:");
                    conta = texto.nextLine();
                    System.out.println("Digite a senha:");
                    senha = texto.nextLine();
                }
                ArquivoConfig.GravaTxt("Arquivo.txt", i + "\t" + email + "\t" + telefone + "\t" + conta + "\t" + senha + "\r");
                Path path = Path.of("Index.txt");
                i++;
                Files.writeString(path, i + "");
            } else if (menu == 2) {
                ArquivoConfig.ler("Arquivo.txt");
            }
        }
    }
}