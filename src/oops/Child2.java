package oops;

public class Child2 {
	
	String name;
	
	String add;
	
	int contact;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public Child2() {
		
	}

	public Child2(String name, String add, int contact) {
		super();
		this.name = name;
		this.add = add;
		this.contact = contact;
	}

	

}

