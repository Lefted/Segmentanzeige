
public class Zufallszahlen {

	public static void main(String[] args) {
		System.out.println(zufallszahl(1,6));
	}
	
	public static int zufallszahl(int min, int max) {
		return (int) (Math.random() * max + min);
	}
}
