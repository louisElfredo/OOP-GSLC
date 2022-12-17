package gslc;



import java.util.Random;

public class PF extends Player implements Passing{

	Random ran = new Random();

	private Integer scorer;

	public PF() {
		super();
	}



	public PF(String name, String club, String position, String iD, Integer age, Integer num, Integer worth,
			Integer passAcc) {
		super(name, club, position, iD, age, num, worth, passAcc);
		// TODO Auto-generated constructor stub
	}



	public void worth() {

		if(this.scorer <=5) {
			this.setWorth(ran.nextInt(7)+4);
		}else if(this.scorer<=8 ) {
			this.setWorth(ran.nextInt(10)+11);
		}else {
			this.setWorth(ran.nextInt(30)+21);
		}
	}

	public void PassAcc() {
		if(this.getAge()<=20) {
			this.setPassAcc(ran.nextInt(20)+71);
		}else if(this.getAge()<=25) {
			this.setPassAcc(ran.nextInt(20)+61);
		}else {
			this.setPassAcc(ran.nextInt(30)+51);
		}
	}







	public Integer getScorer() {
		return scorer;
	}



	public void setScorer(Integer scorer) {
		this.scorer = scorer;
	}



	@Override
	public void PasAcc() {
		// TODO Auto-generated method stub

	}





}
