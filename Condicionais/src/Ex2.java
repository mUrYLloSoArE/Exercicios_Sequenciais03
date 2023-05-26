import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        double litros;
        double valor =0.0;
        double desc=0.0;
        double valorTotal=0.0;
        double descTotal=0.0;


        System.out.println("Digite as opções para selecionar (A- álcool ) ou (G - gasolina )");
        opcao = sc.next();
        System.out.println(" Quantos litros? ");
        litros=sc.nextDouble();


        if(opcao.equalsIgnoreCase("a")){
           if (litros <=20){

                desc=0.03;
                valor=1.90;
                valorTotal=valor*litros;
                descTotal=valorTotal*desc;

           } else if (litros >20) {

                desc=0.05;
                valor=1.90;
                valorTotal=valor*litros;
                descTotal=valorTotal*desc;

           }
        } else if(opcao.equalsIgnoreCase("g")){
            if (litros <=20){

                 desc=0.04;
                 valor=2.50;
                 valorTotal=valor*litros;
                 descTotal=valorTotal*desc;

            }else if (litros >20) {

                 desc=0.06;
                 valor=2.50;
                 valorTotal=valor*litros;
                 descTotal=valorTotal*desc;

            }
        }else {
            System.out.println(" Opção inválida! ");
        }

        System.out.printf(" Valor  Bruto a pagar -> %.2f \n" ,valor*litros);
        System.out.printf(" preço descontado -> %.2f \n" ,descTotal);
        System.out.printf(" Valor total a pagar -> %.2f \n" ,valorTotal-descTotal);

        sc.close();
    }
}
