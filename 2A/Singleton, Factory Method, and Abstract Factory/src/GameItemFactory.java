public interface GameItemFactory {
    Weapon createWeapon();
    PowerUp createPowerUp();
}

// EasyLevelFactory - Creates Easy Level Items
class EasyLevelFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthBoost();
    }
}

// HardLevelFactory - Creates Hard Level Items
class HardLevelFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new LaserGun();
    }

    @Override
    public PowerUp createPowerUp() {
        return new Shield();
    }
}