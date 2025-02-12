package pertemuan2;

public class NodeMainA {
  public static void main(String[] args) {
  Node n1 = new Node(5);
  Node n2 = new Node(7);
  Node n3 = new Node(9);
  Node n4 = new Node(8);

  n1.SetNext (n2);
  n2.SetNext (n3);
  n3.SetNext (n4);

  Node p = n1;
  while (p!=null) 
  { 
  System.out.printf("%d,", p.GetNilai());
  p = p.GetNext();
}
}
}
