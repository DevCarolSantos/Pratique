import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CadastroEvento {

    public static void CadastrarEvent() throws IOException {
        Scanner ler = new Scanner(System.in);
        String n;
        int t = 0;

        while(t !=2) {
            FileWriter arq = new FileWriter("C:\\Users\\Carolina\\Desktop\\Anhembi Morumbi - Sistema de Informação\\Praticando\\Exemplo.java\\src\\eventos.data", true);
            PrintWriter gravarArq = new PrintWriter(arq);

            System.out.printf("Qual é a categoria do evento?");
            n = ler.nextLine();
            gravarArq.printf(n + ";");

            System.out.printf("Qual nome do evento?");
            n = ler.nextLine();
            gravarArq.printf(n + ";");

            System.out.printf("Qual endereço do evento?");
            n = ler.nextLine();
            gravarArq.printf(n + ";");

            System.out.printf("Qual é a data do evento?");
            n = ler.nextLine();
            gravarArq.printf(n + ";");

            System.out.printf("Qual horário do evento?");
            n = ler.nextLine();
            gravarArq.printf(n + "\n");

            arq.close();

            System.out.printf("Evento cadastrado com sucesso" + "\n");

            System.out.printf("Cadastrar novo evento?" + "\n" + "Se sim, tecle 1. Se não, tecle 2.");
            t = Integer.parseInt(ler.nextLine());

        }

    }

}
