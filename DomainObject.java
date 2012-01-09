package at.jku.ce;

public class DomainObject {


	private String uuid;
	private String name;
	private String comment;
	
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

	public String uuid = UUID.randomUUID().toString()
	
	public String getComment() { 
		return comment; 
	} 
 
	public void setComment(String comment) { 
		this.comment = comment; 
	}
}
