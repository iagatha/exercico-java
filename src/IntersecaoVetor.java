import java.util.Arrays;

public class IntersecaoVetor {


    public static void main(String[] args) {
        int []a = {7,2,5,8,4};
        int []b = {4,2,9,5};
        int []c = intersecao(a, b);

        System.out.println(Arrays.asList(c));
    }

    private static int[] intersecao(int[] a, int[] b) {
        int []aux = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) 
            for(int j = 0;j < b.length; j++){
                if(a[i] == b[j]){
                    aux[k++] = a[i];
                }
            }
            int []c = new int[k];

            for(int i = 0;i < k; i++)
                c[i] = aux[i];
            
             
            return c;
          
        
        
    }
}
