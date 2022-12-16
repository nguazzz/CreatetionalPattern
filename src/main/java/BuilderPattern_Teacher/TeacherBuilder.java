package BuilderPattern_Teacher;

public class TeacherBuilder implements Builder {
	private String name;
	private int age;
	private String subJect;
	
	public Builder buildName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		return this;
	}
	
	public Builder buildAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
		return this;
	}

	public Builder buildSubject(String subJect) {
		// TODO Auto-generated method stub
		this.subJect = subJect;
		return this;
	}

	public Teacher build() {
		// TODO Auto-generated method stub
		return new Teacher(name, age, subJect);
	}


	
}
