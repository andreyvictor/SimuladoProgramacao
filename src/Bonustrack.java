import java.util.Scanner;

public class Bonustrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double precoUN, precoParcial, precoFinal, valorDesconto;
        System.out.print("Informe o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Informe a quantidade deste determinado produto: ");
        quantidade = sc.nextInt();
        if (codigo <= 10) {
            precoUN = 10;
            precoParcial = precoUN * quantidade;
            if
            (precoParcial <= 250) {
                valorDesconto = precoParcial * 0.05;
                precoFinal = precoParcial - precoParcial * 0.05;
            } else if (precoParcial > 250 && precoParcial <= 500) {
                valorDesconto = precoParcial * 0.1;
                precoFinal = precoParcial - precoParcial * 0.10;
            } else {
                valorDesconto = precoParcial * 0.15;
                precoFinal = precoParcial - precoParcial * 0.15;

            }
            System.out.println("O valor unitário é: " + precoUN);
            System.out.println("O valor total da nota sem desconto é de: " + precoParcial);
            System.out.println("O valor do desconto é: " + valorDesconto);
            System.out.println("O valor final é de : " + precoFinal);


        }else if (codigo > 10 && codigo <= 20) {
            precoUN = 15;
            precoParcial = precoUN * quantidade;
            if
            (precoParcial <= 250) {
                valorDesconto = precoParcial * 0.05;
                precoFinal = precoParcial - precoParcial * 0.05;
            } else if (precoParcial > 250 && precoParcial <= 500) {
                valorDesconto = precoParcial * 0.1;
                precoFinal = precoParcial - precoParcial * 0.10;
            } else {
                valorDesconto = precoParcial * 0.15;
                precoFinal = precoParcial - precoParcial * 0.15;

            }
            System.out.println("O valor unitário é: " + precoUN);
            System.out.println("O valor total da nota sem desconto é de: " + precoParcial);
            System.out.println("O valor do desconto é: " + valorDesconto);
            System.out.println("O valor final é de : " + precoFinal);

        }else if (codigo > 20 && codigo <= 30) {
            precoUN = 20;
            precoParcial = precoUN * quantidade;
            if
            (precoParcial <= 250) {
                valorDesconto = precoParcial * 0.05;
                precoFinal = precoParcial - precoParcial * 0.05;
            } else if (precoParcial > 250 && precoParcial <= 500) {
                valorDesconto = precoParcial * 0.1;
                precoFinal = precoParcial - precoParcial * 0.10;
            } else {
                valorDesconto = precoParcial * 0.15;
                precoFinal = precoParcial - precoParcial * 0.15;

            }
            System.out.println("O valor unitário é: " + precoUN);
            System.out.println("O valor total da nota sem desconto é de: " + precoParcial);
            System.out.println("O valor do desconto é: " + valorDesconto);
            System.out.println("O valor final é de : " + precoFinal);

        }else{
                        precoUN = 30;
                        precoParcial = precoUN * quantidade;
                        if
                        (precoParcial <= 250) {
                            valorDesconto = precoParcial * 0.05;
                            precoFinal = precoParcial - precoParcial * 0.05;
                        } else if (precoParcial > 250 && precoParcial <= 500) {
                            valorDesconto = precoParcial * 0.1;
                            precoFinal = precoParcial - precoParcial * 0.10;
                        } else {
                            valorDesconto = precoParcial * 0.15;
                            precoFinal = precoParcial - precoParcial * 0.15;

                        }
            System.out.println("O valor unitário é: " + precoUN);
            System.out.println("O valor total da nota sem desconto é de: " + precoParcial);
            System.out.println("O valor do desconto é: " + valorDesconto);
            System.out.println("O valor final é de : " + precoFinal);
                    }
                }
            }


