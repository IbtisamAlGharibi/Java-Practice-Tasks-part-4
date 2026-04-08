public class Task18 {
    public static void main(String[] args){
        int [] array = {1,2,3,4,4};
        boolean result = has77( array);
        System.out.println(result);

    }

    public static boolean  has77(int [] array){
        for ( int i = 0; i <array.length-1 ; i++){
            if (array[i]==7 && array[i+1]==7  ||
                    array[i]==7 && array[i+2]==7 ){
                return true;
            }

        }
        return false;
    }
}
