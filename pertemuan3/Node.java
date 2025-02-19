public class Node {
  private int data;
  private Node next;

  public Node(int data) {
    this.data = data;
  }

  public void SetData(int data) {
    this.data = data;
  }

  public int GetData() {
    return data; 
  }

  public void SetNext(Node next) {
    this.next = next;
  }
 
  public Node GetNext() {
    return next;
  }
}
