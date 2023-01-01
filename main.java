package rojik;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int menu;
        laundry a = new laundry();
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                                                                       |");
        System.out.println("|                          LAUNDRY ROJIK                                |");
        System.out.println("|      BAJU RP.6000/KG || JAKET RP.9000/KG || KARPET RP.12.000/KG       |");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                        SELAMAT DATANG DI MENU           ");
        System.out.println("-------------------------------------------------------------------------");
        do {
            System.out.println("1.LAUNDRY BAJU");
            System.out.println("2.LAUNDRY JAKET");
            System.out.println("3.LAUNDRY KARPET");
            System.out.println("4.BUAT MEMBER");
            System.out.println("4.KELUAR");
            System.out.printf("MASUKAN PILIHAN ANDA = ");
            menu = input.nextInt();
            if (menu==1){
                a.baju();
            } else if (menu==2) {
                a.jaket();
            } else if (menu==3) {
                a.karpet();
            } else if (menu==4) {
                a.member();
            }else if (menu==5){
                System.out.println("SEMOGA ANDA PUAS !!!!!!!");
            }else {
                System.out.println("DATA TIDAK VALID");
            }
        }while (menu !=5);
        }
}
