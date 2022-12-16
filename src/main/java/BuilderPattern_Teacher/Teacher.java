package BuilderPattern_Teacher;

public class Teacher {
	private String name;
	private int age;
	private String subJect;
	
	public Teacher(String name, int age, String subJect) {
		super();
		this.name = name;
		this.age = age;
		this.subJect = subJect;
	}
	public Teacher() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubJect() {
		return subJect;
	}
	public void setSubJect(String subJect) {
		this.subJect = subJect;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", subJect=" + subJect + "]";
	}
	
	
}
