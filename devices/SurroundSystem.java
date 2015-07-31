package devices;

public class SurroundSystem implements Device{
	
	public void turnOn() {
		switchedToFavoriteCD();
		System.out.println("Surround Sound System is being turned on....");
	}
	
	public void turnOff(){
		lowerVolume();
		System.out.println("Surround Sound System is being turned off...");
	}
	
	private void switchedToFavoriteCD(){
		System.out.println("CD is being switched for listening....");
	}

	private void lowerVolume(){
		System.out.println("Volume is decreasing.....");
	}

	@Override
	public String toString() {
		return "SurroundSystem";
	}
	
	
}
