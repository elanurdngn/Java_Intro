public class Diziler {
    public void ekran(){
        String[] sehirler= new String[]{"İstanbul","Ankara","İzmir"};

        for (String sehir:sehirler){
            System.out.println(sehir);
        }
        for(int i =0;i<=sehirler.length;i++){
            System.out.println(sehirler[i]);
        }

        String[] sehirler2= new String[]{"İstanbul","Ankara","İzmir"};
        String[] sehirler3= new String[]{"Antep","Diyarbakır","Urfa"};

        sehirler2 = sehirler3;
        sehirler2[0]="Adana";
        System.out.println(sehirler2[0]);

        int sayi=10;
        int sayi2=20;
        sayi=sayi2;
        sayi2=30;
        System.out.println(sayi);
    }
}
