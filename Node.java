
public class Node<T> {
     T data;
     Node<T> next;

    // Constructor to initialize node with data
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // Getter for data
    public T getData() {
        return data;
    }

    // Setter for data
    public void setData(T data) {
        this.data = data;
    }

    // Getter for next node
    public Node<T> getNext() {
        return next;
    }

    // Setter for next node
    public void setNext(Node<T> next) {
        this.next = next;
    }
}

