// Runner/Organiser class for the training step of the algorithm
public class Train {
    private SecLibEntryList entryList;
    private TrainingMatrix matrixH;
    private TrainingMatrix matrixC;
    private TrainingMatrix matrixE;

    private class TrainingMatrix{
        private int[][][] matrix;

    }

    public static void main(String[] args) {
        Train t1 = new Train();
        SecLibEntryList entryList = new SecLibEntryList();
        entryList.fillEntryListFromSecLib()

        for (SecLibEntry entry : entryList) System.out.println(entry.getChain());
    }
}
