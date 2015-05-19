public class Car extends Vehicle implements Interface  {
	private int NumberOfDoors;
	
	public Car(int numDoors, Person person){
		NumberOfDoors = numDoors;
		transferOwnership(person);
	}

	@Override
	public int numberOfDoors() {
		// TODO Auto-generated method stub
		return this.NumberOfDoors;
	}

	@Override
	public int numberOfAxels() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean sideCar() {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public Person transferOwnership() {
//		// TODO Auto-generated method stub
//		return this.Owner;
//	}

	

	

	

	
	
	
	
	

}
