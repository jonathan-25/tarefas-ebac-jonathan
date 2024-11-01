//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.*;

public class Main {
    public static void main(String[] args) {

        coletaNome();
        coletaNomeSexo();


    }


    private static void coletaNome() {

        System.out.println("   *********    Primeira parte da tarefa    ***********   " );

        /**
         * use essa lista de nomes para faciliar   =  jonatahn , rafael , bruna , diogo ,oswaldo ,wender , felipe , kenno , zoe , gabriel , ester , xuxa , heitor , laura , nadir
         *
         */

        Scanner s = new Scanner(System.in);

        System.out.println("digite sua lista de nomes separando cada item por virgula (,)");

        String textoNomes = s.nextLine();

        List<String> nomeSeparado = new ArrayList<>();


        for (String nome : textoNomes.split(",")) {
            nomeSeparado.add(nome.trim());
        }

        Collections.sort(nomeSeparado);
        System.out.println(nomeSeparado);


    }



    private static void coletaNomeSexo() {

        System.out.println("           ********* Segunda parte da tarefa ***********    " );

        /**
         * use esta lista de nomes para facilitar =     jonathan-M , juliana-F , Bernardo-M ,Flavia-F
         *
          */


        Scanner s =new Scanner(System.in);

        System.out.println("digite um nome e 'M' para masculino e 'F' para feminino. ");
        String textoNomeSexo = s.nextLine();

        List<NomeSexo> listaNomeSexo = new ArrayList<>();
        String[] itens = textoNomeSexo.split(",");

        /**
         * percorre cada item de "intens" - colocando em "item" - o array "parte" recebe o que vai em "item" separando pelo "-"  ( jonathan-M )
         *  nome e sexo sao duas variaves que recebem o que tem no indice 0 e 1 do array partes .
         *  por fim eu incluo na listaNomeSexo ( list) o objeto NomeSexo seguindo a exigencia de nome e sexo como parametros - ja usando esse nome e sexo .
         *  essa foi a unica forma que encontrei de separar esses dados que vem juntos para uma lista ...
         */

        for (String item : itens){
            String[] partes = item.split("-");
            String nome = partes[0].trim();
            String sexo = partes[1].trim();
            listaNomeSexo.add(new NomeSexo(nome,sexo));

        }

        List<NomeSexo> listaMasculina =  new ArrayList<>();  // crio duas listas para separar os nomes com base no M e F
        List<NomeSexo> listaFeminina =  new ArrayList<>();

        /**
         * aqui ele percorre a listaNomeSexo e coloca cada indice em "ns" pegando o parametro sexo verifica se é igual a M ou F
         * se for M inclui nessa nova lista masc ou femin.
         *
         */

        for (NomeSexo ns : listaNomeSexo) {
            if (ns.getSexo().equals("M")) {
                listaMasculina.add(ns);
            } else if (ns.getSexo().equals("F")) {
                listaFeminina.add(ns);
            }
        }
        System.out.println("Nomes Masculinos:");
        for (NomeSexo ns : listaMasculina) {
            System.out.println(ns.getNome() + " (" + ns.getSexo() + ")");
        }

        System.out.println("\nNomes Femininos:");
        for (NomeSexo ns : listaFeminina) {
            System.out.println(ns.getNome() + " (" + ns.getSexo() + ")");
        }





    }

}