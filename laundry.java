package rojik;

import java.io.File;
import java.util.Scanner;

public class laundry implements jenis{
    public int berat;
    public String jenis;
    public String nama,notelp,alamat,tanggal;
    public int uang,kembalian;
    java.io.File file = new File("notalaundry.txt");

    public void member(){
        Scanner input = new Scanner(System.in);
        int cetak;
        int id;
            System.out.print("MASUKAN NAMA      = ");
            nama = input.next();
            System.out.print("ALAMAT            = ");
            alamat = input.next();
            System.out.print("NO TELP         = ");
            notelp = input.next();
            System.out.print("TANGGAL         = ");
            tanggal = input.next();
            System.out.println("APAKAH ANDA INGIN MENCETAK KARTU?");
            System.out.println("1.ya            ||     2.tidak   ");
            cetak = input.nextInt();
            if (cetak==1){
                java.io.File file = new File("member.txt");
                try {
                    java.io.PrintWriter tulis = new java.io.PrintWriter(file);
                    tulis.print("MEMBER ID         = ");
                    for (int i = 0; i < 10; i++) {
                        id = (int) (Math.random() * 10 + 1);
                        tulis.print(id);
                    }
                    tulis.println();
                    tulis.println("NAMA MEMBER       = "+nama);
                    tulis.println("ALAMAT            = "+alamat);
                    tulis.println("TANGGAL           = "+tanggal);
                    tulis.println("NO TELP           = "+notelp);
                    tulis.close();
                }catch (Exception error){
                    System.out.println(error);
                }
            }else if (cetak==2){
                System.out.print("MEMBER ID       = ");
                for (int i = 0; i < 10; i++) {
                    id = (int) (Math.random() * 10 + 1);
                    System.out.print(id);
                }
                System.out.println();
                System.out.print("NAMA  MEMBER    = "+nama);
                System.out.print("ALAMAT          = "+alamat);
                System.out.print("NO TELP         = "+notelp);
                System.out.print("TANGGAL         = "+tanggal);
            }else {
                System.out.println("DATA YANG DIMASUKAN TIDAK VALID");
            }
    }
    @Override
    public void jaket() {
        int total;
        int harga = 9000;
        try {
            Scanner a = new Scanner(System.in);
            java.io.PrintWriter out = new java.io.PrintWriter(file);
            System.out.printf("MASUKAN NAMA KONSUMEN = ");
            nama = a.nextLine();
            System.out.printf("MASUKAN NO TELP       = ");
            notelp = a.nextLine();
            System.out.printf("MASUKAN JENIS PAKAIAN = ");
            jenis = a.nextLine();
            System.out.printf("MASUKAN BERAT (KG)    = ");
            berat = a.nextInt();
            System.out.println("HARGA PER (KG)        = " + harga);
            total = berat * harga;
            System.out.println();
            System.out.println("JUMLAH BAYAR         = " + total);
            System.out.print("MASUKAN UANG ANDA    = ");
            uang = a.nextInt();
            kembalian = uang-total;
            System.out.println();
            System.out.print("KEMBALIAN            = "+kembalian);
            System.out.println();
            System.out.println("|=================================================|");
            System.out.println("|           DATA PELANGGAN                        |");
            System.out.println("|=================================================|");
            System.out.println("NAMA PELANGGAN       = " + nama);
            System.out.println("NO TELEPON           = " + notelp);
            System.out.println("JENIS LAUNDRY        = " + jenis);
            System.out.println("BERAT TOTAL          = " + berat);
            System.out.println("JUMLAH BAYAR         = " + total);
            System.out.println();
            //CETAK STRUK PEMBAYARAN
            out.println("=================================================");
            out.println("                STRUK PEMBAYARAN");
            out.println("=================================================");
            out.println("NAMA PELANGGAN            = "+nama);
            out.println("NO TELEPON                = "+notelp);
            out.println("JENIS LAUNDRY             = "+jenis);
            out.println("BERAT(KG)                 = "+berat);
            out.println("JUMLAH PEMBAYARAN         = "+total);
            out.println("JUMLAH DIBAYAR            = "+uang);
            out.println("KEMBALIAN                 = "+kembalian);
        }catch (Exception e){
            System.out.println(e);
        }
    }


    @Override
    public void baju() {
        int tot;
        int harga2=6000;
        try {
            Scanner a = new Scanner(System.in);
            java.io.PrintWriter out = new java.io.PrintWriter(file);
            System.out.printf("MASUKAN NAMA KONSUMEN = ");
            nama = a.nextLine();
            System.out.printf("MASUKAN NO TELP       = ");
            notelp = a.nextLine();
            System.out.printf("MASUKAN JENIS PAKAIAN = ");
            jenis = a.nextLine();
            System.out.printf("MASUKAN BERAT (KG)    = ");
            berat = a.nextInt();
            System.out.printf("HARGA PER (KG)        = " + harga2);
            tot = berat * harga2;
            System.out.println("JUMLAH BAYAR         = " + tot);
            System.out.println();
            System.out.print("MASUKAN UANG ANDA    = ");
            uang = a.nextInt();
            kembalian = uang-tot;
            System.out.println();
            System.out.print("KEMBALIAN            = "+kembalian);
            System.out.println();
            System.out.println("=================================================");
            System.out.println("           DATA PELANGGAN                        ");
            System.out.println("=================================================");
            System.out.println("NAMA PELANGGAN       = " + nama);
            System.out.println("NO TELEPON           = " + notelp);
            System.out.println("JENIS LAUNDRY        = " + jenis);
            System.out.println("BERAT TOTAL          = " + berat);
            System.out.println("JUMLAH BAYAR         = " + tot);
            System.out.println();
            //CETAK STRUK PEMBAYARAN
            out.println("=================================================");
            out.println("                STRUK PEMBAYARAN");
            out.println("=================================================");
            out.println("NAMA PELANGGAN            = "+nama);
            out.println("NO TELEPON                = "+notelp);
            out.println("JENIS LAUNDRY             = "+jenis);
            out.println("BERAT(KG)                 = "+berat);
            out.println("JUMLAH PEMBAYARAN         = "+tot);
            out.println("JUMLAH DIBAYAR            = "+uang);
            out.println("KEMBALIAN                 = "+kembalian);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void karpet() {
        int tot2;
        int harga3=12000;
        try {
            Scanner a = new Scanner(System.in);
            java.io.PrintWriter out = new java.io.PrintWriter(file);
            System.out.printf("MASUKAN NAMA KONSUMEN = ");
            nama = a.nextLine();
            System.out.printf("MASUKAN NO TELP       = ");
            notelp = a.nextLine();
            System.out.printf("MASUKAN JENIS PAKAIAN = ");
            jenis = a.nextLine();
            System.out.printf("MASUKAN BERAT (KG)    = ");
            berat = a.nextInt();
            System.out.printf("HARGA PER (KG)        = " + harga3);
            tot2 = berat * harga3;
            System.out.println();
            System.out.println("JUMLAH BAYAR         = " + tot2);
            System.out.print("MASUKAN UANG ANDA    = ");
            uang = a.nextInt();
            kembalian = uang-tot2;
            System.out.println();
            System.out.print("KEMBALIAN            = "+kembalian);
            System.out.println();
            System.out.println("=================================================");
            System.out.println("           DATA PELANGGAN                        ");
            System.out.println("=================================================");
            System.out.println("NAMA PELANGGAN       = " + nama);
            System.out.println("NO TELEPON           = " + notelp);
            System.out.println("JENIS LAUNDRY        = " + jenis);
            System.out.println("BERAT TOTAL          = " + berat);
            System.out.println("JUMLAH BAYAR         = " + tot2);
            System.out.println();
            //CETAK STRUK PEMBAYARAN
            out.println("=================================================");
            out.println("                STRUK PEMBAYARAN");
            out.println("=================================================");
            out.println("NAMA PELANGGAN            = "+nama);
            out.println("NO TELEPON                = "+notelp);
            out.println("JENIS LAUNDRY             = "+jenis);
            out.println("BERAT(KG)                 = "+berat);
            out.println("JUMLAH PEMBAYARAN         = "+tot2);
            out.println("JUMLAH DIBAYAR            = "+uang);
            out.println("KEMBALIAN                 = "+kembalian);
            out.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
