public class Main {
    public static void main(String[] args) {

        int[][] deneme= new int[3][3];

        deneme[0][0]=3;
        deneme[0][1]=42;
        deneme[0][2]=4;
        deneme[1][0]=5;
        deneme[1][1]=12;
        deneme[1][2]=7;
        deneme[2][0]=74;
        deneme[2][1]=32;
        deneme[2][2]=95;
        int toplam=0;
        for (int i=0;i<=2;i++){

            System.out.println((i+1)+".sütunun toplamı:");
            for (int j=0;j<=2;j++){
                toplam=toplam+deneme[i][j];

            }
            System.out.println(toplam);
            System.out.println("---------------------------");

        }





                /*("Hello world!");*/
    }
}