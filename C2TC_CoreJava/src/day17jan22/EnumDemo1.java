package day17jan22;

public class EnumDemo1 {
	//creating enum within class
	public enum Seasons{
		WINTER,SPRING,SUMMER,FALL
	}
	enum Days{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
	public static void main(String[] args) {
		//Printing all enum
		for(Seasons s:Seasons.values())
		{
			System.out.println(s);
		}
		System.out.println("Value of WINTER is "+Seasons.valueOf("WINTER"));
		System.out.println("Index of WINTER is "+Seasons.valueOf("WINTER").ordinal());
		System.out.println("Index of SUMMER is "+Seasons.valueOf("SUMMER").ordinal());
	}

}
