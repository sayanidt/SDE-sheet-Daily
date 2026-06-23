class Solution:
    def numberOfStableArrays(self, zero: int, one: int, limit: int) -> int:
        MOD= 10**9 + 7

        end_zero=[[0] * (one + 1) for _ in range(zero + 1)]
        end_one = [[0] * (one + 1) for _ in range(zero + 1)]

        for i in range(1, min(zero, limit) +1):
            end_zero[i][0]=1
        
        for j in range(1, min(one, limit) + 1):
            end_one[0][j]=1

        for i in range(1, zero + 1):
            for j in range(1, one + 1):
                for count in range(1, min(i, limit)+ 1):
                    end_zero[i][j] += end_one[i- count][j]
                for count in range(1, min(j, limit)+1):
                    end_one[i][j] += end_zero[i][j- count]
                end_zero[i][j] %= MOD
                end_one[i][j] %= MOD
        return (end_zero[zero][one] + end_one[zero][one])% MOD
        