package troky.troky.entities;


public class Organisation {
    private int id;
    private String nom_organisation;
    private String description;
    private String rib;
    private String adresse;

    // Constructeur


    public Organisation() {
    }

    public Organisation(int id, String nom_organisation, String description, String rib, String adresse) {
        this.id = id;
        this.nom_organisation = nom_organisation;
        this.description = description;
        this.rib = rib;
        this.adresse = adresse;
    }


    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_organisation() {
        return nom_organisation;
    }

    public void setNom_organisation(String nom_organisation) {
        this.nom_organisation = nom_organisation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


}
