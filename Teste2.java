import java.util.Random;

public class Teste2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int fibo = aleatorio.nextInt(100);
        Boolean result = false;
        
        

        

        int soma1 = 0;
        int soma2 = 1;
        int soma3 = 1;

        System.out.print("Sequencia de fibo: 0 , 1");

        while(soma3 <= 144){

            System.out.print(" , " + soma3  );
            soma1 = soma2;
            soma2 = soma3;
            soma3 = soma1 + soma2; 

            if(soma3 == fibo) result = true;
            else if(fibo == 0) result = true;
            else if(fibo == 1) result = true;

            
        }

        System.out.println("\nNumero informado: " + fibo);

        if(result){
            System.out.println("O numero informado e da sequencia de fibo");
        }else{
            System.out.println("O numero informado nao e de fibo");
        }

        
    }
}
