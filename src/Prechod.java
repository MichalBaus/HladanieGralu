
public class Prechod {

	private Miestnost miestnost;
	
	private String popis;

	public Prechod(Miestnost miestnost, String popis) {
		this.miestnost = miestnost;
		this.popis = popis;
	}

	public Miestnost getMiestnost() {
		return miestnost;
	}

	public String getPopis() {
		return popis;
	}
}
