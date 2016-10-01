package cesed;

import java.util.Arrays;

public class InsertionSort {

	
	 public static void main(String[] args) {
	        int arr[] = {13, 8, 6, 100, 160, 2, 4, 11};

	        System.out.println("Antes :" + Arrays.toString(arr));
	        insertionSort(arr);
	        System.out.println("Depois : " + Arrays.toString(arr));
	    }

	    public static void insertionSort(int abc[]) {
	        System.out.println("Iniciando : ");
	        for (int i = 1; i < abc.length; i++) {
	            int valor = abc[i];

	            int x = i;
	            while (x > 0 && abc[x - 1] > valor) {
	                abc[x] = abc[x - 1];
	                x--;
	            }
	            abc[x] = valor;
	            System.out.println(Arrays.toString(abc));
	        }
	    }

	
}
