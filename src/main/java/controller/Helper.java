package controller;
import java.util.Scanner;

import model.Tiger;

public class Helper {
	TigerHelper helper = new TigerHelper();
	public static void main(String[] args) {
	TigerHelper run = new TigerHelper();
	run.go();
	}
	private void go() {
	int userIn = 0;
	Scanner in = new Scanner(System.in);
	while (userIn != 5) {
	printMenu();
	userIn = in.nextInt();
	if (userIn == 1) {
	Tiger t = new Tiger();
	System.out.println("Enter name of tiger:");
	t.setColor(in.next());
	System.out.println("Enter Tiger Age:");
	t.setAge(in.nextInt());
	helper.persist(t);
	}
	else if (userIn == 2) {
	showAll();
	}
	else if (userIn == 3) {
	Tiger t = new Tiger();
	System.out.println("Enter RowID of Tiger to delete:"); 
	t.setRowId(in.nextInt());
	helper.delete(t);
	}
	else if (userIn == 4) {
	Tiger t = new Tiger;
	showAll();
	System.out.println("Enter RowID of Tiger to Update:");
	t.setRowId(in.nextInt());
	System.out.println("Enter new name of Tiger:");
	t.setColor(in.next());
	System.out.println("Enter new train Tiger:");
	t.setAge(in.nextInt());
	helper.update(t);
	}
	}
	System.out.println("Done!");
	}
	private void showAll() {
	for (Tiger t : helper.showAllTrains()) {
	//t.toString();
	System.out.println(t.toString());
	}
	}
	private void printMenu() {
	System.out.println("1.Create Train");
	System.out.println("2.Show Trains");
	System.out.println("3.Delete Train");
	System.out.println("4.Update Train");
	System.out.println("5.Quit");
	System.out.println("**************");
	}
}


