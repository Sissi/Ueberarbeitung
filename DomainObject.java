package at.jku.ce;

public class DomainObject {


	private String uuid;
	private String name;
	private String comment;
	
	/**
	 * Default Constructor
	 */	 	 
	protected DomainObject() {
		super();
	}
	
	protected DomainObject(String name, String comment) {
		super();
		this.id = id;
	}
	
	public String getUuid() {
		return uuid; 
	}

	public String uuid = UUID.randomUUID().toString();
	
	public String getComment() { 
		return comment; 
	} 
 
	public void setComment(final String comment) { 
		this.comment = comment; 
	}
	
	public String getName() { 
		return name; 
	} 
 
	public void setName(final String pname) { 
		this.name = pname; 
	}
	
	public String toString() {
    return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]";
  }
}
