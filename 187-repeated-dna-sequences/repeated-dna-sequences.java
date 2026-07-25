class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n= s.length();
        Set<String> seen= new HashSet<>();
        Set<String> repeat= new HashSet<>();

        int i=0;
        int j=9;
        while(j<n){
            String sub= s.substring(i,j+1);

            if(!seen.add(sub)){
                repeat.add(sub);
            }
            i++;
            j++;
        }
        return new ArrayList<>(repeat);




        
    }
}