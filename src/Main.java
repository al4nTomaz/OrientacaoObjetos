import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int opcaoComputador(){
        Random rnd = new Random(System.currentTimeMillis());

        return rnd.nextInt(10+1);
    }

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);

        int opcao, valor;

        boolean userPar = false;

        System.out.print("Você quer ser par? Digite 1-SIM 0-NÃO\t-> ");
        opcao = e.nextInt();

        if (opcao < 0 || opcao > 1) {
            System.out.println("ERRO!! Opção inválida!");
            System.exit(1);
        } else {
            if (opcao == 1) {
                userPar = true;
            }
        }

        System.out.print("Escolha um número de 1 a 10\t-> ");
        valor = e.nextInt();


        if (valor < 0 || valor > 10) {
            System.out.println("ERRO!! Valor inválida!");
            System.exit(1);
        }

        System.out.println(opcao +" "+ userPar);
        e.close();
    }
}