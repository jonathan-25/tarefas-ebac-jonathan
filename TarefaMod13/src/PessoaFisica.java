public class PessoaFisica extends Pessoa {

    private int CPF;

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void imprimirDados(){
        System.out.println("Dados Pessoa Fisica: " + this.getNome() + " " + this.getCPF());
    }

}
