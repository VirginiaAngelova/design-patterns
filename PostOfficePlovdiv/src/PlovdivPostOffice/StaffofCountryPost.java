package PlovdivPostOffice;

public class StaffofCountryPost extends Logger {

	public StaffofCountryPost() {
		this.shipment = Logger.staffOfCountryPost;
		isPreparing=true;
	}

	@Override
	protected void logMessage(String message) {
		System.out.println( message);

	}

}
