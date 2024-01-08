public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------------- Mağazaya Hoşgeldiniz. -------------");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1 - SİLAHLAR");
            System.out.println("2 - ZIRHLAR");
            System.out.println("3 - ÇIKIŞ YAP");
            System.out.println(" Seçiminizi  . . .");
            int selectCase = Location.input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println(" Geçersiz değer, tekrar giriniz : ");
                selectCase = input.nextByte();

            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    BuyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                default:
                    System.out.println("Bir daha bekleriz . . .");
                    showMenu = false;
                    break;


            }

        }
        return true;
    }




    public void printWeapon() {
        System.out.println("Silahlar : ");
        System.out.println();

        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " < =\t" + w.getName() + "\tPARA : " + w.getPrice() + " \t= > HASAR : " + w.getDamage() + "= >");

        }
        System.out.println("0 - Çıkış Yap ");
    }

    public void BuyWeapon() {
        System.out.println("Bir Silah Seçiniz Lütfen : ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.println(" Geçersiz değer, tekrar giriniz : ");
            selectWeaponID = input.nextInt();
        }
        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjbyID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println(" Yeterli Paranız Bulunmamaktadır.");
                } else {
                    // SATIN ALMANIN GERÇEKLEŞTİĞİ ALAN . . .
                    System.out.println(selectedWeapon.getName() + " Silahını satın aldınız .");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Bakiye : " + this.getPlayer().getMoney());
                    System.out.println("Önceki Silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni Silahınız : " + this.getPlayer().getInventory().getWeapon().getName());


                }
            }
        }

    }

    public void printArmor() {
        System.out.println("Zırhlar : ");

        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() +
                    " = > Para : " + a.getPrice() + "  Hasar Engelleme :" + a.getBlock() + " > ");
        }
        System.out.println("0 - Çıkış Yap ");
    }

    public void buyArmor() {
        System.out.println("Bir Zırh Seçiniz : ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.println(" Geçersiz değer, tekrar giriniz : ");
            selectArmorID = input.nextInt();
        }
if (selectArmorID != 0){
    Armor selectedArmor = Armor.getArmorObjbyID(selectArmorID);

    if (selectedArmor != null) {
        if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
            System.out.println("Yeterli Paranız Bulunmamaktadır.");
        } else {
            System.out.println(selectedArmor.getName() + " Zırhını Satın Aldınız . ");
            this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
            this.getPlayer().getInventory().setArmor(selectedArmor);
            System.out.println("Kalan Bakiye : " + this.getPlayer().getMoney());

        }

    }

}


    }
}


