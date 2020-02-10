import java.util.Random;

class robertD{
	
	Moneys[] pocketChange;
	
	enum Moneys{
		penny, nickel, dime, quarter, halfdollar, dollar
	}

	public int getValue(Moneys coin){

		int value = 0;
		switch (coin){
			case penny:
				value = 1;
				break;
			case nickel:
				value = 5;
				break;
			case dime:
				value = 10;
				break;
			case quarter:
				value = 25;
				break;
			case halfdollar:
				value = 50;
				break;
			case dollar:
				value = 100;
				break;
		}

		return value;
	}
}

class dinero{
	public static void main(String... v){
		
		Random rand = new Random();
		
		robertD Duckets = new robertD();
		
		Duckets.pocketChange = new robertD.Moneys[20];
		
		int tot = 0;
		
		for(int i = 1; i == Duckets.pocketChange.length; i++){
			
			robertD.Moneys current;
		
			switch (rand.nextInt(5)){
				case 0:
					current = penny;
					break;
				case 1:
					current = nickel;
					break;
				case 2:
					current = dime;
					break;
				case 3:
					current = quarter;
					break;
				case 4:
					current = halfdollar;
					break;
				case 5:
					current = dollar;
					break;
			}
		
			System.out.println("coin " + i + " is " + current);
		
			Duckets.pocketChange[i] = robertD.Moneys.current;
		
			tot += getValue(current);
		}
		System.out.println(tot);
	}
	

}