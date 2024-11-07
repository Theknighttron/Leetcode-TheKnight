import java.util.ArrayList;
import java.util.List;

class GreatestNoOfCandies {
    int[] candies = {2,3,5,1,3};
    int extraCandies = 3;

    public static void main(String[] args) {
        GreatestNoOfCandies candy = new GreatestNoOfCandies();
        List<Boolean> output = candy.kidsWithCandies(candy.candies, candy.extraCandies);

        System.out.println(output);

    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        for (int candy: candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        for (int candy: candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
