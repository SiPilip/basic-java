import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      /*
    0 = Gunting
    1 = Batu
    2 = Kertas

    Gunting & Batu = Batu
    Batu & Kertas = Kertas
    Kertas & Gunting = Gunting

     */

    //DEKLARASI
    Scanner sc = new Scanner(System.in);
    String pilihuser;
    int skorkomp,skoruser;

    //INISIASI
        skorkomp = 0;
        skoruser = 0;

    //WELCOME
        System.out.println("Komputer: Ayo bermain gunting, batu, kertas, wahai manusia!");
        System.out.println("Kamu: Ayo!");
        System.out.println("Komputer: Jika kamu berhasil mengalahkanku, kamu akan jadi pemenangnya!");

        while (skorkomp <= 3 || skoruser <= 3){

            System.out.println("\n"+"Komputer: Gunting, batu, kertas!");

            System.out.print("("+skoruser+") "+"Manusia: ");

            //Proses Komputer
            int pilihkomp = (int) (Math.random() * 3);

            // Proses Manusia
            pilihuser = sc.nextLine();

            if (pilihuser.equalsIgnoreCase("Gunting")) {
                if (pilihkomp == 0) {
                    System.out.println("("+skorkomp+") "+"Komputer: Gunting!");
                }
                if (pilihkomp == 1) {
                    System.out.println("("+skorkomp+") "+"Komputer: Batu!");
                    skorkomp++;
                }
                if (pilihkomp == 2) {
                    System.out.println("("+skorkomp+") "+"Komputer: Kertas!");
                    skoruser++;
                }
            }
            if (pilihuser.equalsIgnoreCase("Batu")) {
                if (pilihkomp == 0) {
                    System.out.println("("+skorkomp+") "+"Komputer: Gunting!");
                    skoruser++;
                }
                if (pilihkomp == 1) {
                    System.out.println("("+skorkomp+") "+"Komputer: Batu!");
                }
                if (pilihkomp == 2) {
                    System.out.println("("+skorkomp+") "+"Komputer: Kertas!");
                    skorkomp++;
                }
            }
            if (pilihuser.equalsIgnoreCase("Kertas")) {
                if (pilihkomp == 0) {
                    System.out.println("("+skorkomp+") "+"Komputer: Gunting!");
                    skorkomp++;
                }
                if (pilihkomp == 1) {
                    System.out.println("("+skorkomp+") "+"Komputer: Batu!");
                    skoruser++;
                }
                if (pilihkomp == 2) {
                    System.out.println("("+skorkomp+") "+"Komputer: Kertas!");
                }
            }
            if (!(pilihuser.equalsIgnoreCase("Kertas") ||
                    pilihuser.equalsIgnoreCase("Batu") ||
                    pilihuser.equalsIgnoreCase("skor") ||
                    pilihuser.equalsIgnoreCase("Gunting"))) {
                System.out.println("Komputer: ???");
                continue;
            }

            if (skorkomp == 3) {
                System.out.println("\n");
                System.out.println("Komputer: UPS, KAMU KALAH!");
                break;
            } if (skoruser == 3) {
                System.out.println("\n");
                System.out.println("Komputer: SELAMAT, KAMU MENANG!");
                break;
            } else {
                continue;
            }

        }


    }
}
