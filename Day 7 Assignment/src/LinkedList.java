import java.util.Scanner;

public class LinkedList {
    public static Node insertAtTail(Node head,int data) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
    public static Node insertAtHead(Node head,int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    public static void printList(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static Node insertAtPosition(Node head,int data,int position) {
        Node newNode = new Node(data);
        if(position == 0){
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        int count =0;
        while(current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if(current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int size = sc.nextInt();
        int[] data = new int[size];
        for(int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }
        System.out.println("Linked List: \n 1.Insert at head\n2.insert at Tail \n3.Insert at specific position\n Enter your choice:");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Insert at head: ");
                for(int value : data) {
                    head = insertAtHead(head, value);
                }
                printList(head);
                break;
                case 2:
                    System.out.println("Insert at Tail: ");
                    for(int value : data) {
                        head = insertAtTail(head, value);
                    }
                    printList(head);
                    break;
            case 3:
                System.out.println("Insert at specific position: ");
                System.out.println("Enter your position:");
                int position = sc.nextInt();
                for(int value : data) {
                    head = insertAtPosition(head, value, position);
                }
                printList(head);
                break;
        }


    }
}
