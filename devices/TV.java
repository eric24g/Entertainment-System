package devices;

public class TV implements Device{
	
	public void turnOn(){
		swichToFavoriteChannel();
		System.out.println("Television is turning on....");
	}

	public void turnOff(){
		turnOnTVAlarm();
		System.out.println("Television is turing off...");
	}
	
	private void swichToFavoriteChannel(){
		System.out.println("User is turning channels for viewing....");
	}
	
	private void turnOnTVAlarm() {
		System.out.println("Alarm is set for television...");
	}

	@Override
	public String toString() {
		return "TV";
	}
}

