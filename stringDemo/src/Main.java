public class Main {
    public static void main(String[] args) {

        String message= "Bugün hava çok güzel.";

        System.out.println("Eleman sayısı = "+message.length());
        System.out.println("7.Eleman = "+ message.charAt(6));
        System.out.println(message.concat("Yaşasın!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] karakter = new char[4];
        message.getChars(6,10,karakter,0);
        System.out.println(karakter);
        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf("a"));

        System.out.println("----------------");
        System.out.println(message);
        String newMessage= message.replace(" ","-");
        System.out.println(newMessage);
        System.out.println(message.substring(2,5));
        System.out.println("----------------");
        for (String kelime: message.split(" ")){
            System.out.println(kelime);
        }
    }
}