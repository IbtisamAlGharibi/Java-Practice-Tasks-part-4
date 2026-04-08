public class Task24 {
    public static void main(String[] args) {
       int [] array = {1,2,3,4,5};

        int result = centeredAverage(array);
        System.out.println( result);
    }
    }

    public static int centeredAverage(int[] nums) {

        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        sum = sum - min - max;

        int average = sum / (nums.length - 2);

        return average;
    }


