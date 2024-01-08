import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz . ! .");
        System.out.println("Lütfen Bir isim Giriniz : ");
        String PlayerName = input.nextLine();
        Player player = new Player(PlayerName);
        System.out.println(player.getName() + " Hoşgeldiniz ! ");
        System.out.println("Lütfen Oynamak İstediğiniz Karakterleri Seçiniz ! " + "\n");
        player.selectChar();
        Location location = null;
        while (true) {

            player.printInfo();
            System.out.println();
            System.out.println(" ------Bölgeler----");
            System.out.println();
            System.out.println("1 - Güvenli Ev -- > Burası Sizin için güvenli bir ev, Düşman Yoktur");
            System.out.println("2 - Eşya Store -- > Silah veya Zırh Satın Alabilirsiniz .");
            System.out.println("3 - Mağara -- > Ödül <Yemek> Dikkatli Ol Zombi Çıkabilir.");
            System.out.println("4 - Orman -- > Ödül <Odun> Dikkatli Ol Vampir Çıkabilir.");
            System.out.println("5 - Nehir -- > Ödül <Su> Dikkatli Ol Ayı Çıkabilir.");
            System.out.println("6 - Maden -- > Ödül <Savaş Ganimet> Dikkatli Ol Yılan Çıkabilir.");
            System.out.println();
            System.out.println("0 - Çıkış Yap -- > Oyunu Sonlandırır.");
            System.out.println();
            System.out.println("Lütfen Gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (location.getClass().getName().equals("SafeHouse"))
                if (player.getInventory().getMapAward().getWater() == 1
                        && player.getInventory().getMapAward().getFireWood() == 1 && player.getInventory().getMapAward().getFood() == 1){

                    System.out.println("Tebrikler Oyunu Bitirdiniz.");
                    break;
                }
            if (location == null){
                System.out.println("Oyun bitti .. .");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("OYUN BİTTİ .");
                break;
            }

        }

    }

}