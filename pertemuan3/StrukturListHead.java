public class StrukturListHead {
  Node HEAD;

  public void addHead(int data){
    Node posNode=null, curNode=null;

    Node newNode = new Node(data);
    if (HEAD == null)
    {
      HEAD = newNode;
    }
    else {
      newNode.SetNext(HEAD);
      HEAD = newNode;
    }
    }

    public void display(){
      Node curNode = HEAD;
      while (curNode != null)
      {
        System.out.print(curNode.GetData()+ " ");
        curNode = curNode.GetNext();
      }
    }
}
