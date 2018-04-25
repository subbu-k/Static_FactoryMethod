package beans;

public class CarFactory {
		private static String carname;
	private CarFactory() {
		
	}
	public static void setCarname(String carname) {
				CarFactory.carname = carname;
			} 
	//Static Factory Approach
	public static  Car getInstance() throws Exception {
		
		Car c=(Car)Class.forName(carname).newInstance();
		return c;
	}
	
}
