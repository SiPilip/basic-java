import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*

        =============
        PROGRAM NILAI
        =============

        DESKRIPSI PROGRAM
        MAPEL A, B, C, D, E

        -) Menginput seluruh data mapel
        -) Menngambil nilai terbesar (Cth: Nilai Terbesar = A (xx)
        -) Mengambil nilai terkecil (cth: Nilai terkecil = B (xx)
        -) Nyatakan mata pelajaran yang tidak lulus (Cth: Mapel A, Mapel B)
        -) Merata ratakan seluruh nilai mata pelajara
        -) MengPREDIKATkan rata rata dari seluruh mata peljaran

        A = 90-100
        B = 80-89,9
        C = 70 - 79,9 (TIDAK LULUS)
        D < 69,9

         */

        //DEKLRASI
        Scanner sc = new Scanner(System.in);
        double a,b,c,d,e;

        //WELCOME
        System.out.println("=================");
        System.out.println("DATA NILAI MAPEL");
        System.out.println("=================");

        //INPUT NILAI
        System.out.print("Masukkan nilai Agama: ");
        a = sc.nextDouble();
        System.out.print("Masukkan nilai PPKN: ");
        b = sc.nextDouble();
        System.out.print("Masukkan nilai Matematika: ");
        c = sc.nextDouble();
        System.out.print("Masukkan nilai Biologi: ");
        d = sc.nextDouble();
        System.out.print("Masukkan nilai Fisika: ");
        e = sc.nextDouble();

        if (a<0 || b<0 || c<0 || d<0 || e<0){
            System.exit(0);
        }

        if (a>100 || b>100 || c>100 || d>100 || e>100){
            System.exit(0);
        }

        //MENGAMBIL NILAI TERBESAR
        System.out.println("\n=======================");
        System.out.println("NILAI TERBESAR");
        if (a >= b && a >=c && a >=d && a >=e ) {
            System.out.println("-) Agama: " + a);
        }
        if (b >= a && b >=c && b >=d && b >=e ) {
            System.out.println("-) PPKN: " + b);
        }
        if (c >= a && c >=b && c >=d && c >=e ){
            System.out.println("-) Matematika: " + c);
        }
        if (d >= a && d >=b && d >=c && d >=e){
            System.out.println("-) Biologi: " + d);
        }
        if (e >= a && e >=b && e >=c && e >=d) {
            System.out.println("-) Fisika: " + e);
        }

        //MENGAMBIL NILAI TERKECIL
        System.out.println("NILAI TERKECIL");
        if (a <= b && a <=c && a <=d && a <=e ) {
            System.out.println("-) Agama: " + a);
        }
        if (b <= a && b <=c && b <=d && b <=e ) {
            System.out.println("-) PPKN: "+ b);
        }
        if (c <= a && c<=b && c <=d && c <=e ){
            System.out.println("-) Matematika: "+ c);
        }
        if (d <= a && d <=b && d <=c && d <=e){
            System.out.println("-) Biologi: "+ d);
        }
        if (e <= a && e <=b && e <=c && e <=d) {
            System.out.println("-) Fisika: "+ e);
        }
        System.out.println("=======================");
        

        //MATA PELAJARAN YANG TIDAK LULUS
        System.out.println("\n=======================");
        System.out.println("MATA PELAJARAN YANG TIDAK LULUS: ");
        if (a < 70){
            System.out.println("-) Agama: " + a);
        }
        if (b < 70){
            System.out.println("-) PPKN: " + b);
        }
        if (c < 70){
            System.out.println("-) Matematika: " + c);
        }
        if (d < 70){
            System.out.println("-) Biologi: " + d);
        }
        if (e < 70){
            System.out.println("-) Fisika: " + e) ;
        }
        System.out.println("=====================");
        
        //RATA RATA
        double ratarata;
        ratarata = ((a+b+c+d+e)/5);
        System.out.println("\n=======================");
        System.out.println("RATA RATA NILAI: " + ratarata);
        System.out.println("=======================");

//        A = 90-100 | 90 <= A <= 100 | 90 ------ 100
//        B = 80-89,9 | 80 ----- 89,9
//        C = 70 - 79,9 (TIDAK LULUS)
//        D < 69,9
        //PREDIKAT NILAI
        System.out.println("\n=======================");
        System.out.println("PREDIKAT RATA-RATA");
        if (ratarata >= 90 && ratarata <= 100 ){
            System.out.println("PREDIKAT: (A)");
        }
        if (ratarata >= 80 && ratarata<90){
            System.out.println("PREDIKAT: (B)");
        }
        if (ratarata >= 70 && ratarata<80){
            System.out.println("PREDIKAT: (C)");
        }
        if (ratarata < 70){
            System.out.println("PREDIKAT: (D)");
        }
        System.out.println("=======================");



    }
}
