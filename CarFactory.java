import java.io.*;

interface CarInterface {
	void display();

	void stop();

	void start();
}

class Car implements CarInterface {

	private String name;
	private String phase;

	// constructor
	public Car(String name) {
		this.name = name;
		this.phase = "running";
	}

	public void stop() {
		this.phase = "not running";
	}

	public void start() {
		this.phase = "running";
	}

	public void display() {
		System.out.println(name + " is " + phase);

	}
}

class Maruti extends Car {

	// constructor
	public Maruti(String name) {
		super(name);
	}
}

class Hyundai extends Car {

	// constructor
	public Hyundai(String name) {
		super(name);
	}
}

class Jaguar extends Car {

	// constructor
	public Jaguar(String name) {
		super(name);
	}
}

class CarFactory {

	public static void main(String[] args) {

		CarInterface car1 = new Maruti("Maruti");
		CarInterface car2 = new Hyundai("Hyundai");
		CarInterface car3 = new Jaguar("Jaguar");

		car1.display();
		car2.display();
		car3.display();

		System.out.println("------Applied stop on car1------");
		car1.stop();

		car1.display();
		car2.display();
		car3.display();

		System.out.println("------Applied start on car1 and stop on car3------");
		car1.start();
		car3.stop();

		car1.display();
		car2.display();
		car3.display();
	}
}