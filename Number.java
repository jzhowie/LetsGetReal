public abstract class Number {
public abstract double getValue();

public int compareTo (Number other) {
	return 0; //placeholder
}

public boolean equals (Number other) {
	if (other.getValue() != 0 && getValue() != 0 && Math.abs(other.getValue() - getValue()) / getValue() < 0.00001) {
		return true;
	}
	else if (getValue() == 0 && other.getValue() == getValue()) {
		return true;
	}
	return false;
}

}
