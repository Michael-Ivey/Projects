package Person;

public class Faculty extends Employee {
	private MyDate hour;
	private MyDate day;
	private String rank;
	
	
	@Override
	public String toString() {
		return "Faculty [hour=" + hour + ", day=" + day + ", rank=" + rank
				+ "]";
	}


	public MyDate getHour() {
		return hour;
	}


	public void setHour(MyDate hour) {
		this.hour = hour;
	}


	public MyDate getDay() {
		return day;
	}


	public void setDay(MyDate day) {
		this.day = day;
	}


	public String getRank() {
		return rank;
	}


	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	
	

}
