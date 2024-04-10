package troky.troky.entities;

import java.util.Date;

public class DemandeOffre {
    private int id;
    private int offre_id;
    private String statut;
    private Date date_creation;

    //constructeur


    public DemandeOffre() {
    }

    public DemandeOffre(int id, int offre_id, String statut, Date date_creation) {
        this.id = id;
        this.offre_id = offre_id;
        this.statut = statut;
        this.date_creation = date_creation;
    }

    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOffre_id() {
        return offre_id;
    }

    public void setOffre_id(int offre_id) {
        this.offre_id = offre_id;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
}
