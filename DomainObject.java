package at.jku.ce;

public class DomainObject {

	public String uuid;
	private String name;
	
	/**
	 * Default Constructor
	 */	 	 
	public DomainObject() {
		super();
	}
	
	public DomainObject() {
		super();
		this.id = id;
	}
	
	public String getUuid() {
		return uuid; 
	}

	public String id = UUID.randomUUID().toString()
}
