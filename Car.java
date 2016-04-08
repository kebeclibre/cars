
public class Car {

	private int currentSpeed;
	private String model;
	private static String buildPlace = "Germany";
	private static int countInst;
	//private int maxGears = 6;
	private int currentGear = 0;
	
	
	
	public Car() {
		countInst += 1;
	}
	
	public static String getBuildPlace() {
		return buildPlace;
	}
	
	private void accelerateOffSet(int offset) {
		this.currentSpeed += offset;
	}
	
	private void changeGear(int gear) {
		this.currentGear = gear;
	}
	
	private void checkGear() {
		if(this.currentSpeed < 20) {
			changeGear(1);
		}else if (this.currentSpeed < 60) {
			changeGear(2);
		}else if (this.currentSpeed < 80) {
			changeGear(3);
		}else if (this.currentSpeed < 100) {
			changeGear(4);
		}else if (this.currentSpeed < 120) {
			changeGear(5);
		}else{
			changeGear(6);
		}
	}
	
	public void accelerateGeared() {
			if (this.currentGear == 0) {
				checkGear();
			}else if (this.currentGear == 1) {
				accelerateOffSet(3);
				checkGear();
			}else if (this.currentGear == 2){
				accelerateOffSet(10);
				checkGear();
			}else if (this.currentGear == 3){
				accelerateOffSet(20);
				checkGear();
			}else if (this.currentGear == 4){
				accelerateOffSet(30);
				checkGear();
			}else if (this.currentGear == 5){
				accelerateOffSet(40);
				checkGear();
			}else if (this.currentGear == 6){
				accelerateOffSet(50);
				checkGear();
		}


	}
	

	public void decelerate() {
		if (this.currentSpeed > 5) {
			this.currentSpeed -= 5;
		}else{
			this.currentSpeed = 0;
		}
	}

	
	public int getCurrentSpeed() {
		return currentSpeed;
	}


	
	public String getModel() {
		return model;
	}


	
	public void setModel(String model) {
		this.model = model;
	}

	public static int getCountInst() {
		return countInst;
	}

	public static void setCountInst(int countInst) {
		Car.countInst = countInst;
	}

	
	public int getCurrentGear() {
		return currentGear;
	}
	
	}
