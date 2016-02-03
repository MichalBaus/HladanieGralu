package fight;

import java.util.HashMap;
import java.util.Map;

public class VytvorBojovnikov {
	
	private Map<TypBojovnika, Bojovnik> bojovnici = new HashMap<TypBojovnika, Bojovnik>();
	
	public VytvorBojovnikov(){
		naplnBojovnikov();
	}

	private void naplnBojovnikov(){
		bojovnici.put(TypBojovnika.Hrdina, new Bojovnik(1, 22, 5, 7));
		bojovnici.put(TypBojovnika.Medved, new Bojovnik(2, 5, 7, 6));
		bojovnici.put(TypBojovnika.Netopier, new Bojovnik(2, 3, 3, 2));
		bojovnici.put(TypBojovnika.Kostlivec, new Bojovnik(2, 9, 6, 8));
		bojovnici.put(TypBojovnika.Krysa, new Bojovnik(2, 3, 5, 6));
	}
	
	public Bojovnik getBojovnik(TypBojovnika typ) throws Exception{
		Bojovnik b = bojovnici.get(typ);
		
		if (b == null)
			throw new Exception("Bojovnik je null. Pravdepodobne si zabudol pridat parametre noveho bojovnika");
		
		return bojovnici.get(typ);
	}
}
