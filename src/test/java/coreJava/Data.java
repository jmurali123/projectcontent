package coreJava;

 class Main {
	
	private String identifier;
	
	public String getName() {
	
		return this.identifier;
	}
	public void setName(String name) {
		this.identifier=name;
	
	}
	public void display() {
		System.out.println(this.identifier);
	}

}

public class Data{
	public static void main(String[] args) {
		Main m= new Main();	
		m.setName("test");
		m.display();
	
	}
}