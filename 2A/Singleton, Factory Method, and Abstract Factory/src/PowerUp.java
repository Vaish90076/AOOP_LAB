public interface PowerUp {
    void activate();
}

// Concrete Weapons
class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("Swinging the sword!");
    }
}

class LaserGun implements Weapon {
    @Override
    public void use() {
        System.out.println("Shooting with laser gun!");
    }
}

// Concrete PowerUps
class HealthBoost implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Health boost activated!");
    }
}class Shield implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Shield activated!");
    }
}
