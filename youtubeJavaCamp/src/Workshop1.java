public class Workshop1 {
    public void ekran(){
        int[] sayilar = new int[]{1,2,3,4,56,7,8,6,30};


        System.out.println(sayiBul(sayilar,32));

    }
    public boolean sayiBul(int[] p1,int p2){
        boolean varMi=false;
        for(int sayi :p1){
            if(sayi== p2){
                varMi=true;
            }
            else {
                varMi=false;
            }
        }
        return varMi;
    }
}
