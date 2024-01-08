import java.util.Random;

public class BattleLoc extends Location {
    private Mob mob;
    private String award;
    private int maxMob;

    public BattleLoc(Player player, String name, Mob mob, String award, int maxMob) {
        super(player, name);
        this.mob = mob;
        this.award = award;
        this.maxMob = maxMob;
    }

    @Override
    public boolean onLocation() {
        int mobNumber = this.randomMobNumber();
        System.out.println("Şuan Buradasınız " + this.getName());
        System.out.println("Dikkatli Ol Burada " + mobNumber + " tane " + this.getMob().getName() + " yaşıyor ...");
        System.out.println("Savaşmak İstiyor musun ? Savaş = S yada Kaç = K ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S") && combat(mobNumber)) {

            System.out.println(this.getName() + " Tüm düşmanları yendiniz . . .");
            return true;
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz !");
            return false;
        }
        return true;
    }



    public boolean combat(int mobNumber) {
       Random random = new Random();
       int whoStart = random.nextInt(0,2); // 2 olasılıktan birini çağıracak

        for (int i = 1; i <= mobNumber; i++) {
            this.getMob().setHealth(this.getMob().getOrginalHealth());
            playerStats();
            mobStat(i);

          if(whoStart == 0) {
                while (this.getPlayer().getHealth() > 0 && this.getMob().getHealth() > 0) {
                    System.out.println("<V>ur veya <K>aç");
                    String selectCombat = input.nextLine().toUpperCase();

                    if (selectCombat.equals("V")) {
                        System.out.println("Siz Saldırdınız :");
                        this.mob.setHealth(this.getMob().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getMob().getHealth() > 0) {
                            System.out.println();
                            System.out.println("Canavar Size Vurdu :");
                            int mobDamage = this.getMob().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (mobDamage < 0) {
                                mobDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - mobDamage);
                            afterHit();
                        }
                    } else {
                        System.out.println("Test");
                        return false;
                    }
                }
            }

            if (this.getMob().getHealth() <= this.getPlayer().getHealth()) {
                System.out.println("Düşmanı Yendiniz !");
                System.out.println(this.getMob().getAward() + " Para Kazandınız .");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMob().getAward());
                System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());

                if(this.getName().equals("Mağara")){
                    System.out.println("Mağarayı Temizledin. Mağara Ödülünü Kazandın : Food ");
                    this.getPlayer().getInventory().getMapAward().setFood(1);
                }
                if(this.getName().equals("Orman")){
                    System.out.println("Ormanı Temizledin. Orman Ödülünü Kazandın : Firewood ");
                    this.getPlayer().getInventory().getMapAward().setFireWood(1);
                }
                if(this.getName().equals("Nehir")){
                    System.out.println("Nehir Temizledin. Nehir Ödülünü Kazandın : Water ");
                    this.getPlayer().getInventory().getMapAward().setWater(1);
                }

            } else {
                return false;
            }
        }
        return true;
    }

        public void afterHit () {
            System.out.println("Sağlık Durumunuz : " + this.getPlayer().getHealth());
            System.out.println(this.getMob().getName() + "'nin Sağlığı : " + this.getMob().getHealth());
            System.out.println("--------------------------------------------------------------------");
        }

        public void playerStats () {
            System.out.println("Oyuncu Değerleri : ");
            System.out.println("-----------------------------------");
            System.out.println("Sağlık : " + this.getPlayer().getHealth());
            System.out.println("Silah :" + this.getPlayer().getWeapon().getName());
            System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
            System.out.println("Zırh :" + this.getPlayer().getInventory().getArmor().getName());
            System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
            System.out.println("Para : " + this.getPlayer().getMoney());
            System.out.println();

        }

        public void mobStat ( int i){
            System.out.println(i + ". " + this.getMob().getName() + " Değerleri");
            System.out.println("-----------------------------------");
            System.out.println("Sağlık : " + this.getMob().getHealth());
            System.out.println("Hasar : " + this.getMob().getDamage());
            System.out.println("Para : " + this.getMob().getAward());
            System.out.println();
        }

        public int randomMobNumber () {
            Random r = new Random();
            return r.nextInt(this.getMaxMob()) + 1;


        }

        public Mob getMob () {
            return mob;
        }

        public void setMob (Mob mob){
            this.mob = mob;
        }

        public String getAward () {
            return award;
        }

        public void setAward (String award){
            this.award = award;
        }

        public int getMaxMob () {
            return maxMob;
        }

        public void setMaxMob ( int maxMob){
            this.maxMob = maxMob;
        }
    }

