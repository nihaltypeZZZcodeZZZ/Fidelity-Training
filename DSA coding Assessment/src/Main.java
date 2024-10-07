import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    System.out.println("Original list: ");
    list.printList();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the index u want to remove from the list: ");
    int index = sc.nextInt();
    list.removeAtIndex(index);
    System.out.println("Updated list: ");
    list.printList();

    }
}