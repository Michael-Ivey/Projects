
public class Motorcycle extends Vehicle implements Interface{
	private boolean hasSideCar;
	
	public Motorcycle(boolean sideCar){
		hasSideCar = sideCar;
	}

	@Override
	public int numberOfDoors() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numberOfAxels() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean sideCar() {
		// TODO Auto-generated method stub
		return this.hasSideCar;
	}

	@Override
	public Person transferOwnership() {
		// TODO Auto-generated method stub
		return this.Owner;
	}

	

	

	

	
}
