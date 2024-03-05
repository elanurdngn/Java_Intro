public class Main {
    public static void main(String[] args) {

        for (int i=0;i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");
        System.out.println("-------------------------------------------------");
        int number=2;
        while (number<10){
            System.out.println(number);
            number+=2;
        }
        System.out.println("While Döngüsü Bitti");
        System.out.println("-------------------------------------------------");

        int number2=200;
        do {
            System.out.println(number2);
            number2+=5;
        }while (number2<10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}