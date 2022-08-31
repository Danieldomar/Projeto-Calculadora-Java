import java.util.Scanner;
public class Calc{
    //Entrada da class
    static public void main(String[] args) {
     //Entrada do teclado...
     Scanner scan=new Scanner(System.in);

     Num n1=new Num();
     Num n2=new Num();
     Num res=new Num();
     String opc="S";
    

     while(opc.equals("s") || opc.equals("S")){
        System.out.printf("%nDigite o valor 1: ");
        //Seta o valor digitado....
        n1.setValor(scan.nextInt());
        System.out.printf("%nDigite o valor 2: ");
        n2.setValor(scan.nextInt());
        res.setValor(n1.getValor()+n2.getValor());

        System.out.printf("%nA soma de %d com %d resultará em %d: " ,n1.getValor(), n2.getValor(), res.getValor());
        System.out.printf("%nDeseja somar outro valor? [s/n]: ");
        opc=scan.next();
        System.out.printf("%n%n%n%n");


     }
    }  
}