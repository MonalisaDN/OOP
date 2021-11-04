public class Anggota {
    Integer noAnggota;
    String namaAnggota;
    Integer telepon;
    String alamat;

    // fuction atau Method
    void melihatJadwal() {
        System.out.println("Anggota " + namaAnggota + " dengan Nomer anggota " + noAnggota + " sedang Melihat Jadwal");
    }

    void melihatPekerjaan() {
        System.out.println("Anggota " + namaAnggota + " dengan Nomer anggota " + noAnggota + " sedang Melihat Pekerjaan");
    }

    void melihatLaporan() {
        System.out.println("Anggota " + namaAnggota + " dengan Nomer anggota " + noAnggota + " sedang Melihat Laporan");
    }

    void melihatAnggaran() {
        System.out.println("Anggota " + namaAnggota + " dengan Nomer anggota " + noAnggota + " sedang Melihat Anggaran");
    }

    void melihatAnggota() {
        System.out.println("sedang Melihat Anggota bernama " + namaAnggota + " dengan Nomer anggota " + noAnggota);
    }

    void melihatKegiatan() {
        System.out.println("Anggota " + namaAnggota + " dengan Nomer anggota " + noAnggota + " sedang Melihat Kegiatan");
    }
}