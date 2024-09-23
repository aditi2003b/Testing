import java.util.*;

public class sortBasisFrequency {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,6,6,6,6,6,6,6,6,7,7,7};
        int n=arr.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        System.out.println(h);

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(h.entrySet());

        list.sort(
                (a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return b.getValue()-a.getValue();
            }
            else{
                return a.getKey()-b.getKey();
            }
        });
        int i=0;
        for(Map.Entry<Integer,Integer> m : list){
            int key=m.getKey();

            int val=m.getValue();
            for(int j=0;j<val;j++) {
                arr[i] = key;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
