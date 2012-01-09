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
	
	public DomainObject(String name, String comment) {
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
 
	public void setComment(String comment) { 
		this.comment = comment; 
	}
	
	public String getName() { 
		return name; 
	} 
 
	public void setName(String pname) { 
		this.name = pname; 
	}
	
	public String toString() {
    return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]";
  }
  
  public boolean equals(Object obj) { 
    if (!(obj instanceof DomainObject)) { 
      return false; 
    }
    DomainObject domainObj = (DomainObject) obj;
    return uuid.equals(domainObj.getUuid());
  }
}
