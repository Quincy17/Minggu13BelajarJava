import java.util.Scanner;

public class KubusNo20{
    public static int HitungVolume(int sisi){
        int volume = sisi*sisi*sisi;
    return volume;
    }
    public static int HitungLuasPermukaan(int sisi){
        int LuasPermukaan = sisi*sisi*6;
    return LuasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int sisi;
        System.out.print("Masukkan sisi kubus : ");
        sisi = input.nextInt();

        System.out.println("Luas Permukaan Kubus adalah = " + HitungLuasPermukaan(sisi));
        System.out.println("Volume Kubus adalah = " + HitungVolume(sisi));
    }
}