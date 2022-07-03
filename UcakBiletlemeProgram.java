import java.util.Scanner;

public class UcakBiletlemeProgram {
    public static void main(String[] args) {

        int yas, tip;
        double mesafe, tutar;

        Scanner imp = new Scanner(System.in);


        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = imp.nextInt();

        System.out.print("Lütfen Km Giriniz: ");
        mesafe = imp.nextDouble();

        System.out.println("Yolculuk Tipinizi Seçiniz: ");
        System.out.println("1-Tek yön\n2-Gidiş Dönüş");
        tip = imp.nextInt();

        tutar = ( mesafe * 0.10);

        if ( yas < 12 ){
            if ( tip == 2){
                tutar = tutar - (( tutar * 0.50) + ( tutar * 0.20));
            }else {
                tutar = tutar - ( tutar * 0.50);
            }

        }else if ( yas >= 12 && yas <= 24 ){
            if (tip==2){
                tutar = tutar - (( tutar * 0.10) + ( tutar * 0.20));
            }else{
                tutar = tutar - ( tutar * 0.10);
            }

        }else if ( yas > 65 ){
            if (tip==2){
                tutar = tutar - (( tutar * 0.30) + ( tutar * 0.20));
            }else{
                tutar = tutar - ( tutar * 0.30);
            }
        }
                 System.out.println(tutar);
    }
}


