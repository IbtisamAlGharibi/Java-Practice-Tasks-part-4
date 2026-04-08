public class Task23 {
    public static void main(String[] args){

        int[] array ={1,2,3,4,5};

        int[] result = zeroMax(array);

        System.out.println(result);
    }

    public static int[] zeroMax(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                int maxOdd = 0;

                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > maxOdd) {
                        maxOdd = nums[j];
                    }
                }


                if (maxOdd != 0) {
                    nums[i] = maxOdd;
                }
            }
        }

        return nums;
    }
}
