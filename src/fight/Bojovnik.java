package fight;


public class Bojovnik {
	
	private int iniciativa;
	private int zivoty;
	private int utok;
	private int obrana;
	
	Bojovnik(int iniciativa, int zivoty, int utok, int obrana){
		this.iniciativa = iniciativa;
		this.zivoty = zivoty;
		this.utok = utok;
		this.obrana = obrana;
	}
	
	public void zasah(){
		zivoty --;
	}
	
	public boolean jeZivy(){
		return zivoty > 0;
	}	

	public int getZivoty(){
		return zivoty;
	}
	
	public int getUtok(){
		return utok;
	}
	
	public int getObrana(){
		return obrana;
	}
	
}