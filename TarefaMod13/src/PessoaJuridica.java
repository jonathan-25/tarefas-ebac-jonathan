public class PessoaJuridica extends Pessoa{

    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void imprimirDados(){
        System.out.println("Dados Pessoa Juridica: " + this.getNome() + " " + this.getCNPJ());
    }



}
