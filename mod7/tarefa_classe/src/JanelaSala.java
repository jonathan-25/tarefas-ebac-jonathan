public class JanelaSala {

    private int janela1;
    private int janela2;



    public int getJanela1() {
        return janela1;
    }

    public void setJanela1(int janela1) {
        this.janela1 = janela1;
    }

    public int getJanela2() {
        return janela2;
    }

    public void setJanela2(int janela2) {
        this.janela2 = janela2;
    }



    public void abirJanela(){

        if (janela1 == 1 ){
            System.out.println("Abrindo janela 1");
        } else if (janela2 == 1) {
            System.out.println("Abrindo janela 2");
        }

    }

    public void fecharJanela(){

        if (janela1 == 2 ){
            System.out.println("Fechando janela 1");
        } else if (janela2 == 2) {
            System.out.println("Fechando janela 2");
        }

    }


}
