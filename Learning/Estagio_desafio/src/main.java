import java.util.ArrayList;
import java.util.Scanner;


public class main {
	public ArrayList<String> produtos = new ArrayList<String>();
	public ArrayList<String> estrutura() {
		
		
		produtos.add("288355555123888");
		produtos.add("335333555584333");
		produtos.add("223343555124001");
		produtos.add("002111555874555");
		produtos.add("111188555654777");
		
		return produtos;
	}
	
	public int analise(){
		
		int n = produtos.size();

		for (int i=0; i<n; i++) {
			String coleta = produtos.get(i);
			String origem = coleta.substring(0, 3);
			String destino = coleta.substring(3, 6);
			String loggi = coleta.substring(6, 9);
			String vendendor = coleta.substring(9, 12);
			String tproduto = coleta.substring(12, 15);
			
			int convertor1 = Integer.parseInt(origem);
			if(convertor1 >= 201 && convertor1 <= 299) {
				int CO = 0;
				CO++;
				return CO;
			}
			else if(convertor1 >= 300 && convertor1 <= 399) {
				int NORD = 0;
				NORD++;
				return NORD;
			}
			else if(convertor1 >= 400 && convertor1 <= 499) {
				int NORT = 0;
				NORT++;
				return NORT;
			}
			else if(convertor1 >= 001 && convertor1 <= 99) {
				int SUD = 0;
				SUD++;
				return SUD;
			}
			else if(convertor1 >= 100 && convertor1 <= 199) {
				int SUL = 0 ;
				SUL++;
				return SUL;
			}
			
			int convertor2 = Integer.parseInt(destino);
			
			if(convertor2 >= 201 && convertor2 <= 299) {
				
			}
			else if(convertor2 >= 300 && convertor2 <= 399) {
				
			}
			else if(convertor2 >= 400 && convertor2 <= 499) {
				
			}
			else if(convertor2 >= 001 && convertor2 <= 99) {
				
			}
			else if(convertor2 >= 100 && convertor2 <= 199) {
				
			}
			
			int conversor3 = Integer.parseInt(vendendor);
			
			if(conversor3 ==  367) {
				System.out.println("CPF INATIVO!");
			}
			
			int conversor4 = Integer.parseInt(tproduto);
			
			if(conversor4 == 001) {
				
			}
			else if(conversor4 == 111) {
				
			}
			else if(conversor4 == 333) {
				
			}
			else if(conversor4 == 555) {
				
			}
			else if(conversor4 == 888) {
				if(convertor1 >= 201 && convertor1 <= 299){
					System.out.println("Não é possível despachar joias com região de origem registrada como Centro-Oeste");
				}
			}
			else {
				System.out.println("A Loggi não envia este tipo de produto!");
			}
			
		}
		return 1;
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		
	}
}
/* A lista de pacotes deve ser separado por arrays */
/* A montagem da estrutura que organiza os dados deve ser feita em apanas uma página */

/*ArrayList<String> produtos = new ArrayList<String>();
		
		produtos.add("288355555123888");
		produtos.add("335333555584333");
		produtos.add("223343555124001");
		produtos.add("002111555874555");
		produtos.add("111188555654777");
		
		int n = produtos.size();
		
		for (int i=0; i<n; i++) {
			String coleta = produtos.get(i);
			String origem = coleta.substring(0, 3);
			String destino = coleta.substring(3, 6);
			String loggi = coleta.substring(6, 9);
			String vendendor = coleta.substring(9, 12);
			String tproduto = coleta.substring(12, 15);
			
			int convertor1 = Integer.parseInt(origem);
			if(convertor1 >= 201 && convertor1 <= 299) {
				
			}
			else if(convertor1 >= 300 && convertor1 <= 399) {
				
			}
			else if(convertor1 >= 400 && convertor1 <= 499) {
				
			}
			else if(convertor1 >= 001 && convertor1 <= 99) {
				
			}
			else if(convertor1 >= 100 && convertor1 <= 199) {
				
			}
			
			int convertor2 = Integer.parseInt(destino);
			
			if(convertor2 >= 201 && convertor2 <= 299) {
				
			}
			else if(convertor2 >= 300 && convertor2 <= 399) {
				
			}
			else if(convertor2 >= 400 && convertor2 <= 499) {
				
			}
			else if(convertor2 >= 001 && convertor2 <= 99) {
				
			}
			else if(convertor2 >= 100 && convertor2 <= 199) {
				
			}
			
			int conversor3 = Integer.parseInt(vendendor);
			
			if(conversor3 ==  367) {
				System.out.println("CPF INATIVO!");
			}
			
			int conversor4 = Integer.parseInt(tproduto);
			
			if(conversor4 == 001) {
				
			}
			else if(conversor4 == 111) {
				
			}
			else if(conversor4 == 333) {
				
			}
			else if(conversor4 == 555) {
				
			}
			else if(conversor4 == 888) {
				if(convertor1 >= 201 && convertor1 <= 299){
					System.out.println("Não é possível despachar joias com região de origem registrada como Centro-Oeste");
				}
			}
			else {
				System.out.println("A Loggi não envia este tipo de produto!");
			}
		}
 */

/*
Scanner teclado = new Scanner(System.in);

int i;

i = teclado.nextInt();

String coleta = produtos.get(i);
String origem = coleta.substring(0, 3);
String destino = coleta.substring(3, 6);
String loggi = coleta.substring(6, 9);
String vendendor = coleta.substring(9, 12);
String tproduto = coleta.substring(12, 15);

//Esse é para o CPF INATIVO!
	int conversor3 = Integer.parseInt(vendendor);
		
	if(conversor3 ==  367) {
		System.out.println("CPF INATIVO!");
	}

//Essa corrente de if's é para determinar a região de origem
int convertor1 = Integer.parseInt(origem);
if(convertor1 >= 201 && convertor1 <= 299) {
	int CO = 0;
	
}
else if(convertor1 >= 300 && convertor1 <= 399) {
	
}
else if(convertor1 >= 400 && convertor1 <= 499) {
	
}
else if(convertor1 >= 001 && convertor1 <= 99) {
	
}
else if(convertor1 >= 100 && convertor1 <= 199) {
	
}

//Essa corrente de if's é para determinar a região de destino
int convertor2 = Integer.parseInt(destino);

if(convertor2 >= 201 && convertor2 <= 299) {
	
}
else if(convertor2 >= 300 && convertor2 <= 399) {
	
}
else if(convertor2 >= 400 && convertor2 <= 499) {
	
}
else if(convertor2 >= 001 && convertor2 <= 99) {
	
}
else if(convertor2 >= 100 && convertor2 <= 199) {
	
}


//Diz o tipo do produto
int conversor4 = Integer.parseInt(tproduto);

if(conversor4 == 001) {
	
}
else if(conversor4 == 111) {
	
}
else if(conversor4 == 333) {
	
}
else if(conversor4 == 555) {
	
}
else if(conversor4 == 888) {
	if(convertor1 >= 201 && convertor1 <= 299){
		System.out.println("Não é possível despachar joias com região de origem registrada como Centro-Oeste");
	}
}
else {
	System.out.println("A Loggi não envia este tipo de produto!");
}
*/