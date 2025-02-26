package pertemuan4;

public class StrukturListTest {
  public static void main(String[] args){
    StrukturList list = new StrukturList();
    list.addTail(3);
    list.addTail(4);
    list.addMid(7,2);
    list.addMid(8,2);
    list.addHead(5);
    System.out.println();

    list.display();

    // Tugas A
    StrukturList list1 = new StrukturList();
    list1.addTail(3.4);
    list1.addMid(4.5,2);
    list1.addHead(2.1);
    System.out.println();
    list1.display();

    // Tugas B
    StrukturList list2 = new StrukturList();
    list2.addTail(4.5 );
    list2.addTail(5.5);
    list2.addMid(1.1,1);
    list2.addHead(2.1);
    list2.addHead(3.4);
    System.out.println();
    list2.display();

}
}
