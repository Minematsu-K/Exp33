
public class Exp33_3 {

	public static void main(String[] args) {
		Drink[] drinks = {
				new Coffee(350),
				new Tea(300),
				new Juice(250)
		};

		for (int i = 0; i < drinks.length; i++) {
			drinks[i].showPrice();
		}
	}
}
