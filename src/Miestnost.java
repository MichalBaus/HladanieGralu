import fight.*;

public class Miestnost {
	private int cislo;
	private String popis;
	private int vyber1;
	private int vyber2;
	private int vyber3;
	private String popisMoznosti1;
	private String popisMoznosti2;
	private String popisMoznosti3;
	private Boj boj = null;
	
	Miestnost(int c, String p, int v1, int v2, String pm1, String pm2){
		cislo = c;
		popis = p;
		vyber1 = v1;
		vyber2 = v2;
		popisMoznosti1 = pm1;
		popisMoznosti2 = pm2;
	}
	
	Miestnost(int c, String p, int v1, int v2, String pm1, String pm2, Boj boj){
		cislo = c;
		popis = p;
		vyber1 = v1;
		vyber2 = v2;
		popisMoznosti1 = pm1;
		popisMoznosti2 = pm2;
		this.boj = boj;
	}
	
	Miestnost(int c, String p){
		cislo = c;
		popis = p;
	}
	
	Miestnost(int c, String p, int v1, int v2, int v3, String pm1, String pm2, String pm3){
		cislo = c;
		popis = p;
		vyber1 = v1;
		vyber2 = v2;
		vyber3 = v3;
		popisMoznosti1 = pm1;
		popisMoznosti2 = pm2;
		popisMoznosti3 = pm3;
	}
			
	Miestnost(int c, String p, int v1, int v2, int v3, String pm1, String pm2, String pm3, Boj boj){
		cislo = c;
		popis = p;
		vyber1 = v1;
		vyber2 = v2;
		vyber3 = v3;
		popisMoznosti1 = pm1;
		popisMoznosti2 = pm2;
		popisMoznosti3 = pm3;
		this.boj = boj;
	}
	
	@Override
	public String toString() {

		String navratovyText = cislo + ": " + popis + "\n"; 
		if (popisMoznosti1 != null)	navratovyText += "Chceš: " + "\n";
		if (popisMoznosti1 != null) navratovyText += vyber1 + ": " + popisMoznosti1 + "\n";
		if (popisMoznosti2 != null) navratovyText += vyber2 + ": " + popisMoznosti2 + "\n";
		if (popisMoznosti3 != null) navratovyText += vyber3 + ": " + popisMoznosti3 + "\n";
		if (popisMoznosti1 != null) navratovyText += "Zadaj èíslo: ";
		
		return navratovyText;
	}
	
	public int getVyber1 (){
		return vyber1;
	}
	
	public int getVyber2 (){
		return vyber2;
	}
	
	public int getVyber3 (){
		return vyber3;
	}
	
	public Boj getBoj() {
		return boj;
	}
	
	public boolean validujVyber(int num) {
		return (num == vyber1 || num == vyber2 || num == vyber3);
	}
}
