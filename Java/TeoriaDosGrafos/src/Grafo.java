import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {

	private int qtdMaximaVertices;
	private int qtdAtualVertices = 0;
	private List<Vertice> vertices = new ArrayList<>();
	private Map<String, Integer> rotuloEmIndices = new HashMap<>();
	
	private MatrizAdjacencia matrizAdjacencia;

	public Grafo(int qtdVertices) throws IllegalArgumentException {
		if (qtdVertices <= 0) {
			throw new IllegalArgumentException("O grafo precisa ser criado com uma quantidade de v�rtices maior que 1");
		}
		this.qtdMaximaVertices = qtdVertices;
	}

	public void adicionarVertice(String rotulo) throws Exception {
		// Verificar se o v�rtice pode ser adicionado
		if (qtdAtualVertices > qtdMaximaVertices - 1) {
			throw new Exception("Error: Quantidade m�xima alcan�ada: " + qtdMaximaVertices);
		}
		// Se o v�rtice puder ser adionado no grafo
		// Criar o v�rtice
		Vertice novoVertice = new Vertice(rotulo);
		//Mapear r�tulos em indices
		this.rotuloEmIndices.put(rotulo, qtdAtualVertices);
		// Adicionar o v�rtice na lista de v�tices
		this.vertices.add(novoVertice);
		// Somar a quantidade atual de v�tices + 1
		this.qtdAtualVertices++;
	}
	
	public Vertice getVertice(String rotulo) throws Exception {
		if(!existeVertice(rotulo)) {
			throw new Exception("Informe um v�rtice v�lido!");
		}
		int indice = this.rotuloEmIndices.get(rotulo);
		return this.vertices.get(indice);
	}
	
	public List<Vertice> getAdjacencias(String rotulo) throws Exception{
		if(!existeVertice(rotulo)) {
			throw new Exception("Informe um v�rtice v�lido!");
		}
		int indice = this.rotuloEmIndices.get(rotulo);
		return matrizAdjacencia.getAdjacencias(indice);
	}
	
	public void conectaVertices(String rotuloVerticeInicial, String rotuloVerticeFinal) throws Exception{
		if(!existeVertice(rotuloVerticeInicial) || !existeVertice(rotuloVerticeFinal)) {
			throw new Exception("Informe r�tulos v�lidos.");
		}
		criarMatrizAdjacencia();
		int indiceVerticeInicial = this.rotuloEmIndices.get(rotuloVerticeInicial);
		int indiceVerticeFinal = this.rotuloEmIndices.get(rotuloVerticeFinal);
		this.matrizAdjacencia.conectarVertices(indiceVerticeInicial, indiceVerticeFinal);
	}
	
	private void criarMatrizAdjacencia() {
		if(matrizAdjacencia == null) {
			this.matrizAdjacencia = new MatrizAdjacencia(new ArrayList<>(vertices));
		}
	}

	private boolean existeVertice(String rotulo) {
		return this.rotuloEmIndices.get(rotulo) != null ? true : false;
	}
	
	public void imprimindo() {
		matrizAdjacencia.imprimirMatriz();
	}
	
	public void ordem() {
		System.out.println("");
		System.out.print("Ordem: ");
		System.out.print(qtdAtualVertices);
	}
	
	public void tamanho() {
		matrizAdjacencia.ttamanho();
		
		
	}

}
