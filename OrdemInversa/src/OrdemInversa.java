public class OrdemInversa {
    public static void main(String[] args) {
        
        int count = 0;
        int[] vetor = {1, 4, 0, -1, -5};

        System.out.println("Vetor: ");
        while (count < (vetor.length)){
  
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
        
            System.out.print(vetor[i] + " ");
        }

    }
}
