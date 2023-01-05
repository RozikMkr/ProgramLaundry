import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Laundry implements Jenis{

    int max = 500;
    int up = 0;
    Scanner menu = new Scanner(System.in);
    int[] berat = new int[max];
    int[] uang = new int[max];
    String[]  jenis = new String[max];
    String[] nama = new String[max];
    String[] notelp = new String[max];
    String[] alamat = new String[max];
    String[] tgl = new String[max];

    int[] kembalian =new int[max];




    @Override
    public void member() {
        java.io.File file=new File("member.txt");
        try {
            java.io.PrintWriter out = new PrintWriter("member.txt");
            System.out.println("|===========================|");
            System.out.println("|       Daftar Member       |");
            System.out.println("|===========================|");
            System.out.print("Masukkan Nama           :");
            nama[up] = menu.next();
            System.out.print("Masukkan NoTelpon       :");
            notelp[up] = menu.next();
            System.out.print("Masukkan Alamat         :");
            alamat[up] = menu.next();
            System.out.print("Tanggal Registrasi      :");
            tgl[up] = menu.next();
            System.out.println();
            System.out.println("Selamat Anda Berhasil Menjadi Member ");
            System.out.println("Silahkan Cek member.txt untuk Data Anda");
            out.println("Nama           :"+nama[up]);
            out.println("No Telpon      :"+notelp[up]);
            out.println("Alamat         :"+alamat[up]);
            out.println("Tanggal Regis  :"+tgl[up]);
            out.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public void baju() {
        int tot, pil;
        int hargabaju = 6000;
        String va;
            System.out.println("|==========================|");
            System.out.println("|      Baju Rp.6000/kg     |");
            System.out.println("|==========================|");
            System.out.print("Masukkan Nama           :");
            nama[up] = menu.next();
            System.out.print("Masukkan NoTelpon       :");
            notelp[up] = menu.next();
            System.out.print("Masukkan Alamat         :");
            alamat[up] = menu.next();
            System.out.print("Jenis Laundry           :");
            jenis[up] = menu.next();
            System.out.print("Masukkan Berat (Kg)     :");
            berat[up] = menu.nextInt();
            System.out.println("Harga Per/Kg            :" + hargabaju);
            tot = berat[up] * hargabaju;
            System.out.println("Jumlah Bayar            :" + tot);
            System.out.println();
            System.out.println("Pilih Metode Pembayaran :");
            System.out.println("1.Langsung            ||     2.Debit   ");
            System.out.print("Masukkan Pilihan Anda   :");
            pil = menu.nextInt();
            if (pil == 1) {
                System.out.print("Masukkan Uang Anda      :");
                uang[up] = menu.nextInt();
                kembalian[up] = uang[up] - tot;
                System.out.println("Kembalian               :" + kembalian[up]);

                //Struk Pembayaran
                System.out.println("|===========================|");
                System.out.println("|      STRUK PEMBAYARAN     |");
                System.out.println("|===========================|");
                System.out.println("Nama             :" + nama[up]);
                System.out.println("No Telpon        :" + notelp[up]);
                System.out.println("Alamat           :" + alamat[up]);
                System.out.println("Jenis Laundry    :" + jenis[up]);
                System.out.println("Berat (Kg)       :" + berat[up]+" Kg");
                System.out.println("Jumlah Bayar  Rp.:" + tot);
                System.out.println("Uang Anda     Rp.:" + uang[up]);
                System.out.println("Kembalian        :" + kembalian[up]);
                System.out.println();
                System.out.println("==SILAHKAN DATANG 3 HARI LAGI UNTUK MENGAMBIL BARANG ANDA===");
                System.out.println("Terima Kasih ");
            } else if (pil == 2) {
                System.out.print("Silahkan Masukan Nomor Virtual Account  :");
                va = menu.next();
                System.out.println();
                //struk Pembayaran
                System.out.println("|===========================|");
                System.out.println("|      STRUK PEMBAYARAN     |");
                System.out.println("|===========================|");
                System.out.println();
                System.out.println("Nama            :" + nama[up]);
                System.out.println("No Telpon       :" + notelp[up]);
                System.out.println("Alamat          :" + alamat[up]);
                System.out.println("Jenis Laundry   :" + jenis[up]);
                System.out.println("Berat (Kg)      :" + berat[up]+" Kg");
                System.out.println("Jumlah Bayar Rp.:" + tot);
                System.out.println("Nomor VA        :" + va);
                System.out.println();
                System.out.println("==SILAHKAN DATANG 3 HARI LAGI UNTUK MENGAMBIL BARANG ANDA===");
                System.out.println("Terima Kasih ");
            } else
                System.out.println("!!!Pilihan Anda Salah!!!");

    }

    @Override
    public void sepatu() {
        int tot1, pil1;
        int hargasepatu = 30000;
        String va;
        System.out.println("|============================|");
        System.out.println("|     Sepatu 30000/pasang    |");
        System.out.println("|============================|");
        System.out.print("Masukkan Nama           :");
        nama[up] = menu.next();
        System.out.print("Masukkan NoTelpon       :");
        notelp[up] = menu.next();
        System.out.print("Masukkan Alamat         :");
        alamat[up] = menu.next();
        System.out.print("Jenis Sepatu            :");
        jenis[up] = menu.next();
        System.out.print("Masukkan Banyak         :");
        berat[up] = menu.nextInt();
        System.out.println("Harga Per/Pasang        :"+hargasepatu);
        tot1 = berat[up] * hargasepatu;
        System.out.println("Jumlah Bayar            :"+tot1);
        System.out.println();
        System.out.println("Pilih Metode Pembayaran :");
        System.out.println("1.Langsung            ||     2.Debit   ");
        System.out.print("Masukkan Pilihan Anda   :");
        pil1 = menu.nextInt();
        if (pil1 == 1){
            System.out.print("Masukkan Uang Anda      Rp.:");
            uang[up] = menu.nextInt();
            kembalian[up] = uang[up] - tot1;
            System.out.println("Kembalian               :"+kembalian[up]);

            //Struk Pembayaran
            System.out.println("|===========================|");
            System.out.println("|      STRUK PEMBAYARAN     |");
            System.out.println("|===========================|");
            System.out.println("Nama             :"+nama[up]);
            System.out.println("No Telpon        :"+notelp[up]);
            System.out.println("Alamat           :"+alamat[up]);
            System.out.println("Jenis Sepatu     :"+jenis[up]);
            System.out.println("Banyak Pasang    :"+berat[up]+" Pasang");
            System.out.println("Jumlah Bayar  Rp.:"+tot1);
            System.out.println("Uang Anda     Rp.:"+uang[up]);
            System.out.println("Kembalian     Rp.:"+kembalian[up]);
            System.out.println("==SILAHKAN DATANG 3 HARI LAGI UNTUK MENGAMBIL BARANG ANDA===");
            System.out.println("Terima Kasih ");
        }else if (pil1 == 2){
            System.out.print("Silahkan Masukan Nomor Virtual Account  :");
            va = menu.next();
            System.out.println();
            //struk Pembayaran
            System.out.println("|===========================|");
            System.out.println("|      STRUK PEMBAYARAN     |");
            System.out.println("|===========================|");
            System.out.println();
            System.out.println("Nama             :"+nama[up]);
            System.out.println("No Telpon        :"+notelp[up]);
            System.out.println("Alamat           :"+alamat[up]);
            System.out.println("Jenis Sepatu     :"+jenis[up]);
            System.out.println("Banyak Pasang    :"+berat[up]+" Pasang");
            System.out.println("Jumlah Bayar  Rp.:"+tot1);
            System.out.println("Nomor VA         :"+va);
            System.out.println("==SILAHKAN DATANG 3 HARI LAGI UNTUK MENGAMBIL BARANG ANDA===");
            System.out.println("Terima Kasih ");
        }else
            System.out.println("!!!Pilihan Anda Salah!!!");


    }

    @Override
    public void karpet() {
        int tot2, pil2;
        int hargakarpet = 60000;
        String va;
        System.out.println("|============================|");
        System.out.println("|     Karpet 60000/Lembar    |");
        System.out.println("|============================|");
        System.out.print("Masukkan Nama           :");
        nama[up] = menu.next();
        System.out.print("Masukkan NoTelpon       :");
        notelp[up] = menu.next();
        System.out.print("Masukkan Alamat         :");
        alamat[up] = menu.next();
        System.out.print("Jenis Karpet            :");
        jenis[up] = menu.next();
        System.out.print("Masukkan Banyak         :");
        berat[up] = menu.nextInt();
        System.out.println("Harga Per/Lembar        :"+hargakarpet);
        tot2 = berat[up] * hargakarpet;
        System.out.println("Jumlah Bayar            :"+tot2);
        System.out.println();
        System.out.println("Pilih Metode Pembayaran :");
        System.out.println("1.Langsung            ||     2.Debit   ");
        System.out.print("Masukkan Pilihan Anda   :");
        pil2 = menu.nextInt();
        if (pil2 == 1){
            System.out.print("Masukkan Uang Anda      Rp.:");
            uang[up] = menu.nextInt();
            kembalian[up] = uang[up] - tot2;
            System.out.println("Kembalian               :"+kembalian[up]);

            //Struk Pembayaran
            System.out.println("|===========================|");
            System.out.println("|      STRUK PEMBAYARAN     |");
            System.out.println("|===========================|");
            System.out.println("Nama             :"+nama[up]);
            System.out.println("No Telpon        :"+notelp[up]);
            System.out.println("Alamat           :"+alamat[up]);
            System.out.println("Jenis Karpet     :"+jenis[up]);
            System.out.println("Banyak Karpet    :"+berat[up]+" Lembar");
            System.out.println("Jumlah Bayar  Rp.:"+tot2);
            System.out.println("Uang Anda     Rp.:"+uang[up]);
            System.out.println("Kembalian     Rp.:"+kembalian[up]);
            System.out.println("==SILAHKAN DATANG 3 HARI LAGI UNTUK MENGAMBIL BARANG ANDA===");
            System.out.println("Terima Kasih ");
        }else if (pil2 == 2){
            System.out.print("Silahkan Masukan Nomor Virtual Account  :");
            va = menu.next();
            System.out.println();
            //struk Pembayaran
            System.out.println("|===========================|");
            System.out.println("|      STRUK PEMBAYARAN     |");
            System.out.println("|===========================|");
            System.out.println();
            System.out.println("Nama             :"+nama[up]);
            System.out.println("No Telpon        :"+notelp[up]);
            System.out.println("Alamat           :"+alamat[up]);
            System.out.println("Jenis Karpet     :"+jenis[up]);
            System.out.println("Banyak Karpet    :"+berat[up]+" Lembar");
            System.out.println("Jumlah Bayar  Rp.:"+tot2);
            System.out.println("Nomor VA         :"+va);
            System.out.println("==SILAHKAN DATANG 3 HARI LAGI UNTUK MENGAMBIL BARANG ANDA===");
            System.out.println("Terima Kasih ");
        }else
            System.out.println("!!!Pilihan Anda Salah!!!");
    }

    @Override
    public void jaket() {
        int tot3, pil3;
        int hargajaket = 60000;
        String va;
        System.out.println("|============================|");
        System.out.println("|       Jaket 10000/Kg       |");
        System.out.println("|============================|");
        System.out.print("Masukkan Nama           :");
        nama[up] = menu.next();
        System.out.print("Masukkan NoTelpon       :");
        notelp[up] = menu.next();
        System.out.print("Masukkan Alamat         :");
        alamat[up] = menu.next();
        System.out.print("Jenis Jaket             :");
        jenis[up] = menu.next();
        System.out.print("Masukkan Banyak  (Kg)   :");
        berat[up] = menu.nextInt();
        System.out.println("Harga Per (Kg)          :"+hargajaket);
        tot3 = berat[up] * hargajaket;
        System.out.println("Jumlah Bayar            :"+tot3);
        System.out.println();
        System.out.println("Pilih Metode Pembayaran :");
        System.out.println("1.Langsung            ||     2.Debit   ");
        System.out.print("Masukkan Pilihan Anda   :");
        pil3 = menu.nextInt();
        if (pil3 == 1){
            System.out.print("Masukkan Uang Anda      Rp.:");
            uang[up] = menu.nextInt();
            kembalian[up] = uang[up] - tot3;
            System.out.println("Kembalian               :"+kembalian[up]);

            //Struk Pembayaran
            System.out.println("|===========================|");
            System.out.println("|      STRUK PEMBAYARAN     |");
            System.out.println("|===========================|");
            System.out.println("Nama             :"+nama[up]);
            System.out.println("No Telpon        :"+notelp[up]);
            System.out.println("Alamat           :"+alamat[up]);
            System.out.println("Jenis Jaket      :"+jenis[up]);
            System.out.println("Berat Jaket      :"+berat[up]+" Kg");
            System.out.println("Jumlah Bayar  Rp.:"+tot3);
            System.out.println("Uang Anda     Rp.:"+uang[up]);
            System.out.println("Kembalian     Rp.:"+kembalian[up]);
            System.out.println("==SILAHKAN DATANG 3 HARI LAGI UNTUK MENGAMBIL BARANG ANDA===");
            System.out.println("Terima Kasih ");
        }else if (pil3 == 2){
            System.out.print("Silahkan Masukan Nomor Virtual Account  :");
            va = menu.next();
            System.out.println();
            //struk Pembayaran
            System.out.println("|===========================|");
            System.out.println("|      STRUK PEMBAYARAN     |");
            System.out.println("|===========================|");
            System.out.println();
            System.out.println("Nama             :"+nama[up]);
            System.out.println("No Telpon        :"+notelp[up]);
            System.out.println("Alamat           :"+alamat[up]);
            System.out.println("Jenis Jaket      :"+jenis[up]);
            System.out.println("Banyak Jaket     :"+berat[up]+" Kg");
            System.out.println("Jumlah Bayar  Rp.:"+tot3);
            System.out.println("Nomor VA         :"+va);
            System.out.println("==SILAHKAN DATANG 3 HARI LAGI UNTUK MENGAMBIL BARANG ANDA===");
            System.out.println("Terima Kasih ");
        }else
            System.out.println("!!!Pilihan Anda Salah!!!");

    }
}
