
public class GearBox {
	//private int gears;
	//private int offset;
	private int currentGear;
	
	
	private void changeGear(int gear) {
		this.currentGear = gear;
	}
	
	private void checkGear(int currentSpeed) {
		if(currentSpeed < 20) {
			changeGear(1);
		}else if (currentSpeed < 60) {
			changeGear(2);
		}else if (currentSpeed < 80) {
			changeGear(3);
		}else if (currentSpeed < 100) {
			changeGear(4);
		}else if (currentSpeed < 120) {
			changeGear(5);
		}else{
			changeGear(6);
		}
	}
	
	public int getAccel(int currentSpeed) {
		int offset = 0;
			if (this.currentGear == 0) {
				offset = 0;
				checkGear(currentSpeed);
			}else if (this.currentGear == 1) {
				offset = 3;
				checkGear(currentSpeed);
			}else if (this.currentGear == 2){
				offset = 10;
				checkGear(currentSpeed);
			}else if (this.currentGear == 3){
				offset = 20;
				checkGear(currentSpeed);
			}else if (this.currentGear == 4){
				offset = 30;
				checkGear(currentSpeed);
			}else if (this.currentGear == 5){
				offset = 40;
				checkGear(currentSpeed);
			}else if (this.currentGear == 6){
				offset = 50;
				checkGear(currentSpeed);
			}
			return offset;
	}

	
	public int getCurrentGear() {
		return currentGear;
	}
}
