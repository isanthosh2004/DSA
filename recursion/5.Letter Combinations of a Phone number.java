class Solution {
    private static final String[] mapping={

        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public List<String> letterCombinations(String digit) {
        if(digit == null || digit.length()== 0){
            return new ArrayList<>();

        }
        List<String> result = new ArrayList<>();
        backtrack(digit,0,new StringBuilder(), result);
        return result;
                
    }
    private void backtrack(String digit, int index , StringBuilder curr , List<String> result){
        if(index ==  digit.length()){
            result.add(curr.toString());
            return;
        }
        int digi = digit.charAt(index)-'0';
        String pl = mapping[digi];
        for(char letter : pl.toCharArray()){
            curr.append(letter);
            backtrack(digit , index +1 , curr , result );
            curr.deleteCharAt(curr.length()-1);

        }
    }
}
