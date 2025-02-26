package pertemuan4;

public class Node {
  private double data;
  private Node next;

  public Node(double data) {
    this.data = data;
  }

  public void SetData(double data) {
    this.data = data;
  }

  public double GetData() {
    return data; 
  }

  public void SetNext(Node next) {
    this.next = next;
  }
 
  public Node GetNext() {
    return next;
  }
}
