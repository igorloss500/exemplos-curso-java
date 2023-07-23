import java.util.Scanner;
public class ExercicioSete {
    public static void main(String[] args){

        //Instanciando um novo scaner
        Scanner s = new Scanner(System.in);

        //Exibindo mensagem no console
        System.out.println("Digite um número: ");

        //Recebendo o numero digitado na variável primitiva inteiro:
        int numero = s.nextInt();
        Integer numeroI = (Integer) numero;

        //Imprimindo o número no console
        System.out.println("O número convertido para o tipo wrapper: " + numeroI);

    }
}
