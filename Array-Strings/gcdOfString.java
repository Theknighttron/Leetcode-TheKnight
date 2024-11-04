class GcdOfString {
    String str1 = "ABCABC";
    String str2 = "ABC";

    public static void main(String[] args) {
        GcdOfString gcd = new GcdOfString();
        String output = gcd.gcdOfString(gcd.str1, gcd.str2);

        System.out.println(output);
    }

    public String gcdOfString(String str1, String str2) {
        // Check if str1 + str 2 equals str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";      // No common divisor string
        }


        // Calculate the GCD of the length of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());


        // Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);

    }

    // Helper method to calculate the GCD of two integers
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
