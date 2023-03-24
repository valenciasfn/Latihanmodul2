package latihan;
import java.util.LinkedList;
/**
 *
 * @author VALENCIA SEFIANA
 */

public class latihan1 {
    public static void main(String[] args) {
       // Membuat objek LinkedList Hewan dan menambahkan beberapa data
       LinkedList<String> hewan = new LinkedList<>();
       hewan.add("Sapi");
       hewan.add("Kelinci");
       hewan.add("Kambing");
       hewan.add("Unta");
       hewan.add("Domba");

       System.out.println("Data Hewan : " + hewan);

       // Membuat objek LinkedList DeleteHewan dan menambahkan beberapa data
       LinkedList<String> deleteHewan = new LinkedList<>();
       deleteHewan.add("Kelinci");
       deleteHewan.add("Kambing");
       deleteHewan.add("Unta");
       System.out.println("Hewan yang dihapus : " + deleteHewan);

       // Menghapus data pada LinkedList Hewan yang sama dengan data pada LinkedList DeleteHewan
       for (String data : deleteHewan) 
       {
           hewan.remove(data);
       }

       // Menampilkan LinkedList Hewan setelah penghapusan
       System.out.println("Output Hewan setelah dihapus : " + hewan);
    }
}
