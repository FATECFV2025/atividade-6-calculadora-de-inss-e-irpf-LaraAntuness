import java.util.Scanner;

public class AppFolhaPagamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Salário bruto: ");
        double salario = sc.nextDouble();

        System.out.println("Tipo do contribuinte:");
        System.out.println("1 - Funcionário CLT");
        System.out.println("2 - Estagiário");
        System.out.println("3 - Prestador de Serviço");
        System.out.print("Escolha: ");
        int tipo = sc.nextInt();

        Contribuinte c = null;

        if (tipo == 1) {
            c = new FuncionarioCLT(nome, cpf, salario);
        } else if (tipo == 2) {
            c = new Estagiario(nome, cpf, salario);
        } else if (tipo == 3) {
            c = new PrestadorServico(nome, cpf, salario);
        } else {
            System.out.println("Tipo inválido! Encerrando.");
            System.exit(0);
        }

        c.exibirResumo();
    }
}

