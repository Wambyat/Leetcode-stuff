class Solution {
    public boolean isValid(String s) {
        
        Stack<String> st = new Stack<String>();
        String[] substrings = s.split("");
         
        for (String ch : substrings) {
                switch(ch){
                    case "(":
                        st.push("(");
                        break;
                    case "[":
                        st.push("[");
                        break;
                    case "{":
                        st.push("{");
                        break;
                    case ")":
                        if (st.empty())
                        {
                            return false;
                        }
                        if (st.peek().equals("("))
                        {
                            st.pop();
                        }
                        else
                        {
                            return false;
                        }
                        break;
                    case "]":
                        if (st.empty())
                        {
                            return false;
                        }
                        if (st.peek().equals("["))
                        {
                            st.pop();
                        }
                        else
                        {
                            return false;
                        }
                        break;
                    case "}":
                        if (st.empty())
                        {
                            return false;
                        }
                        if (st.peek().equals("{"))
                        {
                            st.pop();
                        }
                        else
                        {
                            return false;
                        }
                        break;
                }
        }
        if (st.empty())
        {
            return true;
        }
        return false;
    }
}
