
public class CarClass {

	public static void main(String[] args) {
		Car car1 = new Car("Fiat", "500", 50);
		car1.printData();
		car1.accelerate();
		car1.brake();
		car1.printData();
		car1.refuel(15);
	}
}

class Car {
//attributes
	private String brand;
	private String model;
	private int amountOfFuel;

//methods
	public void brake() {
		System.out.println("Car is braking");
	}

	public void accelerate() {
        //decrease fuel, unless empty
		if (amountOfFuel > 0) {
			System.out.println("Car is accelerating");
			amountOfFuel--;
		} else {
			System.out.println("Out of fuel");
		}
	}

	public void printData() {
		System.out.println("Brand: " + brand + "\tModel: " + model + "\tAmount of fuel: " + amountOfFuel);
	}

	public void refuel(int amount) {
		amountOfFuel += amount;
		System.out.println("Fuel in the tank: " + (amountOfFuel - amount) + "\tRefuel: " + amount
				+ "\tFuel in the tank after refuel: " + amountOfFuel);

	}

//constructors
    //parameterized
	public Car(String brand, String model, int amountOfFuel) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
	}
    //default
	public Car() {

	}

}
