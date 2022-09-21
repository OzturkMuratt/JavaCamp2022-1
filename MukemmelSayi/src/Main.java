public class Main {
    public static void main(String[] args) {
        int sayi=28;
        int sum=0;
        int[] bolenler=new int[]{};

        for (int i = 1; i<sayi;i++){
            if (sayi%i==0){
                sum+=i;
            }

        }

        if (sum==sayi){
          System.out.println("Mükemmel Sayıdır");
         } else System.out.println("Mükemmel Sayı değildir");

                /*("Hello world!");*/
    }
}