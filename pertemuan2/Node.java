package pertemuan2;

public class Node {
  private int nilai;
  private Node next;
  private String nama;

 //inisialisasi node
 public Node(int nilai) {
   this.nilai = nilai;
 }

 public void SetNilai(int nilai) {
   this.nilai = nilai;
 }

 public int GetNilai() {
   return nilai;
 }

 public void SetNext(Node next) {
   this.next = next;
 }

 public Node GetNext() {
   return next;
 }
}