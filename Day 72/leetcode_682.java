class Solution {
    public int calPoints(String[] operations1) {
        Stack<Integer> st=new Stack<>();

              for(String operations: operations1){
              if(operations.equals("C")){
                st.pop();
                
              }
              else if(operations.equals("D")){
                int k=st.peek()*2;
                st.push(k);
              }
              else if(operations.equals("+")){
               int prev1=st.pop();
               int prev2=st.peek();
               
               st.push(prev1);
               st.push(prev2+prev1);
               



              }
              else{
              st.push(Integer.parseInt(operations));
              }

        }
        int ans=0;
        for(int score: st){
            ans+=score;
        }
        return ans;
    }
}