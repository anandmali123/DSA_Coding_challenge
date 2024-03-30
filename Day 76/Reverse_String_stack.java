
class Solution {

    public String reverse(String S) {
        // code here
        Stack<Character> st = new Stack<>();

        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            st.push(S.charAt(i));
        }
        char[] arr = new char[S.length()];
        int i = 0;
        while (!st.isEmpty()) {
            arr[i] = st.pop();
            i++;
        }
        return String.valueOf(arr);
    }

}