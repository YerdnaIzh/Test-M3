import java.lang.Math;

public class Cat
{
    private double originWeight;
    private double weight;

	private double food_eaten;

	private static int count;

	private static final int number_of_eyes = 2;
	private static final double minWeight = 1000.0;
	private static final double maxWeight = 9000.0;

	private boolean aProudOwnerOfATail;

	private enum color {
		BLACK, WHITE, GREY, ORANGE, BROWN, MULTICOLOR
	}

	private color catsColor;

    public Cat()
    {
		count++;
        this.weight = 1500.0 + 3000.0 * Math.random();
        this.originWeight = weight;
		int x = (int) (Math.random() * 100);
		if(x != 0) this.aProudOwnerOfATail = true; else this.aProudOwnerOfATail = false;
    }

	public Cat(double weight)
	{
		count++;
		this.weight = weight;
		this.originWeight = weight;
	}

	public Cat copyCat(Cat originalCat)
	{
		if(originalCat.isAlive()) count++;
		Cat newCat = new Cat();
		newCat.setWeight(originalCat.getWeight());
		newCat.originWeight = newCat.getWeight();
		if(originalCat.hasTail()) newCat.attachATail(); else newCat.removeATail();
		return newCat;
	}


    public void meow()
    {
		if(this.checkIfDead() == 0){
			weight = weight - 1;
			/* System.out.println("Meow"); */
			count -= this.checkIfDead();
		} else {
			System.out.println("This cat is dead.");
		}
    }

    public void feed(Double amount)
    {
		if(this.checkIfDead() == 0){
			weight = weight + amount;
			this.addFoodEaten(amount);
			count -= this.checkIfDead();
		} else {
			System.out.println("This cat is dead.");
		}
    }

    public void drink(Double amount)
    {
		if(this.checkIfDead() == 0){
			weight = weight + amount;
			count -= this.checkIfDead();
		} else {
			System.out.println("This cat is dead.");
		}
    }

    public Double getWeight()
    {
        return weight;
    }

	public void setWeight(Double weight)
	{
		this.weight = weight;
	}

	public Double getFoodEaten()
	{
		return this.food_eaten;
	}

	private void addFoodEaten(Double amount)
	{
		this.food_eaten += amount;
	}

	public void pee()
	{
		if(this.checkIfDead() == 0){
			this.weight -= 10.0;
			System.out.println("A certain cat peed.");
			count -= this.checkIfDead();
		} else {
			System.out.println("This cat is dead.");
		}
	}

	public static int getCount()
	{
		return count;
	}

	private int checkIfDead()
	{
		if((this.getStatus()).equals("Dead") || (this.getStatus()).equals("Exploded")) return 1; else return 0;
	}

	public boolean isAlive()
	{
		if((this.getStatus()).equals("Sleeping") || (this.getStatus()).equals("Playing")) return true; else return false;
	}

	public boolean hasTail()
	{
		return this.aProudOwnerOfATail;
	}

	public void attachATail()
	{
		this.aProudOwnerOfATail = true;
	}

	public void removeATail()
	{
		this.aProudOwnerOfATail = false;
	}

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

	public void setColor(color c)
	{
		this.catsColor = c;
	}

	public color getColor()
	{
		return this.catsColor;
	}

}
