public class ListMainHead {
  public static void main(String[] args){
    StrukturListHead list = new StrukturListHead();
    list.addHead(5);
    list.addHead(4);
    list.addHead(3);

    System.out.println();
    list.display();

    // Tes 3a
    StrukturListHead list1 = new StrukturListHead();
    list1.addHead(1);
    list1.addHead(2);
    list1.addHead(3);

    System.out.println();
    list1.display();

    // Tes 3b
    StrukturListHead list2 = new StrukturListHead();
    list2.addHead(7);
    list2.addHead(5);
    list2.addHead(4);
    list2.addHead(1);

    System.out.println();
    list2.display();
  }
}
