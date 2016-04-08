
public class GearBox {
	//private int gears;
	//private int offset;
	private int currentGear;
	private int maxGear=6;
	private int[] offsets = {0,3,10,20,30,40,50};
	private int[] steps = {0,20,60,80,100,120,120};
	
	
	private void changeGear(int gear) {
		this.currentGear = gear;
	}
	
	// checkGear Marche avec if et case
	public void checkGear(int currentSpeed) {
		if (currentSpeed == 0 && currentGear == 0) {
			changeGear(1);
		}else if (currentSpeed < steps[1]){
			changeGear(1);
		}else if (currentSpeed < steps[2]){
			changeGear(2);
		}else if (currentSpeed < steps[3]){
			changeGear(3);
		}else if (currentSpeed < steps[4]){
			changeGear(4);
		}else if (currentSpeed < steps[5]){
			changeGear(5);
		}else{
			changeGear(6);
		}
	}
	// idee:
//	private void checkGear(int currentSpeed) {
//		for (int i=0; i < steps.length; i++) {
//			
//		}
//	}
	
	
	public int getAccel(int currentSpeed) {
		int accel = 0;
		for (int i = 0; i<offsets.length;i++) {
			if (this.currentGear == i) {
				accel = offsets[i];
				break;
			}
		}
		return accel;
	}

	
	public int getCurrentGear() {
		return currentGear;
	}
}
