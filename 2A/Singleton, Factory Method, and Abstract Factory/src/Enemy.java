public interface Enemy {
    void attack();
}

// EasyEnemy.java - Easy Enemy Implementation
class EasyEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Easy Enemy attacks!");
    }
}

// HardEnemy.java - Hard Enemy Implementation
class HardEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Hard Enemy attacks fiercely!");
    }
}
