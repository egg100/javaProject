package streams;

import java.util.Objects;

public class Member {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	
	@Override
	public int hashCode() {
//		return this.name.hashCode() + this.sex + this.age;
		return Objects.hash(this.name, this.sex, this.age);
	}

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return this.name.equals(m.name) && this.age == m.age && this.sex == m.sex;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
