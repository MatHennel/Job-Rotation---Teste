public class Teste5 {
    public static void main(String[] args) {
        String str = "rotation";
        char vet[] =  new char[str.length()];
        
        str.toCharArray();
    
       

       

       for (int i = str.length() - 1,j = 0; i >= 0; i--,j++) {
            vet[j] = str.charAt(i);
       }

       

       System.out.println(vet);

       
    }
}
