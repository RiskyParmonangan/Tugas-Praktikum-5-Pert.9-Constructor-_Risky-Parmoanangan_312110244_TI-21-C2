package Pegawai;
public class Main {
	public static void main(String[] args) {
		Manager Ringo = new Manager ("Ringo",9000000,8000000);
		Programmer Herlambang = new Programmer ("Herlambang",0,0);
                Programmer Riko = new Programmer ("Riko",6000000,3000000);
                Programmer Dina = new Programmer ("Dina",5000000,3000000);

		// Set Pegawai
		Ringo.cetakInfo();
		Herlambang.cetakInfo();
                Riko.cetakInfo();
                Dina.cetakInfo();


	}
}