package compression;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.ceil;

public class BitPackingConsecutive {

    public BitPackingConsecutive() {

    }


    public void compress(int[] arr) {
        if (arr.length == 0) return;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int bits = (int) ceil(Math.log(max + 1) / Math.log(2));

//        System.out.println(bits);

        int arraySize = (bits * arr.length + 32 - 1) / 32;
//        System.out.println(arraySize);

        int[] compressedArray = new int[arraySize];



    }

    public void decompress() {
    }

}
