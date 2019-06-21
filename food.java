package amrita;

public class food 
{
	private String name;

	
		private String category;
		private int[] day;
	
	private String type;
	private double rating;
	private double costPerServe;
	
	
	public food(String name, String category, int[] day, String type, double costPerServe) {
		super();
		this.name = name;
		this.category = category;
		this.day = day;
		this.type = type;
		this.costPerServe = costPerServe;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int[] getDay() {
		return day;
	}


	public void setDay(int[] day) {
		this.day = day;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public double getCostPerServe() {
		return costPerServe;
	}


	public void setCostPerServe(double costPerServe) {
		this.costPerServe = costPerServe;
	}
	
	
	
}
