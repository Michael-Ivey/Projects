
public class Truck extends Vehicle implements Interface {
	private int NumberOfAxels;
	
	public Truck(int numAxels, Person person){
		NumberOfAxels = numAxels;
		transferOwnership(person);
	}

	@Override
	public int numberOfDoors() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numberOfAxels() {
		// TODO Auto-generated method stub
		return this.NumberOfAxels;
	}

	@Override
	public boolean sideCar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person transferOwnership() {
		// TODO Auto-generated method stub
		return this.Owner;
	}

	
	

	
}
