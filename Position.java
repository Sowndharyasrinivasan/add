public static void main(String args[]) {
        int size = 2;     
        generateTable(0, size, new int[size]);
    }

    private static void generateTable(int index, int size, int[] current) {
        if (index == size) {
            for (int a = 0; a < size; a++) {
                System.out.print(current[a] + " ");
            }
            System.out.println();
        } else {
            for (int a = 0; a < 2; a++) {
                current[index] = a;
                generateTable(index + 1, size, current);
            }
        }
}
Contact GitHub API Training Shop Blog About
© 2016 GitHub, Inc. Terms Privacy Security Status Help