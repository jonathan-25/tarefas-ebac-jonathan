import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner s = new Scanner(System.in);


        double nota1;
        double nota2;
        double nota3;
        double nota4;


        System.out.printf("Por Favor digite a nota da primeira prova");
        nota1 = s.nextDouble();

        System.out.printf("Por Favor digite a nota da segunda prova");
        nota2 = s.nextDouble();

        System.out.printf("Por Favor digite a nota da terceira prova");
        nota3 = s.nextDouble();

        System.out.printf("Por Favor digite a nota da quarta prova");
        nota4 = s.nextDouble();

        double media = calculoMedia(nota1,nota2,nota3,nota4);

            if (media >=7){
                System.out.println("Aluno Aprovado !");
            } else if (media >=5 && media <7 ) {
                System.out.println("Aluno em recuperacao ");
            }else {
                System.out.println("O aluno foi reprovado");
            }

    }



    public static double calculoMedia(double nota1 ,double nota2 ,double nota3 ,double nota4){

        return ((nota1 + nota2 + nota3 + nota4) /4);
    }




}