class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        TreeMap<Integer, List<Character>> freqToChars = new TreeMap<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Group characters by frequency
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            freqToChars.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        // Build result string by appending characters freq times in descending order of freq
        for (Map.Entry<Integer, List<Character>> entry : freqToChars.entrySet()) {
            int freq = entry.getKey();
            for (char c : entry.getValue()) {
                for (int i = 0; i < freq; i++) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}
