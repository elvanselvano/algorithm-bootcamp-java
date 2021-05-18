import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);

	public Main() {
		
		double angka1, angka2;
		
		System.out.printf("Masukkan angka pertama: ");
		angka1 = scan.nextDouble();
		
		System.out.printf("Masukkan angka kedua: ");
		angka2 = scan.nextDouble();
		
		Calculator<Double, Double> hitung = new Calculator<Double, Double>(angka1, angka2);
		
		hitung.setAngka1(angka1);
		hitung.setAngka2(angka2);
		
		System.out.println(hitung.tambah(angka1, angka2));
		System.out.println(hitung.kurang(angka1, angka2));
		System.out.println(hitung.kali(angka1, angka2));
		System.out.println(hitung.bagi(angka1, angka2));
	}

	public static void main(String[] args) {
		new Main();
	}

}
