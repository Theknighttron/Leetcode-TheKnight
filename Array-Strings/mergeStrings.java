// Time Complexity: O(n)
// Space Complexity: O(n)

class MergeStrings {

    String word1  = "abcd";
    String word2  = "pq";

    public static void main(String[] args) {
        MergeStrings mergeStrings  = new MergeStrings();
        String output = mergeStrings.mergeAlternately(mergeStrings.word1, mergeStrings.word2);

        System.out.println(output);
    }


    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();

        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();

    }

}



// ARRAY


// class MergeStrings {
//
//     String word1  = "abcd";
//     String word2  = "pq";
//
//     public static void main(String[] args) {
//         MergeStrings mergeStrings  = new MergeStrings();
//         String output = mergeStrings.mergeAlternately(mergeStrings.word1, mergeStrings.word2);
//
//         System.out.println(output);
//     }
//
//
//     public String mergeAlternately(String word1, String word2) {
//         int totalLength = word1.length() + word2.length();
//         char[] mergeArray = new char[totalLength];
//         int index = 0;
//
//
//
//         for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
//             if (i < word1.length()) {
//                 mergedArray[index++] = word1.charAt(i);
//             }
//
//             if (i < word2.length()) {
//                 mergedArray[index++] = word2.charAt(i);
//             }
//         }
//
//         return merged.toString();
//         return new String(mergedArray);
//
//     }
//
//
//
// }
//
