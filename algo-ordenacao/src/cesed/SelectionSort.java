package cesed;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		SelectionSort sort = new SelectionSort();

		int[] arraySelectionFor = { 7, 6, 8, 9, 4, 0, 1, 3, 5, 2 };
		sort.selectionSortFor(arraySelectionFor);

		}
	public void selectionSortFor(int array[]) {

		System.out.println(Arrays.toString(array));
		int decrementa, aux;

		for (int i = 0; i < array.length - 1; i++) {
			decrementa = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[decrementa]) {
					decrementa = j;
				}
			}
			aux = array[decrementa];
			array[decrementa] = array[i];
			array[i] = aux;
			System.out.println(Arrays.toString(array));
		}
	}
}
