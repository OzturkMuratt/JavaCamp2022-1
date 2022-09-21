public class Main {
    public static void main(String[] args) {

        String ogrenci1="MURAT";
        String ogrenci2="ALİ";
        String ogrenci3="EREN";
        String ogrenci4="MAZLUM";

        String[] sinif=new String[4];

        sinif[0]="1.sınıf";
        sinif[1]="2.sınıf";
        sinif[2]="3.sınıf";
       // sinif[3]="4.sınıf";
        for (int i=0;i< sinif.length;i++){
            System.out.println(sinif[i]);
        }
System.out.println("-----------------------------------------------------");


        String[] ogrenciler={"MAZLUM","ALİ","EREN","MURAT"};

        for(String ogrencisay:ogrenciler) {
            System.out.println(ogrencisay);

        }

        for (int i=0;i< sinif.length;i++){
            sinif[i]=ogrenciler[i];
        }


        for(String asd:ogrenciler){
            for (int i = 0; i< sinif.length;i++){
                sinif[i]=asd;
                System.out.println(sinif[i]);
            }

        }
                /*("Hello world!");*/
    }
}