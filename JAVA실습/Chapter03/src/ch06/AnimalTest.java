package ch06;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 움직입니다.");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void fly() {
		System.out.println("독수리가 날개짓을 합니다.");
	}
	
}


public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal H = new Human();
		Animal T = new Tiger();
		Animal E = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.move(H);
		test.move(T);
		test.move(E);

		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(H);
		animalList.add(E);
		animalList.add(T);
		
		for (Animal ani : animalList) {
			ani.move();
		}
	}

	public void move(Animal animal) {
		animal.move();
		
	}

}
