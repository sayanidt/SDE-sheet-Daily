class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        long long sum=0;
        int minAbs= INT_MAX;
        int nc= 0;

        for (auto &row : matrix){
            for(int val: row){
                

                if(val<0)
                    nc++;
                
                int absVal= abs(val);
                sum+= absVal;

                minAbs= min(minAbs, absVal);
            }
        }
        if(nc % 2==1){
            sum-= 2LL* minAbs;

        }
        return sum;
        
    }
};