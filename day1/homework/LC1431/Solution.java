import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];

        // Find maximum candies
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        List<Boolean> answer = new ArrayList<>();

        for (int candy : candies) {
            answer.add(candy + extraCandies >= max);
        }

        return answer;
    }
}