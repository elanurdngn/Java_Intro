public class Main {
    public static void main(String[] args) {
        int number1= 255,number2= 30,number3= 17,max = number1;

        if (max < number2){
            max = number2;
        }
        else if (max < number3) {
            max = number3;
        }
        System.out.println("En büyük sayı = "+ max);

    }
}