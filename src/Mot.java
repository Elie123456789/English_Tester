import java.io.Serializable;

public class Mot implements Serializable {
    static final long serialVersionUID = 0;

    private String motFR;
    private String motEN;
    private int connaissance;

    Mot(String mFR, String mEN) {
        motFR = mFR;
        motEN = mEN;
        connaissance = 0;
    }

    public String getFR() {
        return motFR;
    }

    public String getEN() {
        return motEN;
    }

   /* public boolean compareToFR(String motComparer) {
        if(motComparer == this.motFR) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean compareToEN(String motComparer) {
        if(motComparer == this.motEN) {
            return true;
        }
        else {
            return false;
        }
    }*/


}
