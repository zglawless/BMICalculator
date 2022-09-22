/**
 * @author zakgl - zglawless
 * CIS175 - Fall 2022
 * Sep 21, 2022
 */
package model;

public class BMICalculator { // BMI Calculator model class
	int feet; //variables
	int inches;
	double weight;
	double bmi;
	
	public BMICalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BMICalculator(int feet, int inches, double weight) { // constructor with fields
		super();
		this.feet = feet;
		this.inches = inches;
		this.weight = weight;
		setBmi(weight, feet, inches); // calls the set bmi method with the variables used in the form 
	}

	public int getFeet() { // getters and setters
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}
	
	

	public int getInches() {
		return inches;
	}

	

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	public void setBmi(double weight, int feet, int inches) { // set bmi method that takes the users weight feet and inches to calculate the bmi
		this.bmi = weight * 0.45359237 / ((feet*12 + inches) * 0.0254 * (feet*12 + inches) * 0.0254);
	}
	
	public double getBmi() {
		return bmi;
	}

	@Override
	public String toString() {
		return "BMICalculator [feet=" + feet + ", inches=" + inches + ", weight=" + weight + ", bmi=" + bmi + "]";
	}
	
	
	
	
	
	

}
