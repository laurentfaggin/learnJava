package superKeyWord;

public class Hero extends Person{
	String power;
	
	Hero(String name, int age, String power){
		// super appelle le constructeur de la classe parent
		super(name, age);
		this.power = power;
	}
	public String toString() {
		return super.toString() + this.power;
	}
}
