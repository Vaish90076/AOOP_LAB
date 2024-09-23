public class MainGame {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        gameState.setLevel(1);
        gameState.setDifficulty("Easy");

        // Enemy creation using Factory Method
        EnemyFactory enemyFactory;
        if (gameState.getDifficulty().equals("Easy")) {
            enemyFactory = new EasyEnemyFactory();
        } else {
            enemyFactory = new HardEnemyFactory();
        }

        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();

        // Abstract Factory for weapons and power-ups
        GameItemFactory itemFactory;
        if (gameState.getDifficulty().equals("Easy")) {
            itemFactory = new EasyLevelFactory();
        } else {
            itemFactory = new HardLevelFactory();
        }

        Weapon weapon = itemFactory.createWeapon();
        PowerUp powerUp = itemFactory.createPowerUp();

        weapon.use();
        powerUp.activate();
    }
}
