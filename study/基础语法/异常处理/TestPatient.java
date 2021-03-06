package 基础语法.异常处理;

public class TestPatient {

	public static void main(String[] args) {
		MedicalThermometer t = new MedicalThermometer();
        try {
        	t.measure();
        }
        catch (TemperatureException e) {
        	System.out.println("Patient dead: " + e.getDegrees() + " degrees!");
        }
        catch (Exception e) {
        	System.out.println("Not a temperature!");
        }
	}

}
