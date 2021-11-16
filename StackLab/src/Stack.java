/*
Trent Blair
11/15/21
The Stack class is makes a stack of nodes but the user can only access the top node
 */
public class Stack <T>{
    private StackNodeClass<T> oldNode;
    private int size;
    public Stack(){
        size = 0;
        oldNode = new StackNodeClass<T>();
    }
    public void push(T data){
        StackNodeClass currNode = oldNode;
        for(int i = 1; i < size; i++){
            currNode = currNode.getSecondNode();
        }
        StackNodeClass<T> newNode = new StackNodeClass<T>(data);//new node with data
        newNode.setFirstNode(currNode);
        size++;
    }
    public StackNodeClass pop(){//moves to last node
        StackNodeClass currNode = oldNode;
        for(int i = 0; i < size; i++){
            currNode = currNode.getSecondNode();
        }

        size--;

        return (StackNodeClass)currNode;
    }
    public StackNodeClass peek(){//moves to the last node
        StackNodeClass currNode = oldNode;
        for(int i = 1; i < size; i++){
            currNode = currNode.getSecondNode();
        }
        return currNode;//returns to the top node
    }
    public int size(){// number of nodes
        return size;
    }
    public boolean isEmpty(){
        return !(size>0);
    }
}