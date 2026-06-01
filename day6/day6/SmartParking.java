package day6;

public class SmartParking {
	    String vehicleNumber;
	    int hoursParked;
	    String vehicleType;
	    double parkingFee;

	    SmartParking(String vehicleNumber, int hoursParked, String vehicleType) {
	        this.vehicleNumber = vehicleNumber;
	        this.hoursParked = hoursParked;
	        this.vehicleType = vehicleType;

	        if (vehicleType.equalsIgnoreCase("Bike")) {
	            parkingFee = hoursParked * 10;
	        } else if (vehicleType.equalsIgnoreCase("Car")) {
	            parkingFee = hoursParked * 30;
	        } else if (vehicleType.equalsIgnoreCase("Bus")) {
	            parkingFee = hoursParked * 50;
	        } else {
	            parkingFee = 0;
	        }
	    }

	    void display() {
	        System.out.println("Vehicle Number : " + vehicleNumber);
	        System.out.println("Vehicle Type : " + vehicleType);
	        System.out.println("Hours Parked : " + hoursParked);
	        System.out.println("Parking Fee : ₹" + parkingFee);
	    }

	    public static void main(String[] args) {
	        SmartParking p1 = new SmartParking("OD02AB1234", 5, "Car");
	        p1.display();
	    }
}
