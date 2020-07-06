package lesson6;


public class MyTasks {

    public int[] doArrayFirst(int[] ar) {

        int[] br;
        if (ar.equals(null)) {
            return null;
        }
        int i;
        for (i = ar.length - 1; i >= 0; i--) {
            if (ar[i] == 4) {
                br = new int[ar.length - 1 - i];
                for (int j = 0; j < ar.length - i - 1; j++) {
                    br[j] = ar[j + i + 1];
                }
                return br;
            }
        }
            return null;
    }

    public boolean doArraySecond(int[] ar) {
        for (int a: ar) {
            if (a == 1 | a == 4) {
                return true;
            }
        }
        return false;
    }

}
