package hw8;

public class Train implements Comparable<Train>{
	int number;
	String type;
	String start;
	String dest;
	double price;

	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public int compareTo(Train train) {
		// 物件本身與 aEmployee 相比較，如果 return 正值，就表示比 aEmployee 大
		if (this.number > train.number) {
			return 1;
		} else if (this.number == train.number) {
			return 0;
		} else {
			return -1;
		}
		// 這邊的正負整數適用來描述兩個物件的"左右"關係
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Train)) {
			return false;
		}
		Train oth = (Train) obj;
		return this.number == oth.number;
	}

	public int hashCode() {
		return Integer.hashCode(number);
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
