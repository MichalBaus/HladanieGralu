package fight;

public class Boj {
	
	// comment
	
	int vyslednyUtokHrdina;
	int vyslednaObranaHrdina;
	int vyslednyUtokNepriatel;
	int vyslednaObranaNepriatel;
	int zivotHrdina;
	int zivotNepriatel;
	Bojovnik hrdina;
	Bojovnik nepriatel;
	
	public void bitka(Bojovnik h, Bojovnik n){
		hrdina = h;
		nepriatel = n;
		
		System.out.println("Zaèali ste bojova.");
		
		while (true){
			vyslednyUtokHrdina = Kocka.hodKockou() + hrdina.getUtok();
			vyslednaObranaHrdina = Kocka.hodKockou() + hrdina.getObrana();
			vyslednyUtokNepriatel = Kocka.hodKockou() + nepriatel.getUtok();
			vyslednaObranaNepriatel = Kocka.hodKockou() + nepriatel.getObrana();
			zivotHrdina = hrdina.getZivoty();
			zivotNepriatel = nepriatel.getZivoty();
			
			System.out.println("Utocis");
			
			if (hrdina.jeZivy()){
				if (nepriatel.jeZivy()){
					if (vyslednyUtokHrdina > vyslednaObranaNepriatel){
						nepriatel.zasah();
						System.out.println("Zasiahol si nepriatela");
						System.out.println("Pocet zivotov nepriatela je: " + zivotNepriatel);
					}
					
					else {
						System.out.println("Minul si");
					}
					
					System.out.println("Utoci nepriatel");
					
					if (vyslednyUtokNepriatel > vyslednaObranaHrdina){
						hrdina.zasah();
						System.out.println("Nepriatel ta zasiahol");
						System.out.println("Pocet tvojich zivotov je: " + zivotHrdina);
					}
					
					else {
						System.out.println("Nepriatel minul");
					}
						
				}
				
				else {
					System.out.println("Nepriatel je mrtvy");
					break;
				}
			}
			else {
				System.out.println("Si mrtvy");
				break;
			}
		}
	}
}
