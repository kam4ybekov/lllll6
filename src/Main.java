public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.snipers, "AWM");
        Boss boss = new Boss("Thanos", 1000, 50, bossWeapon);

        System.out.println("Boss Name: " + boss.getName());
        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Weapon Type: " + boss.getWeapon().getType());
        System.out.println("Boss Weapon Name: " + boss.getWeapon().getName());
    }
}

