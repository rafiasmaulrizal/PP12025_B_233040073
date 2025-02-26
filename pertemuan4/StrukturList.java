package pertemuan4;

public class StrukturList {
  public Node HEAD;

  public void addHead(double data){
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

    public void addTail(double data){
      Node posNode=null, curNode=null;
  
      Node newNode = new Node(data);
      if (HEAD == null)
      {
        HEAD = newNode;
      }
      else {
        curNode = HEAD;
        while (curNode != null)
        {
          posNode = curNode;
          curNode = curNode.GetNext();
        }
        posNode.SetNext(newNode);   
      }
      }


  public void addMid(double data, int position) {
        Node posNode = null, curNode = HEAD;
        int i = 1;

        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            if (position == 1) {
                newNode.SetNext(HEAD);
                HEAD = newNode;
            } else {
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.GetNext();
                    i++;
                }
                if (posNode != null) {
                    posNode.SetNext(newNode);
                    newNode.SetNext(curNode);
                }
            }
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
