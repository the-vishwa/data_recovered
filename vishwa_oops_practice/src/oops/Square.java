package oops;
abstract class AAAAA{
	abstract void m6();
	void m7() {}
}

// que ==calculatge the areaand peremetr of square.?
public class Square {
	static int area;
	static int perimeter;

	static int areaaa() {
		return area * area; // Cannot make a static reference to the non-static field area
	}

	static int perimeterrr() {
		return 4 * area;
	}

	public static void main(String[] args) {
		Square.area = 3;
		System.out.println(areaaa());
		System.out.println(perimeterrr());

	}
}
