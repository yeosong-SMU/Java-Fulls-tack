package collect;

public class Bmi {
	private String name;
	private int age;
	private double height;
	private double weight;
	private double bmi;
	private String status;

	public Bmi() {
	}

	public Bmi(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		bmi = weight / ((height * height) / 10000);

		calc();
	}

}
