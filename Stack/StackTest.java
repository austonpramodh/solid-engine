
package Stack;

class StackTest {
    public static void main(String[] args) {
        Stack theStack = new Stack(10); // make new stack
        theStack.push(20); // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        theStack.print();
        theStack.removeSecond();
        System.out.println("After removeSecond()");
        theStack.print();
        StackTest.convertDecimalToBinary(9);
    } // end main()

    public static void convertDecimalToBinary(int num) {
        // creating a stack
        Stack myStack = new Stack(10);
        System.out.println("------Decimal to binary conversion-----");
        System.out.println("Decimal to be converted: " + num);

        while (num > 0) {
            int r = num % 2;

            // pushing the remainder inside the stack
            myStack.push(r);
            num /= 2;
        }

        System.out.print("Binary equivalent: ");

        while (!(myStack.isEmpty())) {
            // printing the resultant binary number stored in the
            // stack in LIFO manner
            System.out.print(myStack.pop());
        }
        System.out.println(" ");
    }
}
