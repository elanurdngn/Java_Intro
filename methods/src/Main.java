public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 5, 8, 9, 7, 6};
        int aranacak = 4;
        boolean varMi=false;
        String mesaj;

        for (int sayi:sayilar) {
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            mesajVer(aranacak+" Sayısı mevcuttur");
        }
        else {
            mesajVer(aranacak+" Sayısı mevcut değildir");
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}