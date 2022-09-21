public class Main {
    public static void main(String[] args) {

        int sayi = -2;

            if (sayi == 1) {
                System.out.println("Sayı 1 olamaz");
            } else if (sayi == 2) {
                System.out.println("Sayı 2 olamaz");

            } else if (sayi < 0) {
                System.out.println("Sayı 0 dan küçük olamaz");
            }else {
                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) {

                        System.out.println("Sayının tam böleni vardır");
                        break;
                    } else System.out.println("Sayının tam böleni yoktur");
                    break;
                }
            }



            /*("Hello world!");*/
        }
    }
