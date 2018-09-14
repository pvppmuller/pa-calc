 package pa.app;

import java.util.Scanner;
import java.util.logging.Logger;

public class App 
{
	private static Logger logger = Logger.getLogger(App.class.getName());
	
	
    // --------------- Metodo principal
    public static void main (String args[]){ 
        //criando um objeto c a apartir do metodo calc  
        //Calc c = new Calc();  
        //declarando as varíaveis  
        int opcao = 5;  
        int num1;  
        int num2;  
		Scanner input = new Scanner(System.in);
		logger.info("-Escolha uma opção-");  
		logger.info("1. Soma");    
		logger.info("2. Subtracao");    
		logger.info("3. Multiplicacao");    
		logger.info("4. Divisao");    
        System.out.println("0. Sair");    
        System.out.println("Operação: ");    
        opcao = input.nextInt();  
        while (opcao != 0) {
			Scanner input1 = new Scanner(System.in);    
			logger.info("Qual o primeiro numero: ");  
			num1 = input1.nextInt();  
			logger.info("Qual o segundo numero: ");  
			num2 = input1.nextInt();
			if ( opcao == 1 ) {
				int operacao = som(num1, num2);
                System.out.printf("\nO resultado da soma é: %d\n", operacao);  
                break;  
            }  
            else if (opcao == 2) { 
				int operacao = sub(num1, num2);
				System.out.printf("\nO resultado da subtração é: %d\n", operacao);  
				break;  
			}  
			else if (opcao == 3) {
				int operacao = mult(num1, num2); 
				System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);    
				break;  
			}  
			else if (opcao == 4) {  
				int operacao = div(num1, num2);  
				System.out.printf("\nO resultado da divisão é: %d\n", operacao);   
				break;  
			}  
			else{  
				System.out.println("????");  
				break;  
			}      
        } // fim do while - usuario optou por sair
    }  // fim do metodo principal

    /*Declaração dos métodos*/  
    public static int som(int num1, int num2) {
        return num1 + num2;
    }  
    public static int sub(int num1, int num2){
        return num1 - num2;
    }  
    public static int div(int num1,int num2){
        return num1 / num2;
    }  
    public static int mult(int num1, int num2){
        return num1 * num2;
    }  
}

