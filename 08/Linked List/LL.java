public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = size;
    }

    public void insertAtFirst(int val){
        Node newNode = new Node(val);
        newNode.value = val;
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    private class Node{
        private int value;
        private Node next;
        Node (int value){
            this.value = value;
        }
        Node (int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
