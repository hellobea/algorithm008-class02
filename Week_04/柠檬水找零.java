    public class Solution {
        public boolean lemonadeChange(int[] bills) {
      
            if (bills.length == 0) return false;
            int ten = 0; int five = 0;
            for (int bill : bills) {
                if (bill == 5) {
                    five++;
                } else if (bill == 10) {
                    if (five == 0) return false;
                    five--;
                    ten++;
                } else {
                    // ￥20
                    if (ten >  0 && five > 0) {
                        ten--;
                        five--;
                    } else if (five >= 3) {
                        five -= 3;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
