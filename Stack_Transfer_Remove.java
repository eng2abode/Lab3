import java.util.Scanner;

public class Stack_Transfer_Remove {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayStack<Integer> s = new ArrayStack<>(5);
        ArrayStack<Integer> t = new ArrayStack<>(5);
        System.out.println("is the stack(s) state empty before "+s.isEmpty());
        System.out.println("stack(s) size="+s.size());
        System.out.println("-------------------------");
        System.out.println("inpot 5 number of stack(s)");
        for (int i = 0; i <5 ; i++) {
            s.push(in.nextInt());
            System.out.print("top element is ="+s.top());
            System.out.println("    stack size is ="+s.size());
        }
        System.out.println("-------------------------");
        System.out.println("Transfer from stack(s) to stack(t)");
        for (int i = 0; i <5 ; i++) {
            int x=s.pop();
            t.push(x);
            System.out.print("movable element="+x);
            System.out.println("    stack size is ="+t.size());
        }
        System.out.println("-------------------------");
        System.out.println("is the stack(s) state empty after ="+s.isEmpty()+"    stack(s)  size after="+s.size());
        System.out.println("-------------------------");
        System.out.println("is the stack(t) state empty after ="+t.isEmpty()+"    stack(t) size after="+t.size());

        System.out.println("-------------------------");
        System.out.println("remove from stack(t)");
        for (int i = 0; i < 5; i++) {
            System.out.print("remove="+t.pop());
            System.out.println("    size after ="+t.size() );
        }
    }
}
