import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //PROGRAM INDEKS MASSA TUBUH
        //Rumus: Berat Badan (kg) / Tinggi badan^2 (m)

        //DEKLARASI
        Scanner sc = new Scanner(System.in);
        double bb,tb,hi;
        String nama;

        //WELCOME
        System.out.println("\nPROGRAM INDEKS MASSA TUBUH");
        System.out.println("============================");

        //PROGRAM
        System.out.print("Masukkan nama anda: ");
        nama = sc.nextLine();
        System.out.print("Masukan berat badan anda (kg): ");
        bb = sc.nextDouble();
        System.out.print("Masukkan tinggi badan anda (cm): ");
        tb = sc.nextDouble();

        //OPERASI
        tb = tb / 100; //jadi meter
        hi = bb / Math.pow(tb,2);

        //OUTPUT
        System.out.println("\n===REKAP IMT===\n");
        System.out.printf("Nama: %s", nama);
        System.out.printf("\nBerat Badan: %.2f kg",bb);
        System.out.printf("\nTinggi Badan: %.2f m",tb);
        System.out.println("\n========================");
        System.out.printf("Nilai Indeks Massa Tubuh (IMT) anda: %.1f\n\n",hi);

    }
}
