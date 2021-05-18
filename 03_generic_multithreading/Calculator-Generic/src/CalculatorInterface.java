
public interface CalculatorInterface<T extends Number, V extends Number> {
	
	// operations available
	double tambah(T num1, V num2);
	double kurang(T num1, V num2);
	double kali(T num1, V num2);
	double bagi(T num1, V num2);
}
