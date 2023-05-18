import java.util.ArrayList;
import java.util.List;

public class MatrizAdjacencia {
	
	private int[][] matriz;
	private int qtdVertices;
	private List<Vertice> vertices;
	
	private final int loopValue = 2;
	private final int normalValue = 1;
	
	public MatrizAdjacencia(List<Vertice> vertices) {
		this.vertices = vertices;
		this.qtdVertices = vertices.size();
		matriz = new int[qtdVertices][qtdVertices];
	}
	
	public void conectarVertices(int indiceVerticeInicial, int indiceVerticeFinal) {
		Vertice verticeInicial = this.vertices.get(indiceVerticeInicial);
		Vertice verticeFinal = this.vertices.get(indiceVerticeFinal);
		if(indiceVerticeInicial == indiceVerticeFinal) {
			verticeInicial.addGrau(loopValue);
			matriz[indiceVerticeInicial][indiceVerticeInicial] = 1;
		}else {
			matriz[indiceVerticeInicial][indiceVerticeFinal] = 1;
			verticeInicial.addGrau(normalValue);
			matriz[indiceVerticeFinal][indiceVerticeInicial] = 1;
			verticeFinal.addGrau(normalValue);
		}
	}
	
	public List<Vertice> getAdjacencias(int indiceVertice){
		int linha = indiceVertice;
		List<Vertice> adjacentes = new ArrayList<>();
		for(int j = 0; j < vertices.size(); j++) {
			if(matriz[linha][j] == 1) {
				Vertice tempVertice = this.vertices.get(j);
				adjacentes.add(tempVertice);
			}
		}
		
		return adjacentes;
	}
	
	public void imprimirMatriz (){
		int verticecol;
		int verticelin;
		System.out.print("Matriz de Adjacência");
		for(verticecol = 0; verticecol<vertices.size(); verticecol++) {
			System.out.println("");
			for(verticelin = 0; verticelin<vertices.size(); verticelin++) {
				System.out.print(matriz[verticecol][verticelin] + "  ");
				
			}
		}
	}
	
	public void ttamanho (){
		int verticecol;
		int verticelin;
		int t = 1;
		for(verticecol = 0; verticecol<vertices.size(); verticecol++) {
			for(verticelin = 0; verticelin<vertices.size(); verticelin++) {
				if(matriz[verticecol][verticelin] == 1) {
					t++;
				}
				
			}
		}
		int finalt = t/2;
		System.out.print("Tamanho: ");
		System.out.print(finalt);
	}
	
}
