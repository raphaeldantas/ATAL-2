package cesed;


public class Pilha {
	private int tamanhoMaximo;
    private long[] pilhaArray;
    private int top;

    public Pilha(int s) {
        tamanhoMaximo = s;
        pilhaArray = new long[tamanhoMaximo];
        top = - 1;
    }

    public void push(long j) {
        pilhaArray[++top] = j;
    }


    public boolean isVazio() {
        return (top == -1);
    }

    public boolean Todos() {
        return (top == tamanhoMaximo-1);
    }

}