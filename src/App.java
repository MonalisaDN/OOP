public class App {
    public static void main(String[] args){
        Anggota anggota = new Anggota();
        Ketua Ketua = new Ketua();
        KetuaPanitia KetuaPanitia = new KetuaPanitia();
        anggota.namaAnggota = "Budi";
        anggota.noAnggota =  1234567 ;
        Ketua.namaAnggota = "Sari";
        Ketua.noAnggota = 1345897 ;
        Ketua.periode = " 2 thn";
        KetuaPanitia.namaAnggota = "Bambang";
        KetuaPanitia.noAnggota = 1456789;
        KetuaPanitia.periode = "6 bln";

     
        anggota.melihatAnggaran();
        System.out.println("==========================================");
        
        Ketua.menyetujuiAnggaran();
        System.out.println("==========================================");
       
        KetuaPanitia.menyetujuiAnggaran();
        System.out.println("==========================================");
        System.out.println("Sekian Terima kasih");
        
    }
}