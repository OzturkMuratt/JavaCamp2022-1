public class Main {
    public static void main(String[] args) {

       double[] dizi1={1.2,5.3,7.9,1.1};
       double toplam=0;
       double maks=0;

       for (double temp:dizi1){

           toplam+=temp;
           if (temp>maks){
               maks=temp;
           }

       }
       System.out.println(toplam);
       System.out.println(maks);

                /*("Hello world!");*/
    }
}