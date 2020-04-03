import java.io.*;

interface Car{
	void display();
}

class Maruti implements Car{
	public void display(){System.out.println("Maruti");}
}

class Hyundai implements Car{
	public void display(){System.out.println("Hyundai");}
}

class Jaguar implements Car{
	public void display(){System.out.println("Jaguar");}
}


class CarFactory{

	public static void main(String[] args) {
		
		Car car1 = new Maruti();	
		Car car2 = new Hyundai();	
		Car car3 = new Jaguar();

		car1.display();	
		car2.display();	
		car3.display();	
	}
}


