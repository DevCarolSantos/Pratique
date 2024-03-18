import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Consulta {
    public static void Consultar() throws IOException {

        String linha;

        FileReader lerCaminho = new FileReader("C:\\Users\\Carolina\\Desktop\\Anhembi Morumbi - Sistema de Informação\\Praticando\\Exemplo.java\\src\\eventos.data");

        BufferedReader lerArquivo = new BufferedReader(lerCaminho);

        while ((linha = lerArquivo.readLine()) != null) {
            String[] dados = linha.split(";");
            System.out.println(Arrays.toString(dados));
        }
        lerCaminho.close();
    }
}