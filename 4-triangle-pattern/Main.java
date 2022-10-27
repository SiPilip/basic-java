import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Pattern A        Pattern B        Pattern C        Pattern D
        1                1 2 3 4 5 6                1      1 2 3 4 5 6
        1 2              1 2 3 4 5                2 1        1 2 3 4 5
        1 2 3            1 2 3 4                3 2 1          1 2 3 4
        1 2 3 4          1 2 3                4 3 2 1            1 2 3
        1 2 3 4 5        1 2                5 4 3 2 1              1 2
        1 2 3 4 5 6      1                6 5 4 3 2 1                1
         */

        //DEKLARASI
        Scanner sc = new Scanner(System.in);
        String pilihan;
        int i,n,j,tinggi;

        //INISIASI
    pilihan = "A";

        //PROGRAM START


        System.out.print("Pilih Pattern A / B / C / D: Pattern ");
        pilihan = sc.nextLine();
        System.out.println("-------------------------------------");

        //Case open
        switch (pilihan) {
            case "A":
                //INPUT TINGGI SEGITIGA
                System.out.print("Masukkan tinggi segitiga: ");
                tinggi = sc.nextInt();


                //LOOPING
                System.out.println("Pattern A");
                for (i = 1;i <= tinggi;i++) {
                    for (n = 1; n <= i; n++) {
                        System.out.print(n + " ");
                    }
                    System.out.print("\n");
                }break;

            case "B":
                //INPUT TINGGI SEGITIGA
                System.out.print("Masukkan tinggi segitiga: ");
                tinggi  = sc.nextInt();
                n = tinggi;

                //LOOPING
                System.out.println("Pattern B");
                for (i = tinggi;i>0;i--){ //i=5
                   for (n=1;n<=i;n++){
                        System.out.print(n + " ");
                   }
                   System.out.print("\n");
                }break;


            case "C":
                //INPUT TINGGI SEGITIGA
                System.out.print("Masukkan tinggi segitiga: ");
                tinggi = sc.nextInt();
                i = 1;
                n = 0;
                j = 0;

                //LOOPING + SELEKSI
                for (i=1; i <= tinggi; i++) {
                    for (j = tinggi - i; j >= 1; j--) {
                        System.out.print("  ");
                    }
                    for (n = i; n >= 1; n--) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                }break;

            case "D":
                //INPUT TINGGI SEGITIGA
                System.out.print("Masukkan tinggi segitiga: ");
                tinggi  = sc.nextInt();
                i = 0;
                n = 0;
                j = 0;

                //LOOPING
                for ( i = 0; i < tinggi; i++) {
                    for ( j = 0; j < i; j++) {
                        System.out.print("  ");
                    }
                    for ( n = 0; n < tinggi - i; n++) {
                        System.out.print((n + 1) + " ");
                    }
                    System.out.println();
                }break;


            default:
                System.out.println("Tidak Valid!");
        }

    }
}
