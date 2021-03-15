package collections;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		super(); //이걸 안써도 기본적으로 부모클래스에서 상속받아 온다
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.sno + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {			
			Student s = (Student) obj;
			return this.sno == s.sno && this.name.equals(s.name);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	

}
