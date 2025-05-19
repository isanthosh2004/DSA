class Solution {
    public List<List<Integer>> generate(int numrows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numrows ==0 ) return triangle;
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);
        for(int i = 1; i<numrows;i++){
            List<Integer> prevrow = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j<i;j++){
                row.add(prevrow.get(j-1)+prevrow.get(j));

            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;

        
    }
}

