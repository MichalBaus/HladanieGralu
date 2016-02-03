import java.util.ArrayList;

public class Miestnost {
	
	private int cislo;
	
	private String text;
	
	private ArrayList<Prechod> prechody = new ArrayList<Prechod>();

	public Miestnost(int cislo, String text) {
		this.cislo = cislo;
		this.text = text;
	}
	
	void pridajPrechod(Miestnost m, String popis){
		Prechod p = new Prechod(m, popis);
		prechody.add(p);
	}

	@Override
	public String toString() {
		
		String navratovyText = cislo + ": " + text + "\n"; 
		
		if (!prechody.isEmpty()) {
			
			navratovyText += "Chceš: " + "\n";	
			for (int i = 0; i < prechody.size(); i++) {
				
				Prechod p = prechody.get(i);
				navratovyText += i + ": " + p.getPopis() + "\n";
			}
		}
		
		return navratovyText;
	}
	
	public Miestnost prejdiDoMiestnosti(int volba) {
		
		if (volba < 0)
			return null;
		
		if (prechody.isEmpty())
			return null;
		
		if (volba >= prechody.size())
			return null;
		
		Prechod p = prechody.get(volba);
		
		return p.getMiestnost();
	}
}
	