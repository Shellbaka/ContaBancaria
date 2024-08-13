import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner contaBanco = new Scanner(System.in);

        System.out.print("Por favor, insira seu nome: "); 
        String nome = contaBanco.nextLine();

        System.out.print("Agora, insira seu número de conta: ");
        int numeroConta = contaBanco.nextInt();

        contaBanco.nextLine();

        System.out.print("Agora, insira a sua Agência: ");
        String agencia = contaBanco.nextLine();

        System.out.print("Por fim, insira seu saldo: ");
        double saldo = contaBanco.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ", sua conta é: " + numeroConta + " e seu saldo atual é de: " + saldo + 
        ", já estando disponível para saque.");
    }
}


// TO DO : Conhecer e improtar a classe Scanner.
// TO DO : Exibir mensagens para o nosso usuário.
// TO DO : Obter pela Scanner os valores digitados.
// TO DO : Exibir a mensagem de conta criada.

// Desafio : criar um projeto de COntabancária que receberá dados via
// terminal contendo as características de conta em banco conforme 
// atributos abaixo.

//Atributos : NUMERO INTEIRO ex: 1021
//Agencia : Texto  ex : 067-8 
//Nome Cliente : Texto ex: Mario Andrade
//Saldo Decimal ex : 237.49

// CAdastre-se na agência : Nome por favor (scanner), numero : (scanner)
// agencia por favor : (Scanner).

//Após cadastramento mensagem final deve ser :
// Olá [Nome.cliente], obrigado por criar uma conta em nosso banco
//sua ag~encia é [Agência], conta [número] e o seu saldo atual de [saldo]
//já está disponível para saque.

