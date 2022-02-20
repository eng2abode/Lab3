import java.util.Arrays;

public class StackRemoving {
    public static void main(String[] args) {
        int[] a = {11, 12, 13, 14, 15};
        ArrayStack<Integer> s = new ArrayStack<>(a.length);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            s.push(a[i]);
        }

    }
}
