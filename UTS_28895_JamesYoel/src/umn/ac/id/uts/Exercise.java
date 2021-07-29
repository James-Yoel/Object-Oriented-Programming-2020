package umn.ac.id.uts;

public class Exercise {
	public String name;
	public int muscle;
	public int fat;
	
	public Exercise() {
		name = null;
		muscle = 0;
		fat = 0;
	}
	
	public Exercise(String name, int muscle, int fat) {
		this.name = name;
		this.muscle = muscle;
		this.fat = fat;
	}
}
