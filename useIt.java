class Xamples{
	
	public String ShowYours() {
		return "one";
	}
	
	public String ShowMine() {
		return "two";
	}
	
	public int ShowYours(String C) {
		return 1;
	}
	
	public int ShowMine(String D) {
		return 2;
	}
	
	public double ShowYours(int C) {
		return 1.0;
	}
	
	public double ShowMine(int D) {
		return 2.0;
	}

}
class useIt{
	
	Xamples iWill = new Xamples();
	
	int saveInt = 0;
	String SaveString = "testing";
	double SaveDouble = 42.42;
	
	String str1 = iWill.ShowMine();
	
	String str2 = iWill.ShowYours();
	
	int int1 = iWill.ShowMine("i'm telling mom");
	
	int int2 = iWill.ShowYours("ok");
	
	double dub1 = iWill.ShowMine(42);
	
	double dub2 = iWill.ShowYours(24);
	
	public void squalor() {
		System.out.println(1);
	}
	
}