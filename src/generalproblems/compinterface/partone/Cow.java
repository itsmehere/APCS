package generalproblems.compinterface.partone;

public class Cow implements Comparable<Cow>{

	private int cowWeight;
	private String cowName;
	
	public Cow(int size, String name) {
		this.cowWeight = size;
		this.cowName = name;
	}
	
	public Cow() {
		this.cowWeight = 1800;
		this.cowName = "Anonymous Cow";
	}
	
	public String getName() {
		return cowName;
	}
	
	public int getWeight() {
		return cowWeight;
	}
	@Override
	public int compareTo(Cow c) {
		if(this.cowWeight == c.cowWeight) {
			return 0;
		} else if (this.cowWeight >= c.cowWeight) {
			return 1;
		}
		return -1;
	}

}
