public class java4 {
    public static void main(String[] args) {
        int intArray[][] = new int[4][];
        intArray[0] = new int[4];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];
        int cnt = 10;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length;j++) {
                System.out.printf("%d ",cnt);
                cnt += 1;
            }
            System.out.println();
        }
    }
}