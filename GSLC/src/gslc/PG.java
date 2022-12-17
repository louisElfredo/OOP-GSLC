package gslc;

import java.util.Random;

public class PG extends Player implements Passing {

	Random ran = new Random();

	//LeadAb -> leadership ability
	private Integer leadAb;

	public PG() {
		super();
	}

	public PG(String name, String club, String position, String iD, Integer age, Integer num, Integer worth,
			Integer passAcc) {
		super(name, club, position, iD, age, num, worth, passAcc);
	}



	public void worth() {

		if(this.leadAb <=4) {
			this.setWorth(ran.nextInt(7)+4);
		}else if(this.leadAb <=7 ) {
			this.setWorth(ran.nextInt(10)+11);
		}else {
			this.setWorth(ran.nextInt(30)+21);
		}

	}

	public void passAcc() {
		if(this.getAge()<=20) {
			this.setPassAcc(ran.nextInt(20)+71);
		}else if(this.getAge()<=25) {
			this.setPassAcc(ran.nextInt(20)+61);
		}else {
			this.setPassAcc(ran.nextInt(30)+51);
		}
	}



	public Integer getLeadAb() {
		return leadAb;
	}

	public void setLeadAb(Integer leadAb) {
		this.leadAb = leadAb;
	}

	@Override
	public void PasAcc() {
		// TODO Auto-generated method stub

	}

}
