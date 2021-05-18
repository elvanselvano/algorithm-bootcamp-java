
public class Calculator<T extends Number, V extends Number> implements CalculatorInterface<T, V> {
	
	T angka1;
	V angka2;

	public Calculator(T angka1, V angka2) {
		super();
		this.angka1 = angka1;
		this.angka2 = angka2;
	}

	public T getAngka1() {
		return angka1;
	}

	public void setAngka1(T angka1) {
		this.angka1 = angka1;
	}

	public V getAngka2() {
		return angka2;
	}

	public void setAngka2(V angka2) {
		this.angka2 = angka2;
	}
	
	@Override
	public double tambah(T angka1, V angka2) {
		return angka1.doubleValue() + angka2.doubleValue();
	}

	@Override
	public double kurang(T num1, V num2) {
		return angka1.doubleValue() - angka2.doubleValue();
	}

	@Override
	public double kali(T num1, V num2) {
		return angka1.doubleValue() * angka2.doubleValue();
	}

	@Override
	public double bagi(T num1, V num2) {
		return angka1.doubleValue() / angka2.doubleValue();
	}
	
}
