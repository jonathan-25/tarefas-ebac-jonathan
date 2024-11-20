//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {

        PessoaFisica pessoaF = new PessoaFisica();
        pessoaF.setNome("Jonathan Salgueiro");
        pessoaF.setCPF(12345679);

        PessoaJuridica pessoaJ = new PessoaJuridica();
        pessoaJ.setNome("Supermercado");
        pessoaJ.setCNPJ("13549845631380001-76");


        pessoaF.imprimirDados();
        pessoaJ.imprimirDados();

    }

}

