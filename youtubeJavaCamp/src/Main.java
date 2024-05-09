import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Laptop");

        Product product2 = new Product();
        product2.setName("Mouse");

        Product[] urunler = new Product[]{product,product2};

        for (Product urun:urunler){
            System.out.println(urun.getName());
        }


        MortgageManager mortgageManager = new MortgageManager();
        mortgageManager.calculate();

        ArrayList<CreditManager> creditManagers= new ArrayList<>();
        creditManagers.add(new VehicleManager());
        creditManagers.add(new MortgageManager());
        creditManagers.add(new OfficerManager());


        for (CreditManager credi:creditManagers) {
            credi.calculate();
        }

    }
}