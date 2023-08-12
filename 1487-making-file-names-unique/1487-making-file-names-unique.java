class Solution {
    public String[] getFolderNames(String[] names) {
        final Map<String, Integer> uniqueNames = new HashMap<>();

        for(int i = 0; i < names.length; ++i) {
            String file = names[i];

            int count = uniqueNames.getOrDefault(file, 0);

            while(uniqueNames.containsKey(file))
                file = names[i] + "(" + ++count + ")";

            uniqueNames.put(names[i], count);
            uniqueNames.put(file, 0);
            
            names[i] = file;
        }

        return names;
    }
}