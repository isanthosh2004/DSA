class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int i =-1;
        for(char c : s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                i++;
                stack[i]=c;

            }else if(i>=0 && (stack[i]=='{'&&c=='}' || stack[i]=='['&&c==']' ||stack[i]=='('&&c==')')){
                i--;
            }else{
                return false;
            }
        }
        return i==-1;

    }
}
