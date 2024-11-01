



public class NomeSexo implements Comparable<NomeSexo> {

    private String nome;
    private String sexo;




    public NomeSexo(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "NomeSexo{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }


    @Override
    public int compareTo(NomeSexo o) {
        return 0;
    }
}
