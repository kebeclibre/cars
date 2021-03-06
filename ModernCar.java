
public class ModernCar {
	
	private int currentSpeed;
	GearBox gear;
	
	public ModernCar() {
		gear = new GearBox();
	}
	
	public void accel() {
		int accel = gear.getAccel(this.currentSpeed);
		//checkGear
		this.currentSpeed += accel;
                  gear.checkGear(currentSpeed);
	}

	public void decel() {
		int accel = gear.getAccel(currentSpeed);
		if (this.currentSpeed >= accel) {
			this.currentSpeed -= accel;
		}else{
			this.currentSpeed=0;
		}
                  gear.checkGear(currentSpeed);
	}	
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public int getGear() {
		return gear.getCurrentGear();
	}
	
}