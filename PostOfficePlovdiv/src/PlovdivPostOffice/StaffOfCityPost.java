package PlovdivPostOffice;



public class StaffOfCityPost extends Logger {

	public StaffOfCityPost() {
		this.shipment = Logger.staffOfCityPost;
		isPreparing=true;
	}

	@Override
	protected void logMessage(String message) {
		System.out.println(message);
	}
}
