import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int opcaoComputador(){
        Random rnd = new Random(System.currentTimeMillis());

        return rnd.nextInt(10+1);
    }

    public static String verificaQuemGanhou(boolean userPar, int valor, int valorComputador){

        int soma = valor + valorComputador;

        if ((soma % 2 == 0) && userPar) {
            return "Usuário";    
        } else if ((soma % 2 == 0) && !userPar) {
            return "Usuário";    
        }

        return "Computador";
    }

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);

        int nJogadas = 10;

        int opcao, valor, valorComputador, jogadas = 0;

        int[] escolhaUser;
        int[] escolhaComputador;

        escolhaUser = new int[nJogadas];
        escolhaComputador = new int[nJogadas];
        
        String ganhador = "";

        boolean userPar = false, continuar = true;

        while (continuar && jogadas < nJogadas) {
            
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
            
            valorComputador = opcaoComputador();
            
            System.out.println(userPar + " " + valor + " " + valorComputador);
            
            ganhador = verificaQuemGanhou(userPar, valor, valorComputador);
            
            escolhaUser[jogadas] = valor;
            escolhaComputador[jogadas] = valorComputador;
            
            jogadas++;
            System.out.println(ganhador);

            System.out.print("Você quer continuar? Digite 1-SIM 0-NÃO\t-> ");
            continuar = e.nextInt() == 1;
        }

        for (int i = 0; i < jogadas; i++) {
            System.out.println("J : " +escolhaUser[i] + "\tC : " + escolhaComputador[i]);
        }

        e.close();
    }
}
