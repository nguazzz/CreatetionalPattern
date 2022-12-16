package BuilderPattern_Teacher;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher1= new TeacherBuilder().buildName("Hoang").buildAge(21).buildSubject("Kien truc").build();
		System.out.println(teacher1.toString());
	}
}
