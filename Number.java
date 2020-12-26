public abstract class Number {
public abstract double getValue();

public int compareTo (Number other) {
	if (this.equals(other)) {
		return 0;
	}
	else if (getValue() > other.getValue()) {
		return 1;
	}
	else {
		return -1;
	}
}

public boolean equals (Number other) {
	if (other.getValue() != 0 && getValue() != 0 && Math.abs(Math.abs(other.getValue() - getValue()) / getValue()) < 0.00001) {
		return true;
	}
	else if (getValue() == 0 && other.getValue() == getValue()) {
		return true;
	}
	return false;
}

}
