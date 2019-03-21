
public class Kleines1x1 {

	public static void main(String[] args) {
		kleinesEinMalEins();
	}
	
	public static void kleinesEinMalEins() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}
