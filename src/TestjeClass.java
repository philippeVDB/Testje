import java.util.Scanner;


public class TestjeClass {

	public static void main(String[] args) {
		System.out.print("Geef een integer getal: ");
		Scanner lezer = new Scanner(System.in);
		int getal;
		getal = lezer.nextInt();
		System.out.printf("het product van %d en 10 = %d", getal, getal*10);

	}

}
