package inheritances;

public class ComFriend extends Friend {
	String department;

	public ComFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}

	@Override
	public String toString() {
		return "ComFriend [department=" + department + ", name=" + this.getName() + ", phone=" + this.getPhone() + "]";
	}
}
