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
			throw new IllegalArgumentException("O grafo precisa ser criado com uma quantidade de vértices maior que 1");
		}
		this.qtdMaximaVertices = qtdVertices;
	}

	public void adicionarVertice(String rotulo) throws Exception {
		// Verificar se o vértice pode ser adicionado
		if (qtdAtualVertices > qtdMaximaVertices - 1) {
			throw new Exception("Error: Quantidade máxima alcançada: " + qtdMaximaVertices);
		}
		// Se o vértice puder ser adionado no grafo
		// Criar o vértice
		Vertice novoVertice = new Vertice(rotulo);
		//Mapear rótulos em indices
		this.rotuloEmIndices.put(rotulo, qtdAtualVertices);
		// Adicionar o vértice na lista de vétices
		this.vertices.add(novoVertice);
		// Somar a quantidade atual de vétices + 1
		this.qtdAtualVertices++;
	}
	
	public Vertice getVertice(String rotulo) throws Exception {
		if(!existeVertice(rotulo)) {
			throw new Exception("Informe um vértice válido!");
		}
		int indice = this.rotuloEmIndices.get(rotulo);
		return this.vertices.get(indice);
	}
	
	public List<Vertice> getAdjacencias(String rotulo) throws Exception{
		if(!existeVertice(rotulo)) {
			throw new Exception("Informe um vértice válido!");
		}
		int indice = this.rotuloEmIndices.get(rotulo);
		return matrizAdjacencia.getAdjacencias(indice);
	}
	
	public void conectaVertices(String rotuloVerticeInicial, String rotuloVerticeFinal) throws Exception{
		if(!existeVertice(rotuloVerticeInicial) || !existeVertice(rotuloVerticeFinal)) {
			throw new Exception("Informe rótulos válidos.");
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
