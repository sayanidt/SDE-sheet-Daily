class Solution {
    public int totalMoney(int n) {
        int fullWeeks= n/7;
        int remainingDays= n%7;

        int fullWeekSum= fullWeeks*28 + (fullWeeks * (fullWeeks-1)/2)* 7;
        int start = fullWeeks+1;
        int remainingSum= remainingDays* start+ (remainingDays *(remainingDays-1)/2);

       return fullWeekSum+ remainingSum;



        


    }
}