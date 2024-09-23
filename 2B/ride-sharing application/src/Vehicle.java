public interface Vehicle {
    void bookRide();
}

// Car.java - Concrete Car class
class Car implements Vehicle {
    @Override
    public void bookRide() {
        System.out.println("Car ride booked!");
    }
}

// Bike.java - Concrete Bike class
class Bike implements Vehicle {
    @Override
    public void bookRide() {
        System.out.println("Bike ride booked!");
    }
}

// Scooter.java - Concrete Scooter class
class Scooter implements Vehicle {
    @Override
    public void bookRide() {
        System.out.println("Scooter ride booked!");
    }
}

