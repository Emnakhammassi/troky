package troky.troky.entities;

import java.util.Date;

public class Blog {
    private int id;
    private int auteur_id;
    private String contenu;
    private String titre;
    private Date date_publication;
    private String langue;
    private Boolean statut;

    // Constructeur

    public Blog() {
    }

    public Blog(int id, int auteur_id, String contenu, String titre, Date date_publication, String langue, Boolean statut) {
        this.id = id;
        this.auteur_id = auteur_id;
        this.contenu = contenu;
        this.titre = titre;
        this.date_publication = date_publication;
        this.langue = langue;
        this.statut = statut;
    }

    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuteur_id() {
        return auteur_id;
    }

    public void setAuteur_id(int auteur_id) {
        this.auteur_id = auteur_id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(Date date_publication) {
        this.date_publication = date_publication;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }
}

