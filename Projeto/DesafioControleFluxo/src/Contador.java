package Projeto.DesafioControleFluxo.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(("Digite o primeiro parâmetro: "));
            int parametroUm = scanner.nextInt(); 
        
            System.out.println(("Digite o segundo parâmetro: "));
            int parametroDois = scanner.nextInt();

        try {         
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch(InputMismatchException e){
            System.err.println("Erro inesperado: Insira um número inteiro." + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro inesperado: ");
            //Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro.
            //System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        scanner.close();
    }
    static void contar(int parametroUm, int parametroDois) {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new IllegalArgumentException("O primeiro valor precisa ser maior do que o segundo.");
        }
        
        //Realizar o for para imprimir os números com base na variável contagem
        int contagem = parametroDois - parametroUm;
        
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}