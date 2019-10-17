
class BirthDate{
	private int day;
	private int month;
	private int year;
	
	public BirthDate(int d, int m, int y) {
		if (m == 2)
			day=d-1;
		else
			day=d;
		month=m;
		year=y;
	}
	
	public void change_birth_date(int d, int m, int y) {
		day=d;
		month=m;
		year=y;
	}
}

public class Soot2SSA {

	public static void main(String[] args) {
		int date = 9;
		date = 6324;
		BirthDate BD = new BirthDate(27,4,1997);
		BD.change_birth_date(3, 11, 1997);		
	}

}
