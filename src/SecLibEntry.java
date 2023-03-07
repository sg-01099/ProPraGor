// amino acid and secondary structure information of a chain of a PDB-entry
public class SecLibEntry {
    private String PDBid;
    private String chain;
    private String aaSequence;
    private String ssSequence;

    public SecLibEntry(String pdBid, String chain, String aaSequence, String ssSequence) {
        PDBid = pdBid;
        this.aaSequence = aaSequence;
        this.ssSequence = ssSequence;
        this.chain = chain;
    }

    public String getPDBid() {
        return PDBid;
    }

    public void setPDBid(String PDBid) {
        this.PDBid = PDBid;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getAaSequence() {
        return aaSequence;
    }

    public void setAaSequence(String aaSequence) {
        this.aaSequence = aaSequence;
    }

    public String getSsSequence() {
        return ssSequence;
    }

    public void setSsSequence(String ssSequence) {
        this.ssSequence = ssSequence;
    }
}
