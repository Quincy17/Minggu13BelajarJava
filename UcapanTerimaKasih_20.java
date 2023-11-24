import java.util.Scanner;
public class UcapanTerimaKasih_20 {

    public static String PenerimaUcapan() {
        Scanner input = new Scanner (System.in);
        System.out.print("Tuliskan nama orang yang ingin Anda beri ucapan:");
        String namaOrang = input.nextLine();
        input.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static String UcapanTambahan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Ucapan Tambahan : ");
        String lastWord= sc.nextLine();
        sc.close();
        return lastWord;
    }

    public static void TambahanUcapan() {
        String kataTerakhir = UcapanTambahan();
        System.out.println(kataTerakhir);
    }

    public static void main(String[] args) {
        TambahanUcapan();
        UcapanTerimaKasih();
        
    }
}