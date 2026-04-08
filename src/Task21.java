public class Task21 {
    public static void main(String[] args){
        int [] array ={1,2,3,4,5};
        int[] result = tenRun(array);
        System.out.println(result);

    }

    public static int[] tenRun(int[] array){
        for (int i = 0; i< array.length-1;i++){
            if (array[i]% 10 == 0){
                for (int j =0; j < array.length-1;j++){
                    System.out.println(array[i]);

                }
            }
        }
        return  array;
    }
}
