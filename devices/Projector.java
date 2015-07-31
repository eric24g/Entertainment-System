package devices;

public class Projector implements Device{
	
	 public void turnOn(){
		 pullUpProjector();
		 System.out.println("Projector is turing on....");
	 }
	 
	 public void turnOff() {
		 pullDownProjector();
		 System.out.println("Projector is turning off...");
	 }
	
	 private void pullUpProjector(){
		 System.out.println("Projector is going up for viewing...");
	 }
	 
	 private void pullDownProjector(){
		 System.out.println("Projector is going down for closing....");
	 }

	@Override
	public String toString() {
		return "Projector";
	}
}
