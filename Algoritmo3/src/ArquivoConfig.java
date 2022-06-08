import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivoConfig {
    //Grava no arquivo----------------------------------------------------------------------Inicio
    public static void GravaTxt(String Caminho, String Gravar) {

        try (

            FileWriter Arquivo = new FileWriter(Caminho, true); BufferedWriter buffer = new BufferedWriter(Arquivo); PrintWriter escritor = new PrintWriter(buffer);
        ) {
            escritor.append(Gravar);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    //Grava no arquivo----------------------------------------------------------------------Fim

    //Ler no arquivo----------------------------------------------------------------------Inicio
    public static void ler(String Caminho) {
        try (
            BufferedReader buffRead = new BufferedReader(new FileReader(Caminho))) {
            String linha = "";

            while (true) {
                if (linha != null) {
                    System.out.println(linha);
                } else {
                    break;
                }

                linha = buffRead.readLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();

        }
    }
    //Ler no arquivo----------------------------------------------------------------------Fim
}