package umn.ac.id.uts;

import java.util.ArrayList;

public class Healthy extends Human{
	private int muscle;
	private int fat;
	private int stressLevel;
	private double weight;
	public ArrayList<String> activities = new ArrayList<String>();
	
	public Healthy() {
		muscle = 0;
		fat = 0;
		weight = 0;
		stressLevel = 0;
	}
	
	public Healthy(String name, int age) {
		super(name, age);
		muscle = 50;
		fat = 15;
		weight = (fat*0.3) + (muscle*0.6);
		stressLevel = 4;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getFat() {
		return fat;
	}
	
	public int getMuscle() {
		return muscle;
	}
	
	public int getStressLevel() {
		return stressLevel;
	}
	
	public void updateWeight() {
		weight = (fat*0.3) + (muscle*0.6);
	}
	
	public void eat(Food food) {
		fat = fat + food.fat;
		muscle = muscle - food.muscle;
		stressLevel = stressLevel + 2;
	}
	
	public void workout(Exercise excercise) {
		fat = fat - excercise.fat;
		muscle = muscle + excercise.muscle;
		stressLevel = stressLevel - 2;
	}
}
