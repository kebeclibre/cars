
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
	private void checkGear(int currentSpeed) {
		int curGear = this.currentGear;
		if (currentSpeed== 0 && curGear == 0) {
			changeGear(1);
		}else if (curGear != maxGear){
			if (currentSpeed > steps[curGear]){
				changeGear(curGear+1);
			}else if (currentSpeed < steps[curGear]){
				changeGear(curGear);
			}else if (currentSpeed <= steps[curGear-1]){
				changeGear(curGear-1);
			}
			
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
				checkGear(currentSpeed);
				break;
			}
		}
		return accel;
	}

	
	public int getCurrentGear() {
		return currentGear;
	}
}
