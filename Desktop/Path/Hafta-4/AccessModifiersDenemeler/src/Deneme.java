public class Deneme {
    String Ad = "";
    String SoyAd = " ";
    int DogumTarihi;
    String DogumYeri = "";

  /*  public void kimlikBilgi(){        /PARAMETRESİZ CONSTRUCTOR
        this.Ad = Ad;
        this.SoyAd = SoyAd;
        this.DogumYeri = DogumYeri;
        this.DogumTarihi = DogumTarihi;
    }
    //public void kimlikBilgi(String Ad,String Soyad,int DogumTarihi,String DogumYeri){
*/

    public void printKimlik(String Ad,String SoyAd,int DogumTarihi,String DogumYeri){   // PARAMETRELİ CONSTRUCTOR
        System.out.println("Adınız : "+Ad);
        System.out.println("Soyadınız : "+SoyAd);
        System.out.println("Doğum Yeriniz : "+DogumYeri);
        System.out.println("Doğum Tarihiniz : "+DogumTarihi);
    }
}

