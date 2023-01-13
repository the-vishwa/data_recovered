package vishwa_9_1_23;

import java.util.ArrayList;

public class Result {
	public ArrayList<String> TheyCanVote;
	public ArrayList<String> TheyCantVote;
	public ArrayList<String> Kid;

	public Result() {
		this.TheyCanVote = new ArrayList<>();
		this.TheyCantVote = new ArrayList<>();
		this.Kid = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Result [TheyCanVote=" + TheyCanVote + ", TheyCantVote=" + TheyCantVote + ", Kid=" + Kid + "]";
	}

	public void init(ArrayList<Student> al) {
		al.add(new Student("sachin sir", 22, "pune"));
		al.add(new Student("vishwa", 10, "Arale"));
		al.add(new Student("nirmal", 15, "suray"));
		al.add(new Student("kuldip", 20, "pimpri"));
		al.add(new Student("premjit", 25, "shirpur"));
		al.add(new Student("darpan", 14, "shirpur"));
		al.add(new Student("yogesh", 9, "dhule"));
		al.add(new Student("Prashant",9, "dhule"));

	}

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		Result r = new Result();
		  r.init(al);
		for (Student student : al) {
			if (student.getAge() >= 18) {
				r.TheyCanVote.add(student.getName());
			} else if (student.getAge() < 18 && student.getAge() >=10) {
				r.TheyCantVote.add(student.getName());
			} else if (student.getAge() < 10) {
				r.Kid.add(student.getName());
			}else {}
		}
		System.out.println(r);
	}
}


//The method add(String) in the type ArrayList<String> is not applicable for the arguments (Integer)
//List<Student> list = new ArrayList<>();
