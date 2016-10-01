package cesed;


import java.util.Arrays;

public class QuickSort {


	private int separandoFor(int[] array, int begin, int end) {

		System.out.println(Arrays.toString(array));

		int pivo = array[begin];
		int e = end;

		for (int b = begin + 1; b <= e;) {
			if (array[b] <= pivo) {
				b++;
			} else if (pivo < array[e])
				e--;
			else {
				int troca = array[b];
				array[b] = array[e];
				array[e] = troca;
				System.out.println(Arrays.toString(array));
				b++;
				e--;
			}
		}
		array[begin] = array[e];
		array[e] = pivo;
		System.out.println(Arrays.toString(array));
		return e;
	}
}

