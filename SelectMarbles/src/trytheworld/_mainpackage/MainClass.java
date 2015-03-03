package trytheworld._mainpackage;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bag bag = new Bag();
		
		// Let us fill the bag with 30 red marbles, 50 blue marbles and 100 green marbles.
		bag.fillBag("RED", 10);
		System.out.println("Added 10 Red marbles");
		
		bag.fillBag("BLUE", 15);
		System.out.println("Added 15 blue marbles");
		
		bag.fillBag("GREEN", 25);
		System.out.println("Added 25 Green marbles");
		
		System.out.println("Current size of the bag is: "+bag.size()+"\n");
		
		System.out.println("Begin selecting from the bag");
		while(!bag.isEmpty())
		{
			System.out.println("Color selected: " + bag.selectMarble());
		}
	}

}
