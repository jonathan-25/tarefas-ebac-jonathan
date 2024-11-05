import NomeSexp.NomeSexo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("digite um nome e 'M' para masculino e 'F' para feminino.");

        String nomesJ = s.nextLine();
        List<NomeSexo> listaNomeSexo = new ArrayList<>();

        String[] itens = nomesJ.split(",");

        for (String item : itens){
            String[] partes = item.split("-");
            String nome = partes[0].trim();
            String sexo = partes[1].trim();
            listaNomeSexo.add(new NomeSexo(nome,sexo));

        }

        List<NomeSexo> listaMasculina = new ArrayList<>();
        List<NomeSexo> listaFeminina = new ArrayList<>();


        for (NomeSexo ns : listaNomeSexo){
            if (ns.getSexo().equals("M")){
                listaMasculina.add(ns);
            } else {
                listaFeminina.add(ns);
            }
        }

        System.out.println("Lista Masculina:");
        for (NomeSexo ns : listaMasculina){
            System.out.println(ns.getNome() + " (" + ns.getSexo() + ")");
        }

        System.out.println("\nLista Feminina:");
        for (NomeSexo ns : listaFeminina) {
            System.out.println(ns.getNome() + " (" + ns.getSexo() + ")");
        }


    }
}