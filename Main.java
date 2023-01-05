import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu;
        Laundry a = new Laundry();
        Scanner input = new Scanner(System.in);
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                            |");
        System.out.println("|                                       LAUNDRY ROZIK                                        |");
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("|   BAJU RP.6000/KG || SEPATU RP.9000/KG || KARPET RP.60000/LEMBAR  ||  JAKET RP.10000/KG    |");
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("|                                 DIJAMIN BERSIH DAN WANGI                                   |");
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("|                                  SELAMAT DATANG DI MENU                                    |");
        System.out.println("|--------------------------------------------------------------------------------------------|");
        do {
            System.out.println();
            System.out.println("[1].Buat Member");
            System.out.println("[2].Laundry Baju");
            System.out.println("[3].Laundry Sepatu");
            System.out.println("[4].Laundry Karpet");
            System.out.println("[5].Laundry Jaket");
            System.out.println("[0].Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = input.nextInt();

            if (menu == 1) {
                a.member();
            } else if (menu == 2) {
                a.baju();
            } else if (menu == 3) {
                a.sepatu();
            } else if (menu == 4) {
                a.karpet();
            } else if (menu == 5) {
                a.jaket();
            }else if (menu == 0){
                System.out.println("Semoga Anda Puas");
            }else{
                System.out.println("Inputan Yang Anda Masukkan Tidak Valid \n Silahkan Masukkan Inputan Yang Valid ");
            }
        } while (menu != 0);
    }
}

