package study;
public class BoilKettle {

	public static void main(String[] args) {
		Kettle k = new Kettle();
		k.heat(60); 
		k.getKettleStatus();
		k.heat(30);
		k.getKettleStatus();
	}

}
