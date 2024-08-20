import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro.: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parametro.: ");
        int parametroDois = scanner.nextInt();

        try{

            contar(parametroUm, parametroDois);  
            
        } catch(ParametrosInvalidosException e){
            
            System.out.println("O segundo parametro não pode ser maior que o primeiro.");
            
        }
        scanner.close();
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        
        int contagem;

        if (parametroDois < parametroUm){
            throw  new ParametrosInvalidosException("O segundo parametro não pode ser maior que o primerio.");
        }else{
           contagem = parametroDois - parametroUm;
        }
        for(int cont = 0; cont <= contagem; cont++){
            System.out.println("Imprimindo o número " + cont);
        }
    }
    
  
   
}
