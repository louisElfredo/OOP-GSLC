package gslc;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main3 {

	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	Vector<Player> dtPlayer = new Vector<>();

	public final void Menu() {
		System.out.println("==================================");
		System.out.println("Register Basketball Players ");
		System.out.println("==================================");
		System.out.println("1. Add Player");
		System.out.println("2. View Player");
		System.out.println("3. Update Player");
		System.out.println("4. Remove Player");
		System.out.println("5. Exit");
		System.out.println("==================================");
		System.out.println("Choose: ");

	}

	public final void enter() {

		System.out.println("Press enter to continue... ");
		sc.nextLine();

	}

	public final String genID(String position) {
		String Position;

		if(position.equals("Point Guard")) {
			Position = "PG";
		}else if(position.equals("Shooting Guard")){
			Position = "SG";
		}else if(position.equals("Center")){
			Position = "C";
		}else if(position.equals("Power Forward")){
			Position = "PF";
		}else {
			Position = "SF";
		}

		for(int i = 0; i < 2; i++) {
			int temp = ran.nextInt(10);
			Position += temp;
		}
		return Position;
	}

	public final boolean checkID(String Position) {

		if(dtPlayer.isEmpty()) {
			return true;
		}else {
			Player curr;
			for(int i = 0; i < dtPlayer.size(); i++) {

				curr = dtPlayer.get(i);
				if(Position.equals(curr.getiD())) {
					return false;
				}
			}return true;
		}

	}

	public final void add() {

		String name, club, position, iD, tempAge, tempNum;

		do {
			System.out.println("Input Name [5..40]: ");
			name = sc.nextLine();
			name.strip();
		}while(!name.matches("[a-zA-Z\u0020]+") || name.length()<5 || name.length()>40);

		do {
			System.out.println("Input Age[17-40]: ");
			tempAge = sc.nextLine();
			tempAge.strip();
		}while(!tempAge.matches("[0-9]+") || Integer.parseInt(tempAge)<17 || Integer.parseInt(tempAge)>40);

		int age = Integer.parseInt(tempAge);

		do {
			System.out.println("Input Jersey Number: ");
			tempNum = sc.nextLine();
			tempNum.strip();
		}while(!tempNum.matches("[0-9]+"));

		do {
			System.out.println("Input Club:");
			club = sc.nextLine();
			club.strip();
		}while(!club.matches("[a-zA-Z\u0020]+"));

		do {
			System.out.println("Input Position: ");
			position = sc.nextLine();
			position.strip();
		}while(!position.equalsIgnoreCase("Point Guard") && !position.equalsIgnoreCase("Shooting Guard") && !position.equalsIgnoreCase("Center") && !position.equalsIgnoreCase("Power Forward") && !position.equalsIgnoreCase("Small Forward"));

		do {
			iD = genID(position);
		}while(!checkID(iD));

/*
		if(position.equalsIgnoreCase("Point Guard")) {
			String temp_leadAb;
			int leadAb;
			do {
				System.out.println("Input Leadership Ability[1-10]: ");
				temp_leadAb = sc.nextLine();
				temp_leadAb.strip();
			}while(!temp_leadAb.matches("[0-9]+") || Integer.parseInt(temp_leadAb)<1 || Integer.parseInt(temp_leadAb)>10);

			leadAb = Integer.parseInt(temp_leadAb);
			Player newPG = new PG(name, club, position, iD, age, tempNum);
			//ada lanjutan
			
		}else if(position.equalsIgnoreCase("Shooting Guard")){
			String temp_shootAcc;
			int shootAcc;
			do {
				System.out.println("Input Shooting Accuracy[1-10]: ");
				temp_shootAcc = sc.nextLine();
				temp_shootAcc.strip();
			}while(!temp_shootAcc.matches("[0-9]+") || Integer.parseInt(temp_shootAcc)<1 || Integer.parseInt(temp_shootAcc)>10);
			shootAcc = Integer.parseInt(temp_shootAcc);
			Player newSG = new SG(name, club, position, iD, age, tempNum);
			//ada lanjutan
			
		}else if(position.equalsIgnoreCase("Center")){
			String temp_rebound;
			int rebound;
			do {
				System.out.println("Input Rebound rate[1-10]: ");
				temp_rebound = sc.nextLine();
				temp_rebound.strip();
			}while(!temp_rebound.matches("[0-9]+") || Integer.parseInt(temp_rebound)<1 || Integer.parseInt(temp_rebound)>10);
			rebound = Integer.parseInt(temp_rebound);
			Player newC = new C(name, club, position, iD, age, tempNum);
			//ada lanjutan
			
		}else if(position.equalsIgnoreCase("Power Forward")){
			String temp_scorer;
			int scorer;
			do {
				System.out.println("Input Scorrer rate[1-10]: ");
				temp_scorer = sc.nextLine();
				temp_scorer.strip();
			}while(!temp_scorer.matches("[0-9]+") || Integer.parseInt(temp_scorer)<1 || Integer.parseInt(temp_scorer)>10);
			scorer = Integer.parseInt(temp_scorer);
			Player newPF = new PF(name, club, position, iD, age, tempNum);
			//ada lanjutan
			
		}else if(position.equalsIgnoreCase("Small Forward")){
			String temp_assist;
			int assist;
			do {
				System.out.println("Input Assist rate[1-10]: ");
				temp_assist = sc.nextLine();
				temp_assist.strip();
			}while(!temp_assist.matches("[0-9]+") || Integer.parseInt(temp_assist)<1 || Integer.parseInt(temp_assist)>10);
			assist = Integer.parseInt(temp_assist);
			Player newSF = new SF(name, club, position, iD, age, tempNum);
			//ada lanjutan
	
		}
 */
		System.out.printf("\n New Player '%s' has been added...\n",name);
	}

	public final void view() {
		
		if(dtPlayer.isEmpty()) {
			System.out.println("Player List is Empty...");
			System.out.println("Plss add new player :) ");
		}else {
			System.out.printf("\n| %-3s | %-5s | %-40s | %-3s | %-13s | %-20s | %-8s | %-7s | %-25s |\n","No.",
					"ID","Name","Age","Jersey Number","Club","Position","Worth","Special");
			for(int i = 0; i < dtPlayer.size(); i++) {
				
				Player curr = dtPlayer.get(i);
				System.out.printf("| %-3s | %-5s | %-40s | %-20s | %-3d | %-13d | %-20s | %-8s | %-7d |", i+1, curr.getiD(), curr.getName(), curr.getAge(), curr.getNum(), curr.getClub(), curr.getPosition(), curr.getWorth());
				
				if(curr instanceof PG) {
					System.out.printf("%-10s: %-3d        \n","Leadership Ability",((PG)curr).getLeadAb());
				}else if(curr instanceof SG) {
					System.out.printf("%-10s: %-3d        \n","Shooting Accuracy",((SG)curr).getShootAcc());
				}else if(curr instanceof C) {
					System.out.printf("%-10s: %-3d        \n","Rebound rate",((C)curr).getRebound());
				}else if(curr instanceof PF) {
					System.out.printf("%-10s: %-3d        \n","Scorer rate",((PF)curr).getScorer());
				}else if(curr instanceof SF) {
					System.out.printf("%-10s: %-3d        \n","Assist rate",((SF)curr).getAssist());
				}
			}
		}return;
		
	}
	
	public final void delete() {
		
		if(!dtPlayer.isEmpty()) {
			String choice;
			view();
			System.out.print("\n Choose which player to be deleted[ID] : ");
			choice = sc.nextLine();
			choice.strip();
			
			Player curr;
			
			for(int i = 0; i <dtPlayer.size(); i++) {
				curr = dtPlayer.get(i);
				if(curr.getiD().equals(choice)) {
					
					String confirm;
					
					do {
						System.out.print("\n Are u sure this player want to be deleted ??? :( [YES or NO]: ");
						confirm = sc.nextLine();
						confirm.strip();
					}while(!confirm.equalsIgnoreCase("YES") && !confirm.equalsIgnoreCase("NO"));
					
					String name = dtPlayer.get(i).getName();
					
					if(confirm.equalsIgnoreCase("YES")) {
						System.out.println("\n Deleting...");
						dtPlayer.remove(i);
						System.out.printf("\nThe Player %s has been deleted from the list...\n", name);
					}else if(confirm.equalsIgnoreCase("NO")) {
						System.out.println("\nStop Deleting....");
						System.out.println("\nBe Patient...");
					}
						return;
				}
			}
			System.out.println("\nID not found...");
			return;
		}
		System.out.println("\nThere is no player...");
		return;
	}
	
	public Main3() {

		int menu;

		do {
			Menu();
			menu = sc.nextInt();
			sc.nextLine();

			switch(menu) {
			case 1:
			{
				add();
				enter();
				break;
			}
			case 2:{
				view();
				enter();
				break;
			}
			case 3:{
				delete();
				enter();
				break;
			}
			case 4:{
				System.out.println("\n BYE-BYE... ");
				dtPlayer.clear();
				enter();
			}
			}
		}while(menu!=4);

	}

	public static void main(String[] args) {
		new Main3();
	}

}
