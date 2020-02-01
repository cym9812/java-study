package study;
public class Kettle {
	private int degrees = 20;
	private boolean powerOn = true;

	public void heat(int seconds) {
		powerOn = true;
		try {
			degrees += seconds; // one degree per second
			if (degrees > 100) {
				throw new TemperatureException(degrees);
			}
			System.out.println("Heated to " + degrees + " degrees");
		}
		catch (TemperatureException e) {
			System.out.println("Overheating!");
		}
		finally {
			powerOn = false;
		}
	}
	
	public void getKettleStatus() {
		System.out.println(powerOn ? "Kettle on" : "Kettle off");
	}
}

