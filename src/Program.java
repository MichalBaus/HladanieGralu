
public class Program {


	public static void main(String[] args) {
			
		NaplnRoomy.start();
		try {
			NaplnRoomy.zavolajMiestnosti();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}