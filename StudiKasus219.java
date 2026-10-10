import java.util.Scanner;

public class StudiKasus219 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkat, statusPendanaan;

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Jenis kegiatan: (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya)");
        jenisKegiatan = input.nextLine().toLowerCase();

        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma") || jenisKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Masukkan jumlah dokumen: ");
            jumlahDokumen = input.nextInt();
            System.out.print("Masukkan peringkat: ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Dokumen lengkap, dana penghargaan diberikan.");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
        }
    }
}
