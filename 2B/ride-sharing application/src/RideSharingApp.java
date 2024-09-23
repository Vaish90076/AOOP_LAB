public class RideSharingApp {
    public static void main(String[] args) {
        // Get the single instance of UserAuthentication for managing user login
        UserAuthentication userAuth = UserAuthentication.getInstance();

        // User login
        userAuth.login("JohnDoe");

        // Factory Method to create vehicle types
        VehicleFactory vehicleFactory = new CarFactory();  // Example: Car ride
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.bookRide();  // Book the ride

        // Abstract Factory to create different payment methods
        PaymentFactory paymentFactory = new CreditCardFactory();  // Example: CreditCard payment
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.processPayment(20.50);  // Process the payment

        // Log out the user
        userAuth.logout();
    }
}
