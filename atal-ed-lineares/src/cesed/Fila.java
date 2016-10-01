package cesed;

public class Fila {

	private int maximo;
    private long[] filaArray;
    private int proximo;
    private int anterior;
    private int nValores;

    public Fila(int size) {
        maximo = size;
        filaArray = new long[maximo];
        proximo = 0;
        anterior = -1;
        nValores = 0;
    }

    public void inserir(long j) {
        if (anterior == maximo-1)
            anterior = -1;
            filaArray[++anterior] = j;
            nValores++;
    }

    public long remover() {
        long temp = filaArray[proximo++];
        if (proximo == maximo)
            proximo = 0;
            nValores--;
            return temp;
    }

    public long isProximo() {
        return filaArray[proximo];
    }

}