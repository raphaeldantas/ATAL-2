package cesed;

public class Deque {
	
	private int[] DeqArrayList;
	private int inicio;
	private int fim;
	private int nValores;
	
	public Deque(int tamanho){
		DeqArrayList = new int[tamanho];
		inicio = fim = -1;
		nValores = 0;
	}
	
	public boolean DeqVazio(){
		return ((inicio == -1) && (fim == -1));
	}
	
	public boolean DeqCheio(){
		return (DeqArrayList.length == nValores);
	}
	
		
	public boolean inserindoFim(int valor){
		if(!DeqCheio()){
			fim = (fim + 1) % DeqArrayList.length;
			DeqArrayList[fim]= valor;
			if (inicio == -1){
				inicio = 0;
			}
			nValores++;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean inserindoInicio(int valor){
		if(!DeqCheio()){
			inicio = (inicio + 1) % DeqArrayList.length;
			DeqArrayList[inicio]= valor;
			if (fim == -1){
				fim = 0;
			}
			nValores++;
			return true;
		}else{
			return false;
		}
	}
	
		
	public boolean removerFim(){
		if(!DeqVazio()){
			if(inicio==fim){
				inicio=fim=-1;
			}else{
				fim=(fim+1) % DeqArrayList.length; 
			}
			nValores--;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean removerInicio(){
		if(!DeqVazio()){
			if(inicio==fim){
				inicio=fim=-1;
			}else{
				inicio=(inicio+1) % DeqArrayList.length; 
			}
			nValores--;
			return true;
		}else{
			return false;
		}
	}
	
}