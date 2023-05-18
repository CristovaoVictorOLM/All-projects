
public class Vertice {

	private String rotulo;
	private int grau;

	public Vertice(String rotulo) {
		this.rotulo = rotulo;
	}

	public String getRotulo() {
		return rotulo;
	}

	public int getGrau() {
		return grau;
	}

	public void addGrau(int value) {
		this.grau+=value;
	}

}
