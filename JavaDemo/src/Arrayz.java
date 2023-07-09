public class Arrayz {
    public void singleDimensionArray() {
        int num[] = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println("\n");
    }

    public void doubleDimensionArray() {
        int num[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public void multiDimensionArray() {

    }
}
