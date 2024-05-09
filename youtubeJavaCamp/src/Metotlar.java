public class Metotlar {
    public void ekran(){
        mesajVer();
        mesajVer();
        mesajVer();
        hesapla();
        hesapla();
        topla(6,9);
        toplananIkiSayininYuzdesi(6,9);
    }
    public void  mesajVer(){
        System.out.println("Merhaba");
    }
    public void hesapla(){
        System.out.println("Hesapla");
    }
    public int topla(int sayi1, int sayi2){
        int toplam = sayi1+sayi2;
        return toplam;
    }
    public void toplananIkiSayininYuzdesi(int sayi1,int sayi2){
        int toplam = topla(sayi1,sayi2);
        double sonuc = toplam * 10/100;
        System.out.println("Sonuc = "+sonuc);
    }
}
