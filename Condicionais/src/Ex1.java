import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, mes_horas,mes;

        mes=30;

        double valor_hora;

        System.out.println(" Programa que realiza o cálculo do seu salário ");

        System.out.println(" Quantas horas você trabalha por dia? ");
        horas=sc.nextInt();

        System.out.println(" Qual o valor da sua hora? ");
        valor_hora = sc.nextDouble();

        mes_horas = mes*horas;
        System.out.println(" Horas trabalhadas no mes -> " + mes_horas + " horas ");

        double salario=(horas*valor_hora)*mes;
        System.out.println(" O seu salário Bruto é -> " + " R$ " + salario );



        double inss=salario*0.1;
        double imposto=salario*0.00;
        double fgts=salario*0.11;



        double salario_liquido= salario-inss-imposto-fgts;


        if (salario_liquido <=900){
            imposto = salario*0.00;
            System.out.println("Insento de imposto ");

        } else if (salario_liquido <=1500){
            imposto = salario*0.05;

        } else if (salario_liquido <=2500){
            imposto = salario*0.1;

        } else if (salario_liquido >2500){
            imposto = salario*0.2;

        }   else {
            System.out.println("Dados invalidos! ");
        }

        System.out.println(" Desconto Imposto de Renda -> " + imposto);
        System.out.println(" Desconto INSS -> " + inss);
        System.out.println(" Desconto do FGTS -> " + fgts);
        System.out.println(" Total de descontos " + (imposto+inss+fgts));
        System.out.println(" Salário Líquido do funcionário -> " + salario_liquido);


        sc.close();
    }
}
