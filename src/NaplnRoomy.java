import java.util.Scanner;
import fight.*;

public class NaplnRoomy {
	
	private static VytvorBojovnikov obj = new VytvorBojovnikov();
	
	static int aktualnaMiestnost;
	
	static Miestnost roomy[] = new Miestnost[42];
	
	public static void naplnMiestnosti(){
		
		roomy[0] = new Miestnost (0, "Zadal si zl� ��slo");
		
		roomy[1] = new Miestnost (1, "Nach�dza� sa v stredoveku a patr� k rytierom kr�a Artu�a. Ako ka�d� rytier okr�hleho" + "\n"
				+ "stola si dostal pr�kaz h�ada� sv�t� gr�l. Dostal si echo �e by sa mohol nach�dza� v dra�ej jaskyni.", 3, 2,
				"Vojde� do jaskyne", "Nasadne� na kona a odcv�la� h�ada� inde");
		
		roomy[2] = new Miestnost (2, "H�adal si sv�t� gr�l mnoho a mnoho dn� a bolo to nani�." + "\n"
				+ " Do Camelotu sa vracia� s pr�zdnymi rukami.");
		
		roomy[3] = new Miestnost (3, "Vch�dza� do jaskyne (mapa). Steny s� mokr� a nahrubo opracovan�. A je tam krysa." + "\n"
				+ " Chodba vedie p� krokov na sever a potom zat��a do�ava a doprava.", 4, 5, "�s� do�ava", "�s� doprava", new Boj());
		
		roomy[4] = new Miestnost (4, "Zahol si do�ava. Chodba pokra�uje dev� krokov a na jej konci je miestnos�." + "\n"
				+ " Zakryje� lucernu. ", 8, 12, 3, "vojs� bez na��vania", "na��va�", "vr�ti� sa na kri�ovatku");
		
		roomy[5] = new Miestnost (5, "Zahol si doprava. Chodba be�� len tri kroky a chodba sa op� del�. (mapa)", 6, 17, 3,
				"pokra�ova� rovno", "odbo�i� na sever", "vr�ti� sa sp�");
		
		roomy[6] = new Miestnost (6, "Chodba pokra�uje rovno. Na jej konci je nejak� miestnost'. " + "\n"
				+ "Pre istotu si zakryl lucernu pl᚝om. ", 7, 13, 3, "vojs�", "na��va�", "vr�ti� sa rad�ej sp�" );
		
		roomy[7] = new Miestnost (7, "Vo�iel si do miestnosti bez na��vania. Je obd�nikov�. (mapa) V najvzdialenej�om " + "\n"
				+ "rohu le�� obrovsk� hned� medved'. Bojujete so sebou.", 4, 2, "dolava", "doprava");
		
	}
	
	static void zavolajMiestnosti () throws Exception{
		
		Bojovnik hrdina = obj.getBojovnik(TypBojovnika.Hrdina);
		
		while (true) {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			
				
			if (roomy[aktualnaMiestnost].validujVyber(num)) {
									
				if (num < 1 || num > 42) System.out.println (roomy[0]);
			
				else {
					System.out.println(roomy[num]);
					
					Boj b = roomy[num].getBoj();
					if (b != null)	{
						b.bitka(hrdina, obj.getBojovnik(TypBojovnika.Krysa));
					}
					
					aktualnaMiestnost = num;
				}
			
				if (num == 2) break;
			}
			
			else {
				System.out.println(roomy[0]);
			}
		}
			
	}

	static void zaciatok(){
		System.out.print(roomy[1]);
		aktualnaMiestnost = 1;
	}
}

