import java.util.List;

public class Principal {
	

	public static void main(String[] args) {
		
		
		
		Grafo grafo = new Grafo(4);
		
		try {
			grafo.adicionarVertice("v1");
			grafo.adicionarVertice("v2");
			grafo.adicionarVertice("v3");
			grafo.adicionarVertice("v4");
			
			grafo.conectaVertices("v1", "v2");
			grafo.conectaVertices("v2", "v2");
			grafo.conectaVertices("v2", "v3");
			grafo.conectaVertices("v2", "v4");
			grafo.conectaVertices("v3", "v4");
			
			System.out.println("Grau v1: " + grafo.getVertice("v1").getGrau());
			System.out.println("Grau v2: " + grafo.getVertice("v2").getGrau());
			System.out.println("Grau v3: " + grafo.getVertice("v3").getGrau());
			System.out.println("Grau v4: " + grafo.getVertice("v4").getGrau());
			
			System.out.println("Vizinhos de v1");
			for(Vertice vertice : grafo.getAdjacencias("v1")) {
				System.out.print(vertice.getRotulo() + ", ");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		grafo.ordem();
		System.out.println("");
		grafo.tamanho();
		
		System.out.println("\n");
		grafo.imprimindo();
		
		
	}

}
