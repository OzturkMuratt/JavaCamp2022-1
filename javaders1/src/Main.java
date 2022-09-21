import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // değişken isimlendirmeleri java'da camelCase yazılır.
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";
        char ali='a';

        System.out.println(ortaMetin);

        // integer - tam sayılar kullanılır -> 3 , 5 , 11 , 19 , 25
        int vade = 12;

        // double - ondalıklı sayılarda kullanılır -> 5.25 , 9.25823 , 1500.532500
        double dolarDun = 18.25;
        double dolarBugun = 18.35;

        // boolean - doğru mu yanlış mı - true or false
        boolean dolarDustuMu = true; // true or false

        String okYonu = "";
        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        // array
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};
        // System.out.println(krediler[0]);
        // System.out.println(krediler[1]);
        // System.out.println(krediler[2]);
        // for
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
        /*
        System.out.println();

        for (String kredi: krediler) {
            System.out.println(kredi);
        }
        */
    }
}