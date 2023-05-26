import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcao;
        int contador=0;


        System.out.println(" Será que você é inocente ou culpado? Descubra nesse jogo de perguntas e respostas: ");
        System.out.println(" Responda com S(Sim) ou N(São) ");

        System.out.println(" Telefonou para a vítima? ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("S")){
            contador++;
        }

        System.out.println(" Esteve no local do crime? ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("S")){
            contador++;
        }

        System.out.println(" Mora perto da vítima? ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("S")){
            contador++;
        }
        System.out.println(" Devia para a vítima? ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("S")){
            contador++;
        }

        System.out.println(" Já trabalhou com a vítima? ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("S")){
            contador++;
        }

       if (contador<2){
           System.out.println("INOCENTE");
       }
       else   if (contador == 2){
           System.out.println("SUSPEITO(A)");
       }
       else   if (contador == 3 || contador == 4){
           System.out.println("CÚMPLICE");
       } else if (contador == 5) {
           System.out.println("ASSASINO(A)");
       }

        sc.close();
    }
}
