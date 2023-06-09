import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int Numero;
		String Agencia, NomeCliente;
		double Saldo;

		System.out.println("Por favor, digite o número da Agência !");
		Numero = scan.nextInt();
		scan.nextLine();

		System.out.println("Por favor, digite sua Agência !");
		Agencia = scan.nextLine();

		System.out.println("Por favor, digite o seu nome !");
		NomeCliente = scan.nextLine();

		System.out.println("Por favor, digite o seu saldo !");
		Saldo = scan.nextDouble();

		System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");

		scan.close();
	}

}
