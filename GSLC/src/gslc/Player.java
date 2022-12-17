package gslc;



public abstract class Player {

	private String name, club, position, iD;
	private Integer age, num, worth, passAcc; 

	public abstract void worth();

	public Player() {

	}

	public Player(String name, String club, String position, String iD, Integer age, Integer num, Integer worth,
			Integer passAcc) {
		super();
		this.name = name;
		this.club = club;
		this.position = position;
		this.iD = iD;
		this.age = age;
		this.num = num;
		this.worth = worth;
		this.passAcc = passAcc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getWorth() {
		return worth;
	}

	public void setWorth(Integer worth) {
		this.worth = worth;
	}

	public Integer getPassAcc() {
		return passAcc;
	}

	public void setPassAcc(Integer passAcc) {
		this.passAcc = passAcc;
	}

}
