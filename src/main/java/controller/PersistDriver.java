
package controller;
import java.util.Scanner;
import model.Tiger;

public class PersistDriver {
TigerHelper helper = new TigerHelper();
public static void main(String[] args) {
PersistDriver run = new PersistDriver();
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
System.out.println("Enter name of Tiger:");
t.setColor(in.next());
System.out.println("Enter Tiger age:");
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
Tiger t = new Tiger();
showAll();
System.out.println("Enter RowID of Tiger to Update:");
t.setRowId(in.nextInt());
System.out.println("Enter new name of Tiger:");
t.setColor(in.next());
System.out.println("Enter new Tiger Name:");
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
System.out.println("1.Create Tiger");
System.out.println("2.Show Tigers");
System.out.println("3.Delete Tigers");
System.out.println("4.Update Tigers");
System.out.println("5.Quit");
System.out.println("**************");
}
}