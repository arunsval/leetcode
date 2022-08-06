import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Buildings {
    public static void main(String[] args) {
        List<Integer> heights = Arrays.asList(4,3,2,1);
        int totalBuildings = heights.size();
        List<Integer> oceanViewBuildings = new ArrayList<>();
        getFinalList(heights, totalBuildings, oceanViewBuildings);
        System.out.println("Ocean View Buildings: ");
        oceanViewBuildings.stream().forEach(System.out::print);
    }

    private static void getFinalList(List<Integer> heights, int totalBuildings, List<Integer> oceanViewBuildings) {
        for(int i = 0; i< totalBuildings; i++){
            int currentBuildingHeight = heights.get(i);
            int k =i+1;
            boolean hasOceanView = false;
            while(k<totalBuildings){
                if(currentBuildingHeight > heights.get(k)){
                    hasOceanView = true;
                } else{
                    hasOceanView = false;
                    break;
                }
                ++k;
            }
            if(hasOceanView){
                oceanViewBuildings.add(i);
            }
        }
        oceanViewBuildings.add(heights.size()-1);
    }
}
