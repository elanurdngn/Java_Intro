public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 5, 8, 9, 7, 6};
        int aranacak = 4;
        boolean varMi=false;

        for (int sayi:sayilar) {
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayı mevcuttur");
        }
        else {
            System.out.println("Sayı mevcut değildir");
        }
    }

}