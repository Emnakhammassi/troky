package troky.troky.entities;


import java.util.Date;

public class Dons {
    private int id;
    private int donateur_id;
    private int organisation_id;
    private Date date;
    private String compagne_collect;
    private double montant;

    //constructeur

    public Dons() {
    }

    public Dons(int id, int donateur_id, int organisation_id, Date date, String compagne_collect, double montant) {
        this.id = id;
        this.donateur_id = donateur_id;
        this.organisation_id = organisation_id;
        this.date = date;
        this.compagne_collect = compagne_collect;
        this.montant = montant;
    }

    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDonateur_id() {
        return donateur_id;
    }

    public void setDonateur_id(int donateur_id) {
        this.donateur_id = donateur_id;
    }

    public int getOrganisation_id() {
        return organisation_id;
    }

    public void setOrganisation_id(int organisation_id) {
        this.organisation_id = organisation_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCompagne_collect() {
        return compagne_collect;
    }

    public void setCompagne_collect(String compagne_collect) {
        this.compagne_collect = compagne_collect;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
