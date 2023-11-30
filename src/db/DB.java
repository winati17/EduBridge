/*
 * Kelas ini menyediakan koneksi database sederhana menggunakan JDBC untuk aplikasi Edubridge.
 */

// Deklarasi paket menunjukkan bahwa kelas ini termasuk dalam paket 'db'
package db;

// Mengimpor kelas-kelas yang diperlukan dari pustaka standar Java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB {

    // Variabel instans untuk menyimpan koneksi database
    Connection connect;


    public Connection getConnection() {

        // Parameter koneksi database
        String url, user, pwd;
        url = "jdbc:mysql://localhost/edubridge"; // URL JDBC untuk terhubung ke database MySQL bernama 'edubridge'
        user = "root"; // Nama pengguna database
        pwd = ""; // Kata sandi database (kosong untuk contoh ini)

        try {
            // Membangun koneksi ke database menggunakan JDBC
            connect = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            // Menangani setiap pengecualian SQL yang mungkin terjadi selama pembangunan koneksi
            // (Catatan: Penanganan kesalahan/logging yang benar seharusnya diimplementasikan di lingkungan produksi)
        }

        // Mengembalikan koneksi database yang dibangun (atau null jika terjadi pengecualian)
        return connect;
    }
}
