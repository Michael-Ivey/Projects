import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class TestVehicle extends Vehicle {	
	public static Person a = new Person("Mark", "Turner");	
	public static Car newCar = new Car(4, a);
	public static Truck newTruck = new Truck(2, a);
	public static Person b = new Person("Luke", "Brown");
	public static Motorcycle newMotorcycle = new Motorcycle(false);
	
	
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
		

		//System.out.println(newCar.numberOfDoors());
		//System.out.println(newTruck.numberOfAxels());
		//System.out.println(newMotorcycle.sideCar());
		//System.out.println(a.getFirstName() + " " + a.getLastName() + " " + a.getPersonID());
		//System.out.println(newCar.Owner.getFirstName() + " " + newCar.Owner.getLastName());
		//System.out.println(newTruck.Owner.getFirstName() + " " + newTruck.Owner.getLastName());
		newTruck.transferOwnership(b);
		//System.out.println(newTruck.Owner.getFirstName() + " " + newTruck.Owner.getLastName());
		
		HashMap<UUID, String> hm = new HashMap<UUID, String>();
		hm.put(a.getPersonID(), a.getFirstName() + " " + a.getLastName());
		hm.put(b.getPersonID(), b.getFirstName() + " " + b.getLastName());
		hm.put(newCar.Owner.getPersonID(), newCar.Owner.getFirstName() + " " + newCar.Owner.getLastName());
		hm.put(newTruck.Owner.getPersonID(), newTruck.Owner.getFirstName() + " " + newTruck.Owner.getLastName());
		
		//System.out.println("Count in hm: " + hm.size());
		// Get a set of the entries
		Set set = hm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		


		


	}

	@Override
	public Person transferOwnership() {
		// TODO Auto-generated method stub
		return this.transferOwnership();
	}

	

	
	
	
	
	
	

}
