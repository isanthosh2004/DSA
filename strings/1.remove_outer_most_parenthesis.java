class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder st = new StringBuilder();
        int opened = 0;
        char[] chars = S.toCharArray();
        for(int i = 0 ;i<chars.length;i++){
            char c = chars[i];
            if(c=='('){
                if(opened >0){
                    st.append(c);

                }
                opened++;
            }
            if(c == ')'){
                opened--;
                if(opened >0 ){
                    st.append(c);
                }
            }

        }
        return st.toString();
        
    }
}
