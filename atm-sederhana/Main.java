import java.util.*;
import java.lang.*;
import java.util.concurrent.atomic.DoubleAdder;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte    cobalogin,
                ans;
        long    id,
                iddef,
                pin,
                pindef,
                saldo,
                tariktunai,
                setortunai;

        iddef       = 1;
        pindef      = 1;
        cobalogin   = 0;
        saldo       = 300000;

        //LOGIN SECTION
        while (true) {

            System.out.println("----------------LOGIN----------------");
            System.out.print("ID-USER         : ");
            id = sc.nextLong();
            System.out.print("PIN             : ");
            pin = sc.nextLong();
            System.out.println("-------------------------------------");
            if ((id == iddef && pin == pindef)) {
                loginsukses();
                while (true) {
                    System.out.println("-----------------MENU----------------");
                    System.out.println(">) 1. Cek saldo");
                    System.out.println(">) 2. Tarik tunai");
                    System.out.println(">) 3. Setor tunai");
                    System.out.println(">) 4. Ubah PIN");
                    System.out.println(">) 5. Bantuan pelanggan");
                    System.out.println(">) 0. Keluar");
                    System.out.println("--------------------------------------");
                    System.out.print(">) ");
                    ans = sc.nextByte();
                    System.out.println();

                    switch (ans) {
                        case 1: //CEK SALDO
                            System.out.println("--------------CEK SALDO---------------");
                            System.out.println("KONFIRMASI PIN      : ");
                            System.out.println("JUMLAH SALDO ANDA   : Rp." + saldo);
                            System.out.println(">) 0. Kembali ke menu");
                            System.out.println("--------------------------------------");
                            while (true) {
                                System.out.print(">) ");
                                ans = sc.nextByte();
                                System.out.println();
                                if ( ans ==0){
                                    break;
                                } else {
                                    continue;
                                }
                            }
                            continue;
                        case 2: //TARIK TUNAI
                            System.out.println("-------------TARIK TUNAI--------------");
                            System.out.print("KONFIRMASI PIN      : ");
                            pin = sc.nextInt();
                            if (pin != pindef){
                                gagal();
                                break;
                            }
                            System.out.print("JUMLAH PENARIKAN    : ");
                            tariktunai = sc.nextInt();
                            System.out.println("--------------------------------------");
                            if (tariktunai > saldo){
                                gagal();
                                continue;
                            } else {
                                saldo = saldo - tariktunai;
                                berhasil();
                                while (true) {
                                    System.out.print(">) ");
                                    ans = sc.nextByte();
                                    System.out.println();
                                    if ( ans ==0){
                                        break;
                                    } else {
                                        continue;
                                    }
                                }
                                continue;
                            }
                        case 3: //SETOR TUNAI
                            System.out.println("-------------SETOR TUNAI--------------");
                            System.out.print("KONFIRMASI PIN      : ");
                            pin = sc.nextInt();
                            if (pin != pindef){
                                gagal();
                                break;
                            }
                            System.out.print("JUMLAH SETORAN    : ");
                            setortunai = sc.nextLong();
                            System.out.println("--------------------------------------");
                            if (setortunai < 100000){
                                gagal();
                                continue;
                            } else {
                                saldo = saldo + setortunai;
                                berhasil();
                                while (true) {
                                    System.out.print(">) ");
                                    ans = sc.nextByte();
                                    System.out.println();
                                    if ( ans ==0){
                                        break;
                                    } else {
                                        continue;
                                    }
                                }
                                continue;
                            }
                        case 4: //UBAH PIN
                            System.out.println("---------------UBAH PIN---------------");
                            System.out.println("KONFIRMASI PIN      : ");
                            pin = sc.nextInt();
                            if (pin != pindef){
                                gagal();
                                break;
                            }
                            System.out.println("PIN BARU            :");
                            pin = sc.nextInt();
                            pindef = pin;
                            System.out.println("KONFIRMASI PIN BARU :");
                            pin = sc.nextInt();
                            if (pin != pindef){
                                gagal();
                                break;
                            }
                            System.out.println("--------------------------------------");
                            berhasil();
                            while (true) {
                                System.out.print(">) ");
                                ans = sc.nextByte();
                                System.out.println();
                                if ( ans ==0){
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 5: //BANTUAN PELANGGAN
                            System.out.println("-----------BANTUAN PELANGGAN----------");
                            System.out.println("CS PUSAT            : 071148133");
                            System.out.println("CS JABODETABEK      : 071148117");
                            System.out.println("CS NON-JABODETABEK  : 071148251");
                            System.out.println("--------------------------------------");
                            System.out.println(">) 0. Kembali ke menu");
                            while (true) {
                                System.out.print(">) ");
                                ans = sc.nextByte();
                                System.out.println();
                                if ( ans ==0){
                                    break;
                                } else {
                                    continue;
                                }
                            }
                            continue;
                        case 0: //KELUAR
                            cobalogin = 0;
                            break;
                        default:
                            continue;
                    }
                    break;
                }
            } else {
                //APABILA LOGIN GAGAL (HANYA BISA 3 KALI LOGIN)
                logingagal();
                cobalogin++;
                if (cobalogin < 3){
                    continue;
                } else {
                    System.exit(0);
                }
            }
        }
        //END LOGIN SECTION
    }

    private static void logingagal() {
        System.out.println("\n");
        System.out.println("--------------!!WARN!!---------------");
        System.out.println("  PERIKSA KEMBALI ID DAN PIN ANDA!");
        System.out.println("-------------------------------------");
        System.out.println("\n");
    }
    private static void loginsukses() {
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("Hai pelanggan, Philifs Bryan Sipahutar");
        System.out.println("-------------------------------------");
        System.out.println("");
    }

    private static void berhasil() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("-----------------INFO-----------------");
        System.out.println("           PROSES BERHASIL!");
        System.out.println("-------------------------------------");
        System.out.println(">) 0. Kembali ke menu");
    }

    private static void gagal() {
        System.out.println("");
        System.out.println("-----------------INFO-----------------");
        System.out.println("            PROSES GAGAL!");
        System.out.println("-------------------------------------");
        System.out.println(">) 0. Kembali ke menu");
    }
}
