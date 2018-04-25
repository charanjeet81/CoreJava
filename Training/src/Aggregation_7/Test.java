//Aggregation: If a class have an entity reference/object in any any other class then it is known as aggregation.

package Aggregation_7;

class Address 
{
	private Integer houseNumber;
	private String street;
	private String state;
	
	// setter - getter methods 
	public void setHouseNumber(Integer houseNumber)
	{
		this.houseNumber=houseNumber;
	}
    public Integer getHouseNumber()
	{
		return houseNumber;
	}

	public void setStreet(String street)
	{
		this.street=street;
	}
    public String getStreet()
	{
		return street;
	}

	public void setState(String state)
	{
		this.state=state;
	}
    public String getState()
	{
		return state;
	}
} 

class Customer
{
	private String name;
	private Address address;     //aggregation, because address-reference is kept by other class Customer.
	
	public void setName(String name)
	{
		this.name=name;
	}
    public String getName()
	{
		return name;
	}

	public void setAddress(Address address)
	{
		this.address=address;
	}
	public Address getAddress()
	{
		return address;
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		Customer customer = new Customer();
		customer.setName("John");

		Address address = new Address();
		address.setHouseNumber(101);
		address.setStreet("JUNCTION ROAD");
		address.setState("Canada");

		customer.setAddress(address);

		System.out.println("Your name is - "+customer.getName());
		System.out.println("Your house number is - "+customer.getAddress().getHouseNumber());
		System.out.println("Your street is - "+customer.getAddress().getStreet());
		System.out.println("Your state is - "+customer.getAddress().getState());
	}
}
