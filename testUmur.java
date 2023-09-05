public class testUmur {
  public static void main(String[] args) {
	String name = "Emir Fateen Haqqi";
    int umur = 18;
    System.out.println("Nama: "+ name);
	System.out.println("Umur: "+ umur);
    if (umur < 17) {
	System.out.println("Belum punya KTP");
	} else {
	System.out.println("Sudah punya KTP");
	}
  }
}