package umn.ac.id.uts;

public class Food {
	public String name;
	public int muscle;
	public int fat;
	
	public Food() {
		name = null;
		muscle = 0;
		fat = 0;
	}
	
	public Food(String name, int muscle, int fat) {
		this.name = name;
		this.muscle = muscle;
		this.fat = fat;
	}
}
