class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char temp=s.charAt(i);
            if(temp=='(')
            st.push(')');
            else if(temp=='{')
            st.push('}');
            else if(temp=='[')
            st.push(']');
            else if(st.isEmpty() || st.pop()!=temp)
            return false;
        }
        return st.isEmpty();
        
    }
}