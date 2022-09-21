public class Main {
    public static void main(String[] args) {

        //For
        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("sıralama bitti");
        System.out.println("------------------------------");

        for (int i=0;i<=10;i+=2){
            System.out.println(i);
        }

        System.out.println("çift sıralama bitti");
        System.out.println("------------------------------");

        for (int i=1;i<=10;i+=2){
            System.out.println(i);
        }

        System.out.println(" tek sıralama bitti");
        System.out.println("------------------------------");


        //WHİLE
        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println(" while sıralama bitti");
        System.out.println("------------------------------");

        int k=0;
        while (k<10){
            System.out.println(k);
            k+=2;
        }

        System.out.println(" while çift sıralama bitti");
        System.out.println("------------------------------");

        int j=1;
        while (j<=10){
            System.out.println(j);
            j+=2;
        }
        System.out.println(" while tek sıralama bitti");
        System.out.println("------------------------------");



        //DO-WHİLE

            int z=1;
            do {
                z=z+500;
                System.out.println(z);
                z+=2;

            }while (z<10);
            System.out.println("Do-WHİLE DÖNGÜSÜ BİTTİ");
        /*("Hello world!");*/
    }
}