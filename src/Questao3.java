import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorProduto;
        double valorFinal;
        String codigo;
        System.out.println("Informe o código do produto: ");
        codigo=scanner.next();
        System.out.println("Informe o valor do produto: ");
        valorProduto=scanner.nextDouble();
        if (valorProduto<=30){
            System.out.println("Infelizmente o produto não tem desconto!");
        }else if (valorProduto>30 && valorProduto<=100){
            valorFinal=valorProduto-valorProduto*0.1;
            System.out.print("O valor final para o produto de código " +codigo);
            System.out.print(" é: R$" +valorFinal);
        }else{
            valorFinal=valorProduto-valorProduto*0.15;
            System.out.print("O valor final para o produto de código " +codigo);
            System.out.print(" é: R$" +valorFinal);
        }
    }
}
