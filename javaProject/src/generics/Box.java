package generics;

class Apple {
	int price;
	String kind;
	
	Apple() {}
	
	Apple(int price, String kind) {
		this.price = price;
		this.kind = kind;
	}

	@Override
	public boolean equals(Object obj) {
		String a = (String) obj;
		return this.kind.equals(a);
	}
	
	
}

public class Box<T> {
	T box;

	public void setBox(T box) {
		this.box = box;
	}
	
	public T getBox() {
		return box;
	}
}
