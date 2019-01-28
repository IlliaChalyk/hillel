public class Jewels {
    public static void main(String[] args) {

        String jewels = "aAb";
        String stones = "dgDDdbfdsawrA";

        System.out.println("Jewels in stones: " + jewelsInStone(jewels, stones));
    }

    private static int jewelsInStone(String jewels, String stones) {

        int result = 0;

        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {

                if (stones.charAt(j) == jewels.charAt(i)) {
                    result++;
                }
            }
        }

        return result;
    }
}