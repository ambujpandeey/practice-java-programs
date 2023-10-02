package javaCore;

import java.util.Scanner;

class Equipment {

	public String EquipmentName;
	public int price;

	public Equipment(String EquipName, int Equipprice) {
		this.EquipmentName = EquipName;
		this.price = Equipprice;
	}

	public String getEquipmentName() {
		return EquipmentName;
	}

	public void setEquipmentName(String equipName) {
		this.EquipmentName = equipName;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int Equipprice) {
		this.price = Equipprice;
	}

	public String toString() {
		return "Name of the equipment : " + this.EquipmentName + "\n& its Price : " + this.price;
	}

}

class Money {
	
	ShowpingCartLogic price = new ShowpingCartLogic();
	
	Scanner in = new Scanner(System.in);
	
	public int initial_money;
	{
		System.out.println("Enter initial money :");
		initial_money = in.nextInt();
	}

	public int Mon() {
		return initial_money;
	}
}

public class ShowpingCartLogic {

	public static void main(String[] args) {
		Money money = new Money();
		Scanner input = new Scanner(System.in);
		Equipment[] equip = new Equipment[1000];
		int nbofequip = 0;
		int prix;
		String eqname;
		int equipchoice = 0;
		Equipment eq = null;
		Equipment[] tep;
		boolean found = false;
		int foundIndex = 0;
		while (equipchoice != 4) {
			System.out.println("1-Buy a new equipment.\n" + "2-Show all the equipment you have .\n"
					+ "3-Remove an equipement\n" + "4-Exit.");

			System.out.print("Enter an option: ");
			equipchoice = input.nextInt();
			input.nextLine();
			switch (equipchoice) {
			case 1:
				if (nbofequip == equip.length) {
					tep = new Equipment[equip.length * 2];

					for (int i = 0; i < equip.length; i++)
						tep[i] = equip[i];

					equip = tep;
				}
				System.out.println("Enter new equipment(chest,back,legs,biceps,triceps,trapezius):");
				eqname = input.nextLine();
				while (!"chest".equals(eqname) && !"back".equals(eqname) && !"legs".equals(eqname)
						&& !"biceps".equals(eqname) && !"triceps".equals(eqname) && !"trapezius".equals(eqname)) {
					System.out.println("Invalid equipement ,please choose a valid one.");
					System.out.println("Enter new equipment(chest,back,legs,biceps,triceps,trapezius :");
					eqname = input.nextLine();
				}
				do {
					System.out.println("Enter new equipment price :");
					prix = input.nextInt();
					input.nextLine();
				} while (prix <= 0);
				eq = new Equipment(eqname, prix);
				equip[nbofequip] = eq;
				nbofequip++;
				break;
			case 2:
				for (int i = 0; i < nbofequip; i++) {
					System.out.println("Equipments :\n " + equip[i]);
				}
				System.out.println("\nThere's currently " + nbofequip + " equipments in the gym");
				System.out.println();
				break;
			case 3:
				System.out.print("Enter equipment name you want to remove from the gym: ");
				eqname = input.nextLine();
				found = false;
				for (int i = 0; i < nbofequip; i++) {

					if (equip[i].EquipmentName.toLowerCase().equals(eqname.toLowerCase())) {
						foundIndex = i;
						found = true;
						break;
					}
				}

				if (found) {
					for (int i = foundIndex; i < (nbofequip - 1); i++) {
						equip[i] = equip[i + 1];
					}
					nbofequip--;
					System.out.println("Equipement deleted.");
				} else
					System.out.println("Equipement not found!");

				System.out.println();
				break;
			case 4:
				break;
			}// closes switch equip
		} // closes while equip
		System.out.println(money);
	}
}