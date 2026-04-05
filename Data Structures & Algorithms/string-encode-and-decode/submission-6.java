class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        sb.append(strs.size());
        sb.append("_#_");
        for(String s: strs){
            sb.append("$"+ s);
            sb.append("_#_");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        String[] strs = str.split("_#_");
        System.out.println(strs[0]);
        if(strs[0].equals("1") && strs.length == 1) res.add("");
        for(int i = 1; i < strs.length; i++){
            res.add(strs[i].substring(1));
        }
        return res;
    }
}
