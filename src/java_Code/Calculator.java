package java_Code;

class Calculator {
	int X = 10;
	int Y = 5;

	void Add() {
		int Sum = X + Y;
		int Sub = X - Y;
		System.out.println("sum of two number is" + Sum);
		System.out.println("sub of two number is" + Sub);
	}

	public static void main(String[] a) {
		Calculator calculator = new Calculator();
		calculator.Add();
	}
}