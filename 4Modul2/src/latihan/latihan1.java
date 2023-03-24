package latihan;
import java.util.ArrayList;
/**
 *
 * @author VALENCIA SEFIANA
 */

public class latihan1 {
        public static void main(String[] args) {
            // Membuat objek ArrayList
            ArrayList<String> hewan = new ArrayList<String>();
            // Menambahkan elemen ke ArrayList
            hewan.add("Sapi");
            hewan.add("Kelinci");
            hewan.add("Kambing");
            hewan.add("Unta");
            hewan.add("Domba");

            // Menampilkan isi ArrayList 
            System.out.println("Hewan: " + hewan);

            //hapus index
            ArrayList<String> delete = new ArrayList<String>();
            String element1 = hewan.remove(1);
            delete.add(element1);
            String element2 = hewan.remove(2);
            delete.add(element2);
            String element3 = hewan.remove(1);
            delete.add(element3);
            System.out.println("Hewan yang dihapus : " + delete);
            System.out.println("Output Hewan : " + hewan);
            
        }
}
