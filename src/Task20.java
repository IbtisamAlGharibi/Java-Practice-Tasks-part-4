public class Task20 {
    public static void main(String[] args){
        int [] array ={1,2,3,4,5};
        boolean result = tripleUp(array);
        System.out.println(result);

    }

    public static boolean  tripleUp(int [] array){
        for ( int i = 0; i <array.length-1 ; i++){
            if (array[i+2]==array[i+1]+1 && array[i+1] == array[i]+1 ){
                return  true;
            }


        }

        return false;
    }
}
