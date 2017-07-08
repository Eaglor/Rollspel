package model;

public class Skills {
	private String category;
	private String name;
	private int valueA;
	private int valueB;
	private String description;
		
	public String getCategory(){
		return category;
	}
	
	void setCategory(String category){
		this.category = category;
	}
	
	public String getName(){
		return name;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	public int getValueA(){
		return valueA;
	}
	
	void setValueA(int valueA){
		this.valueA = valueA;
	}
	
	public int getValueB(int valueB){
		return valueB;
	}
	
	void setValueB(int valueB){
		this.valueB = valueB;
	}
	
	public String getDescription(){
		return description;
	}
	
	void setDescription(String description){
		this.description = description;
	}
}
