
class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        Stack<Integer> temp = new Stack<>();
        int k = sizeOfStack / 2;
        while (k != 0) {
            int l = s.pop();
            temp.push(l);
            k--;

        }
        s.pop();
        while (!temp.empty()) {
            int j = temp.pop();
            s.push(j);

        }

    }
}
