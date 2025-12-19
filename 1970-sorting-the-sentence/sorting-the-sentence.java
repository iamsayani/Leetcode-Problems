class Solution {
    public String sortSentence(String s) {
        StringBuilder builder = new StringBuilder();
        String[] words = s.split(" ");
        String [] sortedWords = new String[words.length];
        for (String word : words){
            int position = word.charAt(word.length() - 1) - '0';
            String actualWord = word.substring(0, word.length() - 1);
            sortedWords[position - 1] = actualWord;
        }
        for (int i = 0; i< sortedWords.length; i++){
            builder.append(sortedWords[i]);
            if (i < sortedWords.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}