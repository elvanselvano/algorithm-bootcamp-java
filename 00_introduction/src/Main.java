import java.util.Scanner;

public class Main {

//	fungsi static: hanya bisa manggil fungsi static
//	void: engga return apa2
//	public: access modifier
	
	public static void main(String[] args) {
//		System.out.println("Hello World");
		
//		Number
//		byte b = 1000; // error
//		int sample = 1000;
//		long sampleLong = 10000L;
//		long sampleLong2 = 2147483648; // error
//		long sampleLong2 = 2147483648L;
//		float sampleFloat = 3.142F;
//		double sampleDouble = 20.50D;
		
//		int decInt = 7;
//		int hexInt = 0x4CF;
//		int binDec = 0b101010;
		
//		int saldo = 60_000_000;
//		int bigNumber = (int) 1e6; 
//		System.out.println(saldo);
		
//		Casting
//		Widening (otomatis): byte-short-int-long-float-double
//		Narrowing kebalikannnya
		
//		Widening
//		byte iniByte = 10;
//		short iniShort = iniByte;
//		int iniInt = iniShort;
		
//		Narrowing
//		int iniInt2 = 1000;
//		-128 sampai 128
//		byte iniByte = (byte) iniInt2; // number overflow
//		System.out.println(iniByte);
		
//		Character
//		char karakter = 'E';
//		System.out.println(karakter);
		
//		Boolean
//		boolean isValidName = true;
//		System.out.println(isValidName);
		
//		String
//		String s1 = "Algorithm";
//		String s2 = "Bootcamp";
//		String nama = "Algorithm Bootcamp";
//		System.out.println(nama);
//		System.out.println(s1 + " " + s2); // concatenation
//		System.out.println(nama.length()); // akses method yang ada di class String
		
//		Java -> static type (tipe data tidak bisa berubah)
//		Penamaan variabel: engga boleh ada whitespace (spasi, enter, tab, dll.) dan tidak
//		boleh seluruhnya berupa angka
		
//		String name;
//		name = "Algorithm Bootcamp";
//		name = "Algorithm";
//		name = 100; // semua variabel di java adalah static
		
//		Sejak java 10, ada keyword yang namanya var
//		Dengan menggunakan var, kita tidak perlu pusing2 tipe data
//		Namun, deklarasinya harus disertai inisialisasi
		
//		var name; // error
//		var name = "Algorithm Bootcamp";
		
//		Secara default, variabel di Java bisa diubah
//		Dengan keyword final, variabel tidak bisa diubah
//		final double pi = 3.142D;
//		pi = 4; // error
//		System.out.println(pi);
		
//		Java berorientasi objek (non-primitive)
//		Number (0), char ('\u0000'), boolean (false) => default value untuk primitive data type
//		Untuk non-primitive data type, tidak punya default value, sehingga bisa bernilai null.
		
//		Tipe data primitive tidak bisa memiliki method sedangkan non-primitive bisa
//		Di java, semua tipe data primitif mempunyai representasi tipe data non-primitive
		
//		int -> Integer
//		long -> Long
		
//		Integer number = 10;
//		Long bigNumber = 100000L;
//		Byte b = null; // default null
//		b = 100;
//		System.out.println(b);
		
//		Conversion Otomatis antara primitive dan non-primitive
//		int a = 100;
//		Integer b = a;
//		int c = b;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
//		System.out.println("Budi");
//		System.out.printf("%s", "Budi");
//		System.out.print("Budi");
		
//		Kita mau convert dari non-primitive ke primitive yang gak compatible
//		Integer b = 1000;
//		short shortNumber = b.shortValue();
//		System.out.println(shortNumber);
		
//		Array (tipe data ga bsa berubah, jumlah data ga bsa berubah)
//		String[] names;
//		names = new String[3];
//		String[] names = new String[3]; // array yg bsa nampung 3 elemen
//		names[0] = "Vincent";
//		names[1] = "Kevice";
//		names[2] = "AdmiralSpoon";
//		System.out.println(names[1]);
		
//		Array Initializer
//		int[] numbers = new int[] {
//				10, 20, 30, 40, 50
//		};
//		
//		numbers[0] = 0;
//		numbers[1] = 15;
//		System.out.println(numbers[1]);
//		System.out.println(numbers.length); // akses jumlah elemen
		
//		long[] bigNumbers = {
//				2000L, 3000L, 4000L, 5000L
//		};
		
//		String[][] names = {
//				{"Budi", "Cecep", "Anto"},
//				{"Siti", "Dodi"},
//				{"cookie", "Bryan"}
//		};
		
//		String[] team1 = names[0]; // Budi, Cecep, Anto
//		System.out.println(team1[1]);
//		System.out.println(names[1][0]);
		
//		Math Operations
//		int a = 5;
//		int b = 9;
//		int c = 10;
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(c * b);
//		System.out.println(a / b);
//		System.out.println(c % a);
		
//		Augmented Assignment
//		int a = 10;
//		a += 5;
//		a -= 5;
//		a *= 2;
//		a /= 5;
//		a %= 2;
		
//		Unary Operator
//		int a = -10;
//		int b = +10; // by default kalau engga ada tanda, dikasi + dari Java
//		a--;
//		b++;
//		System.out.println(a);
//		System.out.println(b);
		
//		Comparison Operator
//		int a = 5;
//		int b = 10;
//		
//		System.out.println(a > b);
//		System.out.println(a >= b);
//		System.out.println(a < b);
//		System.out.println(a <= b);
//		System.out.println(a == b);
//		System.out.println(a != b);
		
//		Integer a = 5; // memory 100
//		Integer b = 5; // memory 100, java liat variabelnya sama jadi memorynya sama
//		System.out.println(a == b); // 100 == 100
		
//		String person1 = "Doctor"; // memory 100
//		person1 = person1 + " " + "Neuron"; // doctor neuron

//		String person2 = "Doctor Neuron"; // memory 200
//		System.out.println(person1 == person2); // 100 == 200
		
//		String person1 = "Doctor Neuron"; // memory 150
//		String person2 = "Doctor Neuron"; // memory 150
//		System.out.println(person1 == person2);
//		System.out.println(person1.equals(person2));
		
//		String strA = new String("APPLES"); // 100
//		String strB = new String("APPLES"); // 110
//		System.out.println(strA == strB); // 100 == 110 => FALSE
		
//		Boolean Operations
//		int a = 5;
//		int b = 3;
//		System.out.println(a > 5 && b <= a);
//		System.out.println(a > 6 || b != a);
//		System.out.println(!(a==5));
		
		
//		Java Statement: kumpulan expression
//		int angka = 5; // assignment statement (angka = 5 itu expression)
//		angka++; // increment statement
//		System.out.println(angka); // method invocation statement
//		Date date = new Date(); // object creation statement
		
//		Block: kumpulan statement
//		System.out.println("Hello");
//		System.out.println("World");
		
//		{
//			System.out.println("Hello");
//			System.out.println("World");
//		}
		
//		SELECTION
//		int nilai = 90;
//		int minimum = 70;
//		boolean attendExam = true;
//		
//		if(nilai > minimum && attendExam) {
//			System.out.println("Lulus");
//		} else if(nilai > minimum && !attendExam) {
//			System.out.println("Kamu tidak ikut ujian.");
//		} else {
//			System.out.println("Kamu tidak lulus!");
//		}
		
//		SWITCH STATEMENT
//		char grade = 'F';
//		
//		switch(grade) {
//		case 'A':
//			System.out.println("A");
//			break;
//		case 'B':
//		case 'C':
//			System.out.println("C");
//		default:
//			System.out.println("default");
//		}
		
//		Di java 14, ada yang namanya switch lambda (engga perlu tulis break)
		
//		var nilai = 90;
//		
//		switch(nilai) {
//			case "A" -> System.out.println("A");
//			case "B", "C" -> System.out.println("B, C");
//			default -> { // boleh pake kurung kerawal
//				System.out.println("Default");
//			}
//		}
		
//		Di java 14, ada yield operator
//		var nilai = "A";
//		
//		String message = switch(nilai) {
//		case "A":
//			yield "Lulus";
//		case "B":
//			yield "Keren";
//		}
		
//		TERNARY OPERATOR
//		int nilai = 80;
//		System.out.println(nilai >= 75 ? "Lulus" : "Tidak Lulus");
		
//		FOR LOOP
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
//		INFINITE LOOP
//		for(;;) {
//			System.out.println("Hello");
//		}
		
//		WHILE LOOP
//		int counter = 5;
//		
//		while(counter < 10) {
//			System.out.println(counter);
//			counter++;
//		}
		
//		DO WHILE LOOP
//		int count = 10;
//		do {
//			System.out.println(count);
//			count++;
//		} while(count < 10);
		
//		Break and Continue
//		Break: menghentikan perulangan
//		Continue: menghentikan perulangan saat ini
		
//		int counter = 1;
//		
//		while(true) {
//			counter++;
//			
//			if(counter == 5) {
//				continue;
//			}
//			
//			System.out.println(counter);
//			
//			if(counter == 10) {
//				break;
//			}
//		}
		
//		FOR EACH
//		String names[] = {"Jerry", "Michael", "Bryan"};
		
//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
//		for(String name: names) {
//			System.out.println(name);
//		}
		
//		INPUT AND OUTPUT
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Masukkan nilai: ");
//		int score = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Nilai: " + score);
//		
//		System.out.print("Masukkan nama: ");
//		String name = scan.nextLine();
//		System.out.println("Nama: " + name);
		
//		String password;
//		boolean isValidPassword = false;
//		
//		do {
//			System.out.print("Input your password: ");
//			password = scan.nextLine();
//			if(password.length() >= 8 && password.length() <= 20) {
//				isValidPassword = true;
//			}
//		  
//			if(!isValidPassword) {
//				System.out.println("Password is not valid");
//			}
//		} while(!isValidPassword);
//		scan.close();	
	}

}
