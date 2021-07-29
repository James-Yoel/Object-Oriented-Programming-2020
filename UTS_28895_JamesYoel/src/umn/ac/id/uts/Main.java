package umn.ac.id.uts;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	static Healthy healthy;
	static Unhealthy unhealthy;
	static ArrayList<Food> food = new ArrayList<Food>();
	static ArrayList<Exercise> exercise = new ArrayList<Exercise>();
	
	public static void inputHuman() {
		String name;
		int age;
		System.out.println("----------------------------------------");
		System.out.println("              Living Life               ");
		System.out.println("----------------------------------------");
		System.out.println("Healthy\nName :");
		name = in.nextLine();
		System.out.println("Age :");
		age = in.nextInt();
		in.nextLine();
		healthy = new Healthy(name, age);
		System.out.println("Healthy character is added !\nUnhealthy\nName :");
		name = in.nextLine();
		System.out.println("Age :");
		age = in.nextInt();
		unhealthy = new Unhealthy(name, age);
		System.out.println("Unhealthy character is added !");
		return;
	}
	
	public static void arrayListSeeding() {
		food.add(new Food("Pizza", 3, 10));
		food.add(new Food("Risotto", 2, 4));
		food.add(new Food("Burger", 4, 9));
		food.add(new Food("Noodle", 3, 5));
		food.add(new Food("Salad", 1, 1));
		
		exercise.add(new Exercise("Plank", 1, 2));
		exercise.add(new Exercise("Crunch", 2, 3));
		exercise.add(new Exercise("Squat", 3, 3));
		exercise.add(new Exercise("Pull Up", 2, 2));
		exercise.add(new Exercise("Comandos", 5, 2));
	}
	
	public static void detailHuman() {
		int pilihan;
		boolean retry = false;
		System.out.println("----------------------------------------");
		System.out.println("              Living Life               ");
		System.out.println("----------------------------------------");
		System.out.println("1. Healthy\n2. Unhealthy");
		while(retry == false) {
			System.out.println("Choose your character: ");
			pilihan = in.nextInt();
			if(pilihan == 1) {
				retry =  true;
				System.out.println("Healthy");
				System.out.println("Name: "+healthy.getName());
				System.out.println("Age: "+healthy.getAge());
				System.out.println("Weight: "+healthy.getWeight());
				System.out.println("Muscle: "+healthy.getMuscle());
				System.out.println("Fat: "+healthy.getFat());
				System.out.println("Stress Level: "+healthy.getStressLevel());
			}
			else if(pilihan == 2) {
				retry = true;
				System.out.println("Unhealthy");
				System.out.println("Name: "+unhealthy.getName());
				System.out.println("Age: "+unhealthy.getAge());
				System.out.println("Weight: "+unhealthy.getWeight());
				System.out.println("Muscle: "+unhealthy.getMuscle());
				System.out.println("Fat: "+unhealthy.getFat());
				System.out.println("Stress Level: "+unhealthy.getStressLevel());
			}
			else {
				System.out.println("Input Invalid.");
			}
		}
		return;
	}
	
	public static void eatFood() {
		int i = 0, pilihan, id;
	    boolean retry = false;
		System.out.println("----------------------------------------");
		System.out.println("              Living Life               ");
		System.out.println("----------------------------------------");
		System.out.println("Foods");
		for(Food list: food) {
			i++;
			System.out.println("---------------");
			System.out.println("ID : " +i);
			System.out.println("Name : "+list.name);
			System.out.println("Muslce : "+list.muscle);
			System.out.println("Fat: "+list.fat);
		}
		System.out.println("---------------");
		while(retry == false) {
			System.out.println("Choose your Food: ");
			pilihan = in.nextInt();
			if(pilihan > i || pilihan <= 0) {
				System.out.println("Invalid input.");
			}
			else {
				id = pilihan;
				Food fList = food.get(id-1);
				System.out.println("1. Healthy\n2. Unhealthy: ");
				while(retry == false) {
					System.out.println("Choose your character: ");
					pilihan = in.nextInt();
					if(pilihan == 1) {
						retry = true;
						if(healthy.getStressLevel() > 10) {
							System.out.println(healthy.getName()+" is stressed out.");
							return;
						}
						else {
							healthy.eat(fList);
							healthy.updateWeight();
							healthy.activities.add("Eating: "+fList.name);
							System.out.println(healthy.getName()+" doesn't really like it.");
						}
					}
					else if(pilihan == 2) {
						retry = true;
						if(unhealthy.getMuscle() < fList.muscle) {
							System.out.println(unhealthy.getName()+" is way too unhealthy.");
							return;
						}
						else {
							unhealthy.eat(fList);
							unhealthy.updateWeight();
							unhealthy.activities.add("Eating: "+fList.name);
							System.out.println(unhealthy.getName()+" loves it.");
						}
					}
					else {
						System.out.println("Invalid input.");
					}
				}
			}
		}
		return;
	}
	
	public static void workoutExercise() {
		int i = 0, pilihan, id;
	    boolean retry = false;
		System.out.println("----------------------------------------");
		System.out.println("              Living Life               ");
		System.out.println("----------------------------------------");
		System.out.println("Exercises");
		for(Exercise list: exercise) {
			i++;
			System.out.println("---------------");
			System.out.println("ID : " +i);
			System.out.println("Name : "+list.name);
			System.out.println("Muslce : "+list.muscle);
			System.out.println("Fat: "+list.fat);
		}
		System.out.println("---------------");
		while(retry == false) {
			System.out.println("Choose your workout: ");
			pilihan = in.nextInt();
			if(pilihan > i || pilihan <= 0) {
				System.out.println("Invalid input.");
			}
			else {
				id = pilihan;
				Exercise eList = exercise.get(id-1);
				System.out.println("1. Healthy\n2. Unhealthy: ");
				while(retry == false) {
					System.out.println("Choose your character: ");
					pilihan = in.nextInt();
					if(pilihan == 1) {
						retry = true;
						if(healthy.getFat() < eList.fat) {
							System.out.println(healthy.getName()+" is way too healthy.");
							return;
						}
						else {
							healthy.workout(eList);
							healthy.updateWeight();
							healthy.activities.add("Working out: "+eList.name);
							System.out.println(healthy.getName()+" loves it.");
						}
					}
					else if(pilihan == 2) {
						retry = true;
						if(unhealthy.getStressLevel() > 10) {
							System.out.println(unhealthy.getName()+" is stressed out.");
							return;
						}
						else {
							unhealthy.workout(eList);
							unhealthy.updateWeight();
							unhealthy.activities.add("Working out: "+eList.name);
							System.out.println(unhealthy.getName()+" doesn't really like it.");
						}
					}
					else {
						System.out.println("Invalid input.");
					}
				}
			}
		}
		return;
	}
	
	public static void listActivities() {
		int pilihan;
		boolean retry = false;
		System.out.println("----------------------------------------");
		System.out.println("              Living Life               ");
		System.out.println("----------------------------------------");
		System.out.println("Activities\n---------------");
		System.out.println("1. Healthy\n2. Unhealthy");
		while(retry == false) {
			System.out.println("Choose your character: ");
			pilihan = in.nextInt();
			if(pilihan == 1) {
				retry = true;
				System.out.println("Healthy");
				if(healthy.activities.size() == 0) {
					System.out.println("No activity yet.");
				}
				for(String list: healthy.activities) {
					System.out.println(list);
				}
			}
			else if(pilihan == 2) {
				retry = true;
				System.out.println("Unhealthy");
				if(unhealthy.activities.size() == 0) {
					System.out.println("No activity yet.");
				}
				for(String list: unhealthy.activities) {
					System.out.println(list);
				}
			}
			else {
				System.out.println("Invalid input.");
			}
		}
		return;
	}
	
	public static void credits() {
		System.out.println("----------------------------------------");
		System.out.println("              Living Life               ");
		System.out.println("----------------------------------------");
		System.out.println("Name: James Yoel");
		System.out.println("NIM: 00000028895");
		return;
	}

	public static void main(String[] args) {
		int pilihan = -1;
		inputHuman();
		arrayListSeeding();
		for(;pilihan != 0;) {
			System.out.println("----------------------------------------");
			System.out.println("              Living Life               ");
			System.out.println("----------------------------------------");
			System.out.println("1. Your Detail\n2. Eat\n3. Workout\n4. List of activities\n5. Credits\n0. Exit\nInput: ");
			pilihan = in.nextInt();
			switch(pilihan) {
			case 1: detailHuman(); break;
			case 2: eatFood(); break;
			case 3: workoutExercise(); break;
			case 4: listActivities(); break;
			case 5: credits(); break;
			case 0: break;
			default: System.out.println("Invalid Input.");
			}
		}
		System.out.println("Thank You !");
	}

}
