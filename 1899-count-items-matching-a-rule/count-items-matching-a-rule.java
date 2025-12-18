class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;

        // Determine which position to check
        if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }
        // if ruleKey is "type", index remains 0

        // Loop through each item and check the correct field
        for (List<String> item : items) {
            if (ruleValue.equals(item.get(index))) {
                count++;
            }
        }

        return count;
    }
}
