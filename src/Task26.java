public class Task26 {
    public static void main(String[] args){
        int [] array = {1,1,1,1,3,4,4,6};
        boolean result = more14(array);
        System.out.println(result);
    }

    public static boolean  more14(int[] array){
        int sum1 = 0;
        int sum4 = 0;

        for (int i =0; i< array.length-1; i++){
            if (array[i] == 1){
                sum1 +=1;

            }
            if (array[i] == 4){
                sum1 +=1;

            }

            if ( sum1 > sum4){
                return true;            }

        }
        return false;
    }
}
