import java.util.Scanner;
public class ExercicioControleFluxos {
        public static void main(String[] args) {

            //Instanciando a classe scanner
            Scanner s = new Scanner(System.in);

            //Início do programa de cálculo de média
            System.out.println("Deseja Calcular a média semestral?");

            //Recebendo a resposta no console
            String resposta = s.nextLine();

            if(resposta.equalsIgnoreCase("SIM")){

                //Recebendo a quantidade de notas que deseja calcular a média
                System.out.println("Quantas notas deseja utilizar para o cálculo da média?");
                float soma = 0;
                float media = 0;
                int qtdNotas = s.nextInt();

                for(int i=0; i<qtdNotas; i++){
                    System.out.println("Digite a n° " + (i+1) + ":");
                    soma = soma + s.nextFloat();
                }

                //calculando a média:
                media = (soma/qtdNotas);

                if(media >= 7){
                    System.out.println("Média Calculada: " + media + ". Aluno aprovado, boas férias!");
                }else if(media >= 5 && media < 7){
                    System.out.println("Média Calculada: " + media + ". Aluno de recuperação, bons estudos!");
                }else{
                    System.out.println("Média Calculada: " + media + ". Aluno de reprovado, nos vemos no próximo semestre!");
                }

            }else{
                System.out.println("Encerrando programa, obrigado!");
            }


        }
}
