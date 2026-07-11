class Solution {
    char delimiter = '#';
    public String encode(List<String> strs) {
        StringBuilder stb = new StringBuilder();
        for (String str : strs) {
            stb.append(str.length());
            stb.append(delimiter);
            stb.append(str);
        }
        return stb.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> op = new ArrayList();
        String wl = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != delimiter) {
                wl = wl + ch;
            } else {
                 System.out.println(i);
                 System.out.println(str.substring(i + 1, i + 1 + Integer.valueOf(wl)));
                op.add(str.substring(i + 1, i + 1 + Integer.valueOf(wl)));
                i = i + Integer.valueOf(wl);
                wl = "";
            }
        }
        return op;
    }
}
