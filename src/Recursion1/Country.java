package Recursion1;

public class Country {
	private String name;
	private int population;
	private State[] states;
	
	public Country(String name){
		this.name  = name;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public State[] getStates() {
		return states;
	}

	public void setStates(State[] states) {
		this.states = states;
	}
	
	class Boundary {
		private int height;
		private int width;
		
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		
		public void printDetails(){
			System.out.println("Boundary details for " + getName() +" is "+ height +" "+ width);
		}
	}
}
