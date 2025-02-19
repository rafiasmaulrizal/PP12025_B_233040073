public class StrukturListTail {
  Node HEAD;

  public void addTail(int data){
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

    public void display(){
      Node curNode = HEAD;
      while (curNode != null)
      {
        System.out.print(curNode.GetData()+ " ");
        curNode = curNode.GetNext();
      }
    }
  }

  

