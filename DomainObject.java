package at.jku.ce;

public class DomainObject {


	private String uuid;
	private String name;
	
	/**
	 * Default Constructor
	 */	 	 
	public DomainObject() {
		super();
	}
	
	public DomainObject(String name, String comment) {
		super();
		this.id = id;
	}
	
	public String getUuid() {
		return uuid; 
	}

	public String uuid = UUID.randomUUID().toString()
}
