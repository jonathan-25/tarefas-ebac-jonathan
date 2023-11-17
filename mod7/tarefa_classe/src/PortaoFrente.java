public class PortaoFrente {


    private int abirPortao;
    private int fecharPortao;

    public int getAbirPortao() {
        return abirPortao;
    }

    public void setAbirPortao(int abirPortao) {
        this.abirPortao = abirPortao;
    }

    public int getFecharPortao() {
        return fecharPortao;
    }

    public void setFecharPortao(int fecharPortao) {
        this.fecharPortao = fecharPortao;
    }

    public int abirPortao(){

        if (abirPortao == 1) {

            System.out.println("Abrindo Portão da Frente ");
        }
        return abirPortao;
    }


    public int fecharPortao(){

        if (fecharPortao == 2) {

            System.out.println("Fechando Portão da Frente ");
        }
        return abirPortao;
    }



}
