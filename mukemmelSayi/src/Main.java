public class Main {
    public static void main(String[] args) {
        int number= 28;
        int toplam= 0;
        for (int i=1;i<number;i++){
            if(number % i==0){
                toplam+=i;
            }
        }
        if (number==toplam){
            System.out.println(number+ " bir mükemmel sayıdır.");
        }
        else {
            System.out.println(number+ " bir mükemmel sayı değildir.");
        }
    }
}