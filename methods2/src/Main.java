import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args) {

        String mesaj= "Bugün hava çok güzel";
        String yeniMesaj= mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        String yeniMesaj2=sehirVer();
        System.out.println(yeniMesaj2);
        int sayi = topla(5,7);
        System.out.println(sayi);
        int sayi2 = topla2(5,7,8);
        System.out.println(sayi2);

    }
    public static void ekle(){
        System.out.println("eklendi");
    }
    public static void sil(){
        System.out.println("silindi");
    }
    public static void guncelle(){
        System.out.println("güncellendi");
    }
    public static String sehirVer(){
        return "Ankara";
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}