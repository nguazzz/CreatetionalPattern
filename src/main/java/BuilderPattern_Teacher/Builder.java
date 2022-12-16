package BuilderPattern_Teacher;

public interface Builder {
	Builder buildName(String name);
	Builder buildAge(int age);
	Builder buildSubject(String subJect);
	Teacher build();
}
