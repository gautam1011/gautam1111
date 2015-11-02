
public class Employee {
	
	private String FirstName;
	private String LastName;
	private String  title;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName
				+ ", title=" + title + "]";
	}
	
	

}
