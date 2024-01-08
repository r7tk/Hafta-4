import java.util.Random;

public class Mob {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int award;
    private int orginalHealth;



    public int getOrginalHealth() {
        return orginalHealth;
    }

    public void setOrginalHealth(int orginalHealth) {
        this.orginalHealth = orginalHealth;
    }

    public Mob(int id, String name, int damage, int health, int award) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.orginalHealth = health;
        this.name = name;
        this.award = award;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int money) {
        this.award = money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        if (health < 0){
            health = 0;
        }
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
