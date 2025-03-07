import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("|=================================================|");
            System.out.println("|            PROGRAM DISKON BELANJA               |");
            System.out.println("|=================================================|");
            System.out.println();
            System.out.println("Masukan Nama Anda : ");
            String Nama = input.nextLine();
            System.out.println("Masukan Harga Belanja : ");
            int Harga = input.nextInt();
            System.out.println("Masukan Diskon : ");
            int Diskon = input.nextInt(); 
            System.out.println();
            
            int total = Harga * Diskon/100 ;
            int jadi = Harga - total ;

            System.out.println("|=================================================|");
            System.out.println("|                 TOTAL BELANJA                   |");
            System.out.println("|=================================================|");
            System.out.println("|               Haloo " +Nama+"                        |");
            System.out.println("|       Total harga kamu adalah " +Harga+"              |");
            System.out.println("|       Kamu mendapat diskon  " +total+"                 |");
            System.out.println("|  Jadi harga yang harus di bayar adalah " +jadi+"     |");
        }
        
        System.out.println("|=================================================|");
           
    }
}