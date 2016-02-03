import java.util.Scanner;
import fight.*;

public class NaplnRoomy {
	
	private static VytvorBojovnikov obj = new VytvorBojovnikov();
	
	static Miestnost aktualnaMiestnost;
	
	public static void naplnMiestnosti() {
			
		Miestnost start = new Miestnost (1, "Nachádzaš sa v stredoveku a patríš k rytierom krá¾a Artuša. Ako kadı rytier okrúhleho" + "\n"
				+ "stola si dostal príkaz h¾ada svätı grál. Dostal si echo e by sa mohol nachádza v draèej jaskyni.");
		
		Miestnost m2 = new Miestnost (2, "H¾adal si svätı grál mnoho a mnoho dní a bolo to naniè." + "\n"
				+ " Do Camelotu sa vraciaš s prázdnymi rukami.");
		
		Miestnost m3 = new Miestnost (3, "Vchádzaš do jaskyne (mapa). Steny sú mokré a nahrubo opracované. A je tam krysa." + "\n"
				+ " Chodba vedie pä krokov na sever a potom zatáèa do¾ava a doprava.");
		
		Miestnost m4 = new Miestnost (4, "Zahol si do¾ava. Chodba pokraèuje devä krokov a na jej konci je miestnos." + "\n"
				+ " Zakryješ lucernu. ");
		
		Miestnost m5 = new Miestnost (5, "Zahol si doprava. Chodba beí len tri kroky a chodba sa opä delí. (mapa)");
		
		Miestnost m6 = new Miestnost (6, "Chodba pokraèuje rovno. Na jej konci je nejaká miestnost'. " + "\n"
				+ "Pre istotu si zakryl lucernu plášom. ");
		
		Miestnost m7 = new Miestnost (7, "Vošiel si do miestnosti bez naèúvania. Je obdåniková. (mapa) V najvzdialenejšom " + "\n"
				+ "rohu leí obrovskı hnedı medved'. Bojujete so sebou.");
		
		start.pridajPrechod(m2, "Nasadneš na kona a odcválaš h¾ada inde");
		start.pridajPrechod(m3, "Vojdeš do jaskyne");
		
		m3.pridajPrechod(m4, "ís do¾ava");
		m3.pridajPrechod(m5, "ís doprava");

		m4.pridajPrechod(m3, "vráti sa na kriovatku");
		
		m5.pridajPrechod(m6, "pokraèova rovno");
		m5.pridajPrechod(m3, "vráti sa spä");
		
		m6.pridajPrechod(m7, "vojs");
		m6.pridajPrechod(m3, "vráti sa radšej spä");
		
		aktualnaMiestnost = start;
	}
	
	static void zavolajMiestnosti () throws Exception{
		
		while (true) {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			
			Miestnost dalsia = aktualnaMiestnost.prejdiDoMiestnosti(num);
			
			if (dalsia == null)
			{
				System.out.println("zadal si zle cislo");
			}
			else
			{
				aktualnaMiestnost = dalsia;
				System.out.println(aktualnaMiestnost);
			}
			
		}
			
	}

	static void start(){
		
		NaplnRoomy.naplnMiestnosti();
		
		System.out.println(aktualnaMiestnost);
	}
}

