package troky.troky.entities;


import java.util.Date;

public class Evenement {

    private int id;
    private int agenda_id;
    private String titre;
    private String description;
    private String lieu;
    private String lien;
    private Date date_debut;
    private Date date_fin;
    private String type;
    private String type_event;

    // Constructeur


    public Evenement() {
    }

    public Evenement(int id, int agenda_id, String titre, String description, String lieu, String lien, Date date_debut, Date date_fin, String type, String type_event) {
        this.id = id;
        this.agenda_id = agenda_id;
        this.titre = titre;
        this.description = description;
        this.lieu = lieu;
        this.lien = lien;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.type = type;
        this.type_event = type_event;
    }

    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAgenda_id() {
        return agenda_id;
    }

    public void setAgenda_id(int agenda_id) {
        this.agenda_id = agenda_id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_event() {
        return type_event;
    }

    public void setType_event(String type_event) {
        this.type_event = type_event;
    }
}
