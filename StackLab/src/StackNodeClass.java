public class StackNodeClass <T>{

    private StackNodeClass nodeOne;
    private StackNodeClass nodeTwo;

    private T value;

    public StackNodeClass(){//default constructor
        nodeOne = null;
        nodeTwo = null;
    }

    public StackNodeClass(T value){
        nodeOne = null;
        nodeTwo = null;
        this.value = value;
    }

    public StackNodeClass(T value, StackNodeClass node1, StackNodeClass node2){//constructor with value node1 and node2
        this.nodeOne = node1.nodeOne;
        this.nodeTwo = node2.nodeTwo;
        this.value = value;
    }


    //Mutators

    public void setValue(T value){
        this.value = value;
    }

    public void setFirstNode(StackNodeClass nodeOne){// sets the first node
        this.nodeOne = nodeOne;
        makeChild(nodeOne);
    }

    public void setSecondNode(StackNodeClass nodeTwo) {// sets the second node
        this.nodeTwo = nodeTwo;
        makeParent(nodeTwo);
    }

    private void makeChild(StackNodeClass nodeOne){//child node
        this.nodeOne = nodeOne;
    }

    private void makeParent(StackNodeClass nodeTwo){//parent node
        this.nodeTwo = nodeTwo;
    }

    //accessors

    public T getValue(){
        return value;
    }

    public StackNodeClass getFirstNode(){//gets the first node
        return nodeOne;
    }

    public StackNodeClass getSecondNode(){//gets the second node
        return nodeTwo;
    }

    public String toString(){//to string method
        if (value == null) return "";
        else return "Node: "+ value.toString();
    }

    public boolean equals(StackNodeClass node){
        if (this.value == null && node.value == null){
            return true;
        } else if (this.value == null || node.value == null){
            return false;
        } else return this.value == node.value;
    }
}
