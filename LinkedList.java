public class LinkedList<T> {
    private Node <T> head;
    private Node <T> tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void insertFront(T data){
        if(this.head == null){
            this.head = new Node<>(data);
            this.tail = head;
        } else {
            Node<T> oldHead = this.head;
            this.head = new Node<T>(data);
            this.head.setNext(oldHead);
        }
    }
    public void insertBack(T data){
        if(this.tail == null){
            this.tail = new Node<>(data);
            this.head = tail;
        } else {
            Node<T> oldTail = this.tail;
            this.tail.setNext(oldTail);
        }
    }

    public void removeBack(T data){
        if(this.tail == null){
            //do nothing, tail is empty
        } else if( this.head.getNext() == null){
           //this is the last element clear list
            this.head = null;
            this.tail = null;
        }
    } else {
        //find  peneultimate
        Node<T> currentNode = this.head;
        Node<T> nextNode = currentNode.getNext();

        while ( nextNode != null){
            nextNode = nextNode.getNext();
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(null);
        this.tail = currentNode;
    }

    public void removeFront (T data){
        if(this.head == null){
            return;
        } else {
            this.head = this.head.getNext();
            if(this.head == null){
                //list is now empty, clear tail.
                this.tail = null;
            }
        }
    }

    public void printContents(){
        Node currentNode = head;



    }
}
