package Basics.Programs.Bit_Manipulation;

public class BitManipulation {
    public static void main(String[] args) {

        // Flip the right most bit
        // num - (num & (-num))
        /*
         * num: 10010100
         * 
         * Negative Number:
         *  1's Compliment: Flip all the bits
         *  2's Compliment: Add 1 in 1's compliment
         * 
         * -num: 01101011 + 1 => 01101100
         * 
         * num & (-num) => 10010100 & 01101100 => 00000100
         * 
         * num - (num & (-num)) => 10010100 - 00000100 => 10010000
         * 
         * Above operation is done in O(1) TC. We can do the same operation in O(logN) if we right sift 1 upto we find the right most set bit and then flip that bit.
         * 
         * OTHER WAY: Flip the rightmost set bit: num & (num - 1)
         */
    }
}
