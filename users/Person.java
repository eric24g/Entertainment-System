package users;

import remotes.RemoteControl;
import devices.Projector;
import devices.SurroundSystem;
import devices.TV;

public class Person {

	public static void main(String[] args) {
		//Devices in Home
		Projector projector = new Projector();
		TV largeTV = new TV();
		SurroundSystem system = new SurroundSystem();
		
		//users control
		RemoteControl remoteControl = RemoteControl.getInstance();
		
		remoteControl.connectToDevice(projector);
		remoteControl.clickOnButton();
		
		remoteControl.connectToDevice(largeTV);
		remoteControl.clickOnButton();
		
		remoteControl.connectToDevice(system);
		remoteControl.clickOnButton();
	}
}


