import java.util.ArrayList;

public class LeadersInArray {
    public ArrayList<Integer> findLeader (ArrayList<Integer> Arr){
        int n = Arr.size();
        ArrayList<Integer> result = new ArrayList<Integer> ();
        result.add(Arr.size() - 1);
        int max = Arr.get(n-1);
        for(int i = n-2; i >= 0 ; i--){
            if(Arr.get(i) >= max) {
                max = Arr.get(i);
               result.add(Arr.get(i));
            }
        }
        return result;
    }
}
