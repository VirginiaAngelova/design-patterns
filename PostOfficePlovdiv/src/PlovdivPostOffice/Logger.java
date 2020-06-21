package PlovdivPostOffice;


public abstract class Logger {
	
	static final int staffOfCityPost = 3;
	static final int staffOfCountryPost = 2;
	static final int staffOfInternationolPost = 1;
	
	
	int shipment;
	
	private Logger nextLogger;

	boolean isPreparing;
	private static Boy boy;
	void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}
	void handleMessage(int shipment) {
        String message;
        switch (shipment) {
            case 1: message="Staff of international post receive international shipment";
                break;
            case 2:message="Staff of country post receive country shipment";
                break;
            case 3: message="Staff of city post receive city shipment";
                break;
            default: message="";
                break;
        }
		if(this.shipment <= shipment ) {
			this.logMessage(message);
			setNewShipment(shipment);
			return;
		}
		if(this.nextLogger != null) {
			this.nextLogger.handleMessage(shipment);
		}
	}
	
	abstract protected void logMessage(String message);

    void addObserver(Boy boy){
        Logger.boy =boy;
    }
    private void setNewShipment(int shipment){
        boy.setCurrentShipment(shipment);
        isPreparing=false;
    }
}
