package exemplos.curtocircuito;

public class CurtoCircuito {

	public static void main(String[] args) {
		int a = 5;
		if(++a > 5 || ++a > 6){
			a++; 
		}
		System.out.println("a="+a);
		
		int b = 5;
		if(++b > 5 | ++b > 6){
			b++; 
		}
		System.out.println("b="+b);
	}
}
