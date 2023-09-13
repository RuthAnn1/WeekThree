package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name ="Tiger")
@Table(name = "Tiger")
public class Tiger {
	@Id
	@GeneratedValue
	private int rowId;
	public int getRowId() {
		return rowId;
	}
	public Tiger(int rowId, String color, int age, String species) {
		super();
		this.rowId = rowId;
		this.color = color;
		this.age = age;
		this.species = species;
	}
	public Tiger() {
		// TODO Auto-generated constructor stub
	}
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	private String color;
	private int age;
	private String species;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "Tiger [color=" + color + ", age=" + age + ", species=" + species + "]";
	}
	public String makeNoise() {
		return "ROARRR!";
	}

}
