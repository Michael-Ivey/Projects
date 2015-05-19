
public abstract class Vehicle implements Interface {	

	private String Name;
	private String Color;
	private String Weight;
	protected Person Owner;	
	
	public void transferOwnership(Person newOwner){		
		Owner = newOwner;
		Owner.setFirstName(newOwner.getFirstName());
		Owner.setLastName(newOwner.getLastName());
		
	}
	

}
