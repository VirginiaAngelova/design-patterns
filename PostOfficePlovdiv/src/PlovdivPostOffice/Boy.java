package PlovdivPostOffice;


class Boy {

    void setCurrentShipment(int currentShipment) {
        System.out.println("Boy is getting the shipment number "+currentShipment);
        switch (currentShipment) {
            case 1: System.out.println("Staff of international post is ready for new client.");
                break;
            case 2:System.out.println("Staff of country post is ready for new client.");
                break;
            case 3: System.out.println("Staff of city post is ready for new client.");
                break;
            default:
                break;
        }
    }
}
