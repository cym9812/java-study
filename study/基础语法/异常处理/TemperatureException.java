package 基础语法.异常处理;
public class TemperatureException extends Exception {

	private double degrees;
	
	public TemperatureException(double degrees) {
		this.degrees = degrees;
	}
	
	public String getMessage() {
		return "The temperature (" + degrees 
				+ "C) isn't in the normal range.";		
	}

	public double getDegrees() {
		return degrees;
	}
}
