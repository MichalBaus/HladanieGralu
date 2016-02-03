import java.util.Scanner;
import fight.*;

public class NaplnRoomy {
	
	private static VytvorBojovnikov obj = new VytvorBojovnikov();
	
	static int aktualnaMiestnost;
	
	static Miestnost roomy[] = new Miestnost[42];
	
	public static void naplnMiestnosti(){
		
		roomy[0] = new Miestnost (0, "Zadal si zlé èíslo");
		
		roomy[1] = new Miestnost (1, "Nachádzaš sa v stredoveku a patríš k rytierom krá¾a Artuša. Ako kadı rytier okrúhleho" + "\n"
				+ "stola si dostal príkaz h¾ada svätı grál. Dostal si echo e by sa mohol nachádza v draèej jaskyni.", 3, 2,
				"Vojdeš do jaskyne", "Nasadneš na kona a odcválaš h¾ada inde");
		
		roomy[2] = new Miestnost (2, "H¾adal si svätı grál mnoho a mnoho dní a bolo to naniè." + "\n"
				+ " Do Camelotu sa vraciaš s prázdnymi rukami.");
		
		roomy[3] = new Miestnost (3, "Vchádzaš do jaskyne (mapa). Steny sú mokré a nahrubo opracované. A je tam krysa." + "\n"
				+ " Chodba vedie pä krokov na sever a potom zatáèa do¾ava a doprava.", 4, 5, "ís do¾ava", "ís doprava", new Boj());
		
		roomy[4] = new Miestnost (4, "Zahol si do¾ava. Chodba pokraèuje devä krokov a na jej konci je miestnos." + "\n"
				+ " Zakryješ lucernu. ", 8, 12, 3, "vojs bez naèúvania", "naèúva", "vráti sa na kriovatku");
		
		roomy[5] = new Miestnost (5, "Zahol si doprava. Chodba beí len tri kroky a chodba sa opä delí. (mapa)", 6, 17, 3,
				"pokraèova rovno", "odboèi na sever", "vráti sa spä");
		
		roomy[6] = new Miestnost (6, "Chodba pokraèuje rovno. Na jej konci je nejaká miestnost'. " + "\n"
				+ "Pre istotu si zakryl lucernu plášom. ", 7, 13, 3, "vojs", "naèúva", "vráti sa radšej spä" );
		
		roomy[7] = new Miestnost (7, "Vošiel si do miestnosti bez naèúvania. Je obdåniková. (mapa) V najvzdialenejšom " + "\n"
				+ "rohu leí obrovskı hnedı medved'. Bojujete so sebou.", 4, 2, "dolava", "doprava");
		
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

