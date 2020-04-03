import java.io.*;

interface CarInterface{
	void display();
}

class Car implements CarInterface{
	private String name;

	public Car(String name){ this.name=name; }
	public void display(){System.out.println(name+ " is running");}
}

class Maruti extends Car{
	public Maruti(String name) {super(name);}
}

class Hyundai extends Car{
	public Hyundai(String name) {super(name);}
}

class Jaguar extends Car{
	public Jaguar(String name) {super(name);}
}


class CarFactory{

	public static void main(String[] args) {
		
		Car car1 = new Maruti("Maruti");	
		Car car2 = new Hyundai("Hyundai");	
		Car car3 = new Jaguar("Jaguar");

		car1.display();	
		car2.display();	
		car3.display();	
	}
}



