import java.util.ArrayList;
import java.util.Scanner;

public class Analise {
	public String analise() {
		Estrutura produtinhos = new Estrutura();
		
		ArrayList<String> n = produtinhos.getCodigos();
		Scanner teclado = new Scanner(System.in);
		
		int i;
		
		i = teclado.nextInt();
		
		String p = n.get(i);
		
		String origem = p.substring(0, 3);
		String destino = p.substring(3, 6);
		String loggi = p.substring(6, 9);
		String vendendor = p.substring(9, 12);
		String tproduto = p.substring(12, 15);
		
		
		
		
		return p;
	}
		
}
//int a = p.length(); 