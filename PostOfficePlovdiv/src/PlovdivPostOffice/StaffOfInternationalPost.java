package PlovdivPostOffice;

public class StaffOfInternationalPost extends Logger {

	public StaffOfInternationalPost() {
		this.shipment= Logger.staffOfInternationolPost;
		isPreparing=true;
	}
	@Override
	protected void logMessage(String message) {
		System.out.println( message);

	}

}
