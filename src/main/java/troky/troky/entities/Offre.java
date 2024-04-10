package troky.troky.entities;

import java.util.Date;
import java.util.List;

public class Offre {

    private int id;
    private int offreur_id;
    private String nom;
    private String categorie;
    private String description;
    private String etat;
    private Date date_publication;
    private List<String> photos;


    //constructeur

    public Offre() {
    }

    public Offre(int id, int offreur_id, String nom, String categorie, String description, String etat, Date date_publication, List<String> photos) {
        this.id = id;
        this.offreur_id = offreur_id;
        this.nom = nom;
        this.categorie = categorie;
        this.description = description;
        this.etat = etat;
        this.date_publication = date_publication;
        this.photos = photos;
    }

    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOffreur_id() {
        return offreur_id;
    }

    public void setOffreur_id(int offreur_id) {
        this.offreur_id = offreur_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(Date date_publication) {
        this.date_publication = date_publication;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}
