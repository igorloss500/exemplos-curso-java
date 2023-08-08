import java.util.*;

public class PrimeiraTareferaCollections {
    public static void main(String args[]){

        //recebendo dados do console
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a lista de nomes: ");
        String nome = sc.nextLine();

        //intanciando a lista de nomes
        List<String> lista = new ArrayList<>();

        //obtendo cada nome da entrada utilizando split
        String[] nomesSeparados = nome.split(",");

        //Salvando cada item na lista de nomes
        for(String item : nomesSeparados){
            lista.add(item);
        }

        //Ordenando a lista de nomes por ordem alfabética
        Collections.sort(lista);

        //imprimindo no console
        System.out.println("Lista de nomes ordenada por ordem alfabética:" + lista);
    }
}
