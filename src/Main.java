import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner resposta = new Scanner(System.in);
        int resultado = 0;
        while (resultado != 4) {
            System.out.println("Bem-Vindo! O que você gostaria de fazer? Digite um dos números correspondentes abaixo:"
                    + "\n"
                    +"(1) Cadatrar novo usuário"+"\n"
                    +"(2) Cadastrar novo evento"+"\n"
                    +"(3) Consultar eventos" + "\n"
                    +"(4) Encerrar sessão");
            resultado = resposta.nextInt();
            switch (resultado) {
                case 1:
                    //chama classe cadastrar usuário
                    Cadastro novoUser = new Cadastro();
                    Cadastro.Cadastrar();
                    break;

                case 2:
                    //chama classe cadastrar evento
                    CadastroEvento novoEvento = new CadastroEvento();
                    CadastroEvento.CadastrarEvent();
                    break;

                case 3:
                    //chama classe consultar evento
                    Consulta novaConsulta = new Consulta();
                    Consulta.Consultar();
                    break;
                case 4:
                    break;

            }
        }
    }
}
