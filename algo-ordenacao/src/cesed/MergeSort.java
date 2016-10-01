package cesed;

public class MergeSort {

	   public static void mergeSort (int [] a) {
	         int [] tmp = new int[a.length];
	         mergeSort(a, tmp, 0, a.length - 1);
	     }

	    private static void mergeSort (int [] a, int [] tmp, int esquerda, int certo) {
	        if(esquerda < certo) {
	            int centro = (esquerda + certo) / 2;
	            mergeSort(a, tmp, esquerda, centro);
	            mergeSort(a, tmp, centro + 1, certo);
	            merge(a, tmp, esquerda, centro + 1, certo);
	        }
	    }

	    private static void merge (int [] a, int [] tmpArray, int lPos, int rPos, int rFim) {
	        int leftEnd = rPos - 1;
	        int tpos = lPos;
	        int elementos_n = rFim - lPos + 1;

	        while(lPos <= leftEnd && rPos <= rFim)
	            if(a[lPos] <= (a[rPos]))
	                tmpArray[tpos++] = a[lPos++];
	            else
	                tmpArray[tpos++] = a[rPos++];



	 
	      
	    }
}	