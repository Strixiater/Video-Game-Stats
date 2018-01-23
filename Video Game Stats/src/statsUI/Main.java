package statsUI;

public class Main {
	public static void main(String[] args) {
		Loadout Hud = new Loadout("Primary", "Secondary", "Leathal", "Loadout1", 0);
		System.out.println(Hud.toString());
		
		Character operator = new Character("Sledge");
		System.out.println(operator.toString());
		
		Score score = new Score(10, 5, 4);
		System.out.println(score.toString());
		
	}

}
