import compression.BitPackingConsecutive;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 64, 58, 50};

        BitPackingConsecutive bitPackingConsecutive = new BitPackingConsecutive();
        bitPackingConsecutive.compress(arr);
    }
}