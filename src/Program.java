
public class Program {


	public static void main(String[] args) {
		
		NaplnRoomy.naplnMiestnosti();
		NaplnRoomy.zaciatok();
		try {
			NaplnRoomy.zavolajMiestnosti();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}