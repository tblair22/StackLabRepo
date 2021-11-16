/*
Trent Blair
11/15/21
This class is the driver for the Stack Node Class
 */

public class StackNodeDriver {

    public static void main(String[] args) {
        Stack<String> s1 = new Stack<String>();
        s1.push("numOne");
        s1.push("numTwo");
        s1.push("numThree");

        System.out.println("should print 3");
        System.out.println(s1.size());

        //System.out.println("should print thirdNode");
        //System.out.println(s1.pop());

        System.out.println("should print 3");
        System.out.println(s1.size());

        //System.out.println("should print secondNode");
        //System.out.println(s1.peek());

        System.out.println("should print false");
        System.out.println(s1.isEmpty());
    }
}
