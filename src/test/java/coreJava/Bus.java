package coreJava;

public class Bus extends Vehicle{

	public Bus(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vehicle v=new Bus("Merecedis");
       v.start();
       v.stop();
      // v.
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting the bus");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping the bus");
	}

	public void accelerate() {
		
	}
}
