import java.util.Scanner;
public class Ucapan_20{
    public static String PenerimaUcapan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tulikan nama orang yang ingin anda beri ucapan");
        String namaOrang = input.next();
        
        return namaOrang;    
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thankyou " +nama+"\nMay the force be with you");
         
    }
}