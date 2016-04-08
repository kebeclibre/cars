
public class Main {

	public static void main(String[] args) {
		ModernCar a = new ModernCar();
		//Car b = new Car();
		System.out.println("ACCELERATION");
		for (int i=0;i<15;i++){
			System.out.println("Speed " + a.getCurrentSpeed());
			System.out.println("Gear " + a.getGear());
			a.accel();
			System.out.println("New Speed " + a.getCurrentSpeed());
			System.out.println("New Gear " + a.getGear());
			
		}
		System.out.println("DECELERATION");
		for (int i=0;i<15;i++){
			System.out.println("Speed " + a.getCurrentSpeed());
			System.out.println("Gear " + a.getGear());
			a.decel();
			System.out.println("New Speed " + a.getCurrentSpeed());
			System.out.println("New Gear " + a.getGear());
			
		}
		
	}
	
}
