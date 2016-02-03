import java.util.Scanner;
import fight.*;

public class NaplnRoomy {
	
	private static VytvorBojovnikov obj = new VytvorBojovnikov();
	
	static Miestnost aktualnaMiestnost;
	
	public static void naplnMiestnosti() {
			
		Miestnost start = new Miestnost (1, "Nach�dza� sa v stredoveku a patr� k rytierom kr�a Artu�a. Ako ka�d� rytier okr�hleho" + "\n"
				+ "stola si dostal pr�kaz h�ada� sv�t� gr�l. Dostal si echo �e by sa mohol nach�dza� v dra�ej jaskyni.");
		
		Miestnost m2 = new Miestnost (2, "H�adal si sv�t� gr�l mnoho a mnoho dn� a bolo to nani�." + "\n"
				+ " Do Camelotu sa vracia� s pr�zdnymi rukami.");
		
		Miestnost m3 = new Miestnost (3, "Vch�dza� do jaskyne (mapa). Steny s� mokr� a nahrubo opracovan�. A je tam krysa." + "\n"
				+ " Chodba vedie p� krokov na sever a potom zat��a do�ava a doprava.");
		
		Miestnost m4 = new Miestnost (4, "Zahol si do�ava. Chodba pokra�uje dev� krokov a na jej konci je miestnos�." + "\n"
				+ " Zakryje� lucernu. ");
		
		Miestnost m5 = new Miestnost (5, "Zahol si doprava. Chodba be�� len tri kroky a chodba sa op� del�. (mapa)");
		
		Miestnost m6 = new Miestnost (6, "Chodba pokra�uje rovno. Na jej konci je nejak� miestnost'. " + "\n"
				+ "Pre istotu si zakryl lucernu pl᚝om. ");
		
		Miestnost m7 = new Miestnost (7, "Vo�iel si do miestnosti bez na��vania. Je obd�nikov�. (mapa) V najvzdialenej�om " + "\n"
				+ "rohu le�� obrovsk� hned� medved'. Bojujete so sebou.");
		
		start.pridajPrechod(m2, "Nasadne� na kona a odcv�la� h�ada� inde");
		start.pridajPrechod(m3, "Vojde� do jaskyne");
		
		m3.pridajPrechod(m4, "�s� do�ava");
		m3.pridajPrechod(m5, "�s� doprava");

		m4.pridajPrechod(m3, "vr�ti� sa na kri�ovatku");
		
		m5.pridajPrechod(m6, "pokra�ova� rovno");
		m5.pridajPrechod(m3, "vr�ti� sa sp�");
		
		m6.pridajPrechod(m7, "vojs�");
		m6.pridajPrechod(m3, "vr�ti� sa rad�ej sp�");
		
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

