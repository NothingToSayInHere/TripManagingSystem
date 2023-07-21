public class Chauffeur {

    private int chauffeurId;

    public Chauffeur(int chauffeurId) {
        this.chauffeurId = chauffeurId;
    }

    public int getChauffeurId() {
        return chauffeurId;
    }

    public void setChauffeurId(int chauffeurId) {
        this.chauffeurId = chauffeurId;
    }

    public String toString() {
        return "Chauffeur ID: " + chauffeurId;
    }
}
