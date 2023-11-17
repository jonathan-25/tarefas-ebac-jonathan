
public class MovCasa {



    public static void main(String[] args) {


        /**
         * @author  Jonathan Salgueiro
         *  Criei uma ideia de um app simples em que o dono de uma casa pode facilmente abir e fechar portas.
         *
         *
         * @since version1
         */

        JanelaSala janelaSala = new JanelaSala();
        PortaoFrente portaoFrente = new PortaoFrente();


        portaoFrente.setAbirPortao(1);
        portaoFrente.abirPortao();

        janelaSala.setJanela1(1);
        janelaSala.abirJanela();

        janelaSala.setJanela2(2);
        janelaSala.fecharJanela();





    }
}