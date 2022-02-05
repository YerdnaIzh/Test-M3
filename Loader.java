
public class Loader
{
	private static Cat getKitten()
	{
		return new Cat(1100.0);
	}

    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();

        System.out.println("Cat1 weighs " + cat1.getWeight());
        System.out.println("Cat2 weighs " + cat2.getWeight());
        System.out.println("Cat3 weighs " + cat3.getWeight());
        System.out.println("Cat4 weighs " + cat4.getWeight());
        System.out.println("Cat5 weighs " + cat5.getWeight());
        System.out.println("Cat6 weighs " + cat6.getWeight());
        System.out.println("Cat7 weighs " + cat7.getWeight());

		cat1.feed(100.0);
		cat2.feed(200.0);

		System.out.println();

			System.out.println("Cat1 weighs now " + cat1.getWeight());
			System.out.println("Cat2 weighs now " + cat2.getWeight());

		System.out.println();

		while(!(cat1.getStatus()).equals("Exploded")){
			cat1.feed(100.0);
		}

		System.out.println("Cat 1 is " + cat1.getStatus() + ".");

		System.out.println();

		while(!(cat2.getStatus()).equals("Dead")){
			cat2.meow();
		}

		System.out.println("Cat 2 is " + cat2.getStatus() + ".");

		System.out.println();

		Cat cat8 = new Cat();
		cat8.feed(150.0);

		for (int i = 0; i < 3; i++){
			cat8.pee();
		}

		System.out.println("Cat 8 has eaten " + cat8.getFoodEaten() + "g of food.");
		System.out.println();


		System.out.println("There are " + Cat.getCount() + " cats.");

		System.out.println();
		cat1.feed(100.0);
		System.out.println();

		Cat cat9 = getKitten();
		System.out.println("Cat 9 is " + cat9.getStatus());
		System.out.println("There are " + Cat.getCount() + " cats currently.");
		System.out.println();
	}
}
