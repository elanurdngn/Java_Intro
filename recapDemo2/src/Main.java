public class Main {
    public static void main(String[] args) {

        double[] numbers={1.2,2.5,8.3,5.6,7.8};
        double max = numbers[0];
        double total=0;

        for (double number:numbers) {
            if(max<number){
                max=number;
            }
            total+=number;
            System.out.println(number);
        }
        System.out.println("En büyük sayı = "+ max);
        System.out.println("Toplam sayı = "+ total);
    }
}