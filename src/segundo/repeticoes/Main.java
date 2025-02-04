package segundo.repeticoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParametrosInvalidosException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro parametro: ");
        int primeiroParametro = scanner.nextInt();

        System.out.println();

        System.out.print("Segundo parametro: ");
        int segundoParametro = scanner.nextInt();

        contador(primeiroParametro, segundoParametro);

    }

    public static void contador(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        if (segundoParametro < primeiroParametro) throw new ParametrosInvalidosException(
                "O primeiro parametro não pode ser maior que o primeiro"
        );
        int valorFinal = segundoParametro - primeiroParametro;

        for(int i=1; i <= valorFinal; i++ ){
            System.out.println("valor atual " + i);
        }
    }
}
