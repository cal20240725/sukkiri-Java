package sukkiri.lesson15.code06;

public class Main {
	public static boolean isValidPlayerName(String name) {
		
		//System.out.println("  a \"b\" c  ");
		
		//return name.matches("[A-Z][A-Z0-9]{7}");
		return name.matches("[A-Z][A-Z\\d]{7}");
	}
	
	public static void main(String[] args) {
		
		System.out.println(isValidPlayerName("aBCDEFG1"));
	}

}
