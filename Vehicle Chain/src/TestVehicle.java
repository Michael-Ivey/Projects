
public class TestVehicle extends Vehicle {	
	static Person a = new Person("James", "Brown");	
	static Car newCar = new Car(4, a);
	static Truck newTruck = new Truck(2, a);
	static Person b = new Person("Luke", "Brown");
	static Motorcycle newMotorcycle = new Motorcycle(false);
	
	
	@Override
	public int numberOfDoors() {
		// TODO Auto-generated method stub
		return this.numberOfDoors();
	}

	@Override
	public int numberOfAxels() {
		// TODO Auto-generated method stub
		return this.numberOfAxels();
	}

	@Override
	public boolean sideCar() {
		// TODO Auto-generated method stub
		return this.sideCar();
	}
	
	public static void main(String[] args){
		newCar.transferOwnership(a);		
		newTruck.transferOwnership(a);
		

		System.out.println(newCar.numberOfDoors());
		System.out.println(newTruck.numberOfAxels());
		System.out.println(newMotorcycle.sideCar());
		System.out.println(a.getFirstName() + " " + a.getLastName() + " " + a.getPersonID());
		System.out.println(newCar.Owner.getFirstName() + " " + newCar.Owner.getLastName());
		System.out.println(newTruck.Owner.getFirstName() + " " + newTruck.Owner.getLastName());
		newTruck.transferOwnership(b);

		System.out.println(newTruck.Owner.getFirstName() + " " + newTruck.Owner.getLastName());


		


	}

//	@Override
//	public Person transferOwnership() {
//		// TODO Auto-generated method stub
//		return this.transferOwnership();
//	}

	

	
	
	
	
	
	

}
