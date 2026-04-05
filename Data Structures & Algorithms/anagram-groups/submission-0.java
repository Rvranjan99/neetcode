class Solution {
    public String getKey(String s){
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        };
        return Arrays.toString(count);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String str:strs){

            String key = getKey(str);
            m.putIfAbsent(key,new ArrayList<>());
            m.get(key).add(str);
        }
        return new ArrayList<>(m.values());
    }
}
