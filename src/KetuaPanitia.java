public class KetuaPanitia extends Panitia{
    
    //Method

    public String periode;

    void menyetujuiAnggaran() {
        System.out.println("Ketua panitia " + namaAnggota + " dengan " + "no anggota " + noAnggota + " Menyetujui Anggaran" +  " selama " + periode);
    }

    void menyetujuiPekerjaan() {
        System.out.println("Ketua panitia " + namaAnggota + " dengan " + "no anggota " + noAnggota + " Menyetujui Pekerjaan" +  " selama " + periode);
    }

    void menyetujuiJadwal() {
        System.out.println("Ketua panitia " + namaAnggota +  " dengan " + "no anggota " + noAnggota + " Menyetujui Jadwal" +  " selama " + periode);
        System.out.println("Test aja");    }
}
