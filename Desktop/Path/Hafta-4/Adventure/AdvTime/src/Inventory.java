public class Inventory {
    private Weapon weapon;
    private Armor armor;

    private MapAward mapAward;

    public Inventory(){

       this.weapon = new Weapon(-1,"  Yumruk  ",1,0);
       this.armor = new Armor (-1,"  Paçavra  ",0,0);
       this.mapAward = new MapAward(0,0,0);

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public MapAward getMapAward() {
        return mapAward;
    }

    public void setMapAward(MapAward mapAward) {
        this.mapAward = mapAward;
    }
}

