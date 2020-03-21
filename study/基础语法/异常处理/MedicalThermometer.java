package 基础语法.异常处理;
import 基础语法.异常处理.TemperatureException;

import java.util.Scanner;

public class MedicalThermometer {

	public void measure() throws TemperatureException {
		Scanner s = new Scanner(System.in);
        System.out.println("Please enter patient temperature:");
        double degrees = s.nextDouble();
        if (degrees > 43 || degrees < 14) {
        	throw new TemperatureException(degrees);
        }
        if (degrees >= 38) {
         	System.out.println("Fever!");
	    }
	    else if (degrees < 35) {
	     	System.out.println("Hypothermia!");
	    }
	    else System.out.println("Normal.");
	}

}
