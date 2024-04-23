import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        int minIndex = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),map.get(s.charAt(i)) +1 );
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(map);

        for(int i = 0;i<s.length();i++){
            for(Map.Entry<Character,Integer> element : map.entrySet()){
                if(element.getKey() == s.charAt(i) && element.getValue() == 1){
                    return i;
                }
            }
        }
        return -1;
    }
}