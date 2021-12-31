public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // initiate a hashmap here
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            // set a var requiredNum to be equal to an integer of the val 'targer - numbers
            // at i'
            Integer requiredNum = (Integer) (target - numbers[i]);

            // this checks if our hashmap contains the requiredNum value
            if (indexMap.containsKey(requiredNum)) {
                int toReturn[] = { indexMap.get(requiredNum), i };
                return toReturn;
                // if our hashmap contains the requiredNum value, return it along with the
                // current value we are
                // testing at.
            }

            indexMap.put(numbers[i], i);
            // if our hashmap does not contain the value, add the current value into the
            // hashmap
        }
        return null;
    }
}

// [3,1,6,7]
// 9
// 9-3 = 6
// 9-1=8
// 9-6=3
// <3,1,
//
// [0,2]