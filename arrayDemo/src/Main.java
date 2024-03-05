public class Main {
    public static void main(String[] args) {

        String[] pair3 = new String[5];
        pair3[0]="Elanur";
        pair3[1]="Bilge";
        pair3[2]="Aykut";
        pair3[3]="Doğan";
        pair3[4]="Ahmet";

        for (int i=0;i< pair3.length;i++){
            System.out.println(pair3[i]);
        }

        System.out.println("--------------------------------");
        for (String ogrenci:pair3) {
            System.out.println(ogrenci);
        }
    }
}