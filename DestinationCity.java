class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap();
        for(List<String> lists: paths) {
            map.put(lists.get(0), lists.get(1));
        }
        String dest = "";
        for(String value: map.values())  {
            if(!map.containsKey(value)) {
                dest = value;
            }
        }
        return dest;
    }
}
