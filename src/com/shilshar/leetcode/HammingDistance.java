package com.shilshar.leetcode;

/**
 * Created by rrf297 on 6/8/17.
 * Leetcode problem: https://leetcode.com/problems/hamming-distance/#/description
 */
public class HammingDistance {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(hammingDistance(x,y));
    }

    public static int hammingDistance(int x, int y) {
        int z = x ^ y;
        int hammingDistance = 0;
        char[] binChars = Integer.toBinaryString(z).toCharArray();
        System.out.println(binChars);
        for (char c : binChars){
            if (c=='1')
                hammingDistance++;
        }
        return hammingDistance;
    }
}
