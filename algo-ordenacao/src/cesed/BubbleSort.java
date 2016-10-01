package cesed;

import java.util.Arrays;

public class BubbleSort {
	
	protected void BubbleSort(int dados[], String Tipo) {

        int x;
        for (int i = 0; i < dados.length; i++) {
                for (int j = 0; j < dados.length - 1; j++) {
                if (Tipo.equalsIgnoreCase("Subindo")) {
                    if (dados[j] > dados[j + 1]) {
                        x = dados[j];
                        dados[j] = dados[j + 1];
                        dados[j + 1] = x;                        
                    }                    
                } else if (Tipo.equalsIgnoreCase("Descendo")) {
                    if (dados[j] < dados[j + 1]) {
                        x = dados[j];
                        dados[j] = dados[j + 1];
                        dados[j + 1] = x;
                    }
                }
            }
        }
        System.out.println("Depois " + Tipo + " Sort : " + Arrays.toString(dados));
  

   
}
}