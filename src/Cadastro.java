import java.util.Scanner;

public class Cadastro
{
    public static void Cadastrar() {
        Scanner resposta1 = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String resultado1 = resposta1.nextLine();
        System.out.println("Qual sua idade?");
        String resultado2 = resposta1.nextLine();
        System.out.println("Usuário cadastrado com sucesso!"+"\n");
    }
}
