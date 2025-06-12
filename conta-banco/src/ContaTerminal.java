import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner Scanner =new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Teste!");
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = Scanner.nextInt(); 

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = Scanner.next();

        System.out.print("Digite o nome: ");
        Scanner.nextLine();
        String nomeCliente = Scanner.nextLine();

        System.out.print("Digite o saldo: ");
        String saldoEntrada = Scanner.nextLine();
        double saldo = ConvertDouble(saldoEntrada);

        System.out.println("Obrigado por informar os dados da conta!");
        System.out.println("Olá, " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }

    private static double ConvertDouble(String saldo) {
        String saldoEntrada = saldo.replace(",", ".");
        try {
            return Double.parseDouble(saldoEntrada);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter o saldo.");
            return 0.0;
        }
    }
}
