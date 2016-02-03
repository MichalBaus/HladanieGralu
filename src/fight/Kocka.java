package fight;
import java.util.Random;

public class Kocka {
	
	int nahodna;
	
	static int hodKockou(){
	    Random rand = new Random();
	    int randomNum = rand.nextInt((6 - 1) + 1) + 1;
	    return randomNum;
	}
	
	 
}
