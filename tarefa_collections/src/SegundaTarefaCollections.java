import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SegundaTarefaCollections {
    public static void main(String args[]){

        //recebendo dados do console
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a lista de nomes e gênero da seguinte forma (Nome-Genero): ");
        String nome = sc.nextLine();

        //intanciando a lista de nomes com gênero Masculino
        List<String> listaM = new ArrayList<>();

        //intanciando a lista de nomes com gênero feminino
        List<String> listaF = new ArrayList<>();

        //intanciando a lista de nomes com gênero não definido
        List<String> listaN = new ArrayList<>();

        //obtendo cada nome da entrada utilizando split
        String[] nomesSeparados = nome.split(",");

        //Salvando cada item na lista de nomes separados por gênero
        for(String item : nomesSeparados) {
            if (item.contains("-M") || item.contains("-m")) {
                listaM.add(item.substring(0, item.indexOf("-")));
            } else if (item.contains("-F") || item.contains("-f")) {
                listaF.add(item.substring(0, item.indexOf("-")));
            } else {
                listaN.add(item.substring(0, item.indexOf("-")));
            }
        }

        if(listaM.size() != 0){
            //Ordenando a lista de nomes por ordem alfabética
            Collections.sort(listaM);
            //imprimindo no console
            System.out.println("Lista de nomes do gênero masculino ordenada por ordem alfabética:" + listaM);

        }

        if(listaF.size() != 0){
            //Ordenando a lista de nomes por ordem alfabética
            Collections.sort(listaF);
            //imprimindo no console
            System.out.println("Lista de nomes do gênero feminino ordenada por ordem alfabética:" + listaF);

        }
        if(listaN.size() != 0){
            //Ordenando a lista de nomes por ordem alfabética
            Collections.sort(listaN);
            //imprimindo no console
            System.out.println("Lista de nomes com gênero não identificado ordenada por ordem alfabética:" + listaN);
        }
    }
}
