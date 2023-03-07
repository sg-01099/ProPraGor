import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


// list of all SecLibEntrys used in the training step and the functions to fill
public class SecLibEntryList {
    private ArrayList<SecLibEntry> entryList;

    public static ArrayList<SecLibEntry> fillEntryListFromSecLib(String seclibFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(seclibFile));
        String newLine;
        ArrayList<SecLibEntry> entryList = new ArrayList<>();
        SecLibEntry newEntry = null;

        while ((newLine = reader.readLine()) != null) {
            // skip line if line is empty
            if (newLine.equals('\n') && newEntry != null && newEntry.getAaSequence().length() >= 17) {
                entryList.add(newEntry);
                newEntry = null;
            } else if (newLine.startsWith(">")) {
                newEntry.setPDBid(newLine.substring(1).trim());
            } else if (newLine.startsWith("AS ")){
                newEntry.setAaSequence(newLine.substring(3).trim());
            } else if (newLine.startsWith("SS ")){
                newEntry.setSsSequence(newLine.substring(3).trim());
            }
        }

        reader.close();
        return entryList;
    }
}
