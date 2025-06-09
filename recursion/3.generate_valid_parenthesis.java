class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("",n,n,result);
        return result;

        
    }
    private void backtrack(String output, int remopen, int remclose, List<String> result){
        if(remopen == 0 & remclose == 0){
            result.add(output);
            return;
        }
        if(remopen>0){
            backtrack(output+"(", remopen-1, remclose, result);

        }
        if(remclose>remopen){
            backtrack(output+")", remopen, remclose-1, result);
        }
    }
}
