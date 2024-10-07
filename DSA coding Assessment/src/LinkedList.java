public class LinkedList {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void removeAtIndex(int index) {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        if(index==0){
            head = current.next;
            return;
        }
        for(int i=0; i<index-1; i++){
            current = current.next;
            if(current == null || current.next == null){
                System.out.println("Index out of bounds");
                return;
            }
        }
        current.next = current.next.next;
    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
