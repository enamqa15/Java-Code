package advancejava;


	public class SuperToyota{
		SuperToyota(){
			System.out.println("My first car is a toyota corola");
		}
	}
	class Corola extends SuperToyota{
		Corola(){
		super();
			System.out.println("Corola car is ");
		}
	
	
	public static void main(String[] args) {
		
Corola x = new Corola();
//x.Corola();
	}

}
