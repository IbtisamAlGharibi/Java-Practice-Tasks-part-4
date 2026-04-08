public class Task16 {
    public static void main(String[] args){
        int [] array = {1,2,3,4};
        boolean result = only14(array);
        System.out.println(result);

    }

    public static boolean only14(int[] array){
        for (int i = 0 ; i< array.length-1; i++){
            if (array[i] == 1 || array[i]==4){
                return true;
            }

        }
        return false;
    }
}
