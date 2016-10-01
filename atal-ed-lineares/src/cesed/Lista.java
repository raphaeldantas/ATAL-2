package cesed;

public class Lista {
	static final int DEFAULT_VOLUME = 50;
	Object[] array;
	int numero;
	int volume;

	public Lista() {
		this(DEFAULT_VOLUME);
	}

	public Lista(int volume) {
		this.volume = volume;
		array = new Object[volume];
		numero = 0;
	}

	public int firstIndexOf() {
		String text = "abc";
		int l = -1;
		try {
			for (int i = 0; i < numero; i++) {
				l++;
				if (array[i].equals(text)) {
					break;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("lista esta vazia");
		}
		return l;

	}

	public void add(Object a) {
		array[numero] = a;
		numero++;

	}

	public Object get(int index) {
		if (index < 0 || index >= numero) {
			return "lista";
		}
		return array[index];
	}


	public void removeUltimoElemento() {

		try {
			numero--;
			array[numero] = null;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("lista esta vazia");
		}
	}


}