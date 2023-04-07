package HashMap;

import java.util.*;

public class dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	

		HashMap<String,String> cars = new HashMap<>();

cars.put("Honda","Civic");
cars.put("Ford","Raptor");
cars.put("Dodge","Charger");
cars.put("Chevrolet","Corvet");



System.out.print("What car model are you looking for?");
String model="";
model=input.nextLine();


System.out.printf("\n Oh you are looking for a %s. Our selection is right over here: "+cars.get(model),model);
}
	}

