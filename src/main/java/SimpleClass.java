import java.util.Arrays;
import java.util.List;

public class SimpleClass {
    public static void main(String[] args) {
//        List<Integer> intList = Arrays.asList(2,3,4,7,11);
//        int k = 5;
        List<Integer> intList = Arrays.asList(1,2,3,4);
        int k = 2;
        SimpleClass ob = new SimpleClass();
        System.out.println("Missing value:" + ob.findMissing(intList,k));
    }
    private int findMissing(List<Integer> intList, int k){
        int missingInt = 0;
        for(int i=1;i<1000; i++){
            if(!intList.contains(i)){
                ++ missingInt;
                if(missingInt== k){
                    return i;
                }
            }
        }
        return -1;
    }
}
