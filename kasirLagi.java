import java.util.Scanner;

public class kasirLagi {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;

        do {
            System.out.println("Menu : ");
            System.out.println("1. Login Kasir");
            System.out.println("2. Transaksi");
            System.out.println("3. Update stok");
            System.out.println("4. Tampilkan Barang");
            System.out.println("5. Tambahkan Barang");
            System.out.println("6. Laporan Pendapatan Harian");
            System.out.println("7. Laporan Pendapatan Bulanan");
            System.out.println("8. Exit");
            System.out.println("Pilih menu : ");
            
           
            menu = sc.nextInt();
            sc.nextLine();  
            
            switch (menu) {
                case 1: // input login kasir (user dan password)
                    String user1 = "Renald", user2 = "Belqis", user3 = "Aqila", username, password,
                            userPw1 = "Renald123", userPw2 = "Belqis123", userPw3 = "Aqila123";
                    System.out.println("Masukkan username : ");
                    username = sc.next();
                    System.out.println("Masukkan password : ");
                    password = sc.next();
                    if (username.equals(user1) && password.equals(userPw1)) {
                        System.out.println("Selamat datang Renald");
                    } else if (username.equals(user2) && password.equals(userPw2)) {
                        System.out.println("Selamat datang Belqis");
                    } else if (username.equals(user3) && password.equals(userPw3)) {
                        System.out.println("Selamat datang Aqila");
                    } else {
                        System.out.println("Gagal masuk");
                    }
                    break;
                case 2:
                    // Add code for Transaksi
                    System.out.println("Transaksi menu selected");
                    break;
                case 3:
                    // Add code for Update stok
                    System.out.println("Update stok menu selected");
                    break;
                // Add other cases for remaining menu options
                case 8:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Menu not recognized. Please choose a valid option.");
            }
        } while (menu != 8);

        sc.close(); // Close the scanner to prevent resource leak
    }
}

}
