package kodlama.io.entities;

public class Course extends Base {
	private String category;
    private String instructor;
    private String info;
    private double price;
    
	public Course() {
	
	}
	public Course(String category, String instructor, String info,double price) {
		super();
		this.category = category;
		this.instructor = instructor;
		this.info = info;
		this.price=price;
	
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

 
    }

