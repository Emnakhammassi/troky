package troky.troky.entities;

import java.util.Date;

public class Administrateur {
    //kont hne bech naaml heritager men class utilisateur
    //mais khalitha kima heya htta tchouf maaha nty

    private int id;

    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private Date date_inscription;
    private String photo_profil;
    private int evenement_id;
    private String rib;
    private String adresse;
    private int tel;
    private int note;
    private String statut;
    private String role;
    private boolean is_active;
    private String salt;

    //constructeur

    public Administrateur() {
    }

    public Administrateur(int id, String nom, String prenom, String email, String mdp, Date date_inscription, String photo_profil, int evenement_id, String rib, String adresse, int tel, int note, String statut, String role, boolean is_active, String salt) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.date_inscription = date_inscription;
        this.photo_profil = photo_profil;
        this.evenement_id = evenement_id;
        this.rib = rib;
        this.adresse = adresse;
        this.tel = tel;
        this.note = note;
        this.statut = statut;
        this.role = role;
        this.is_active = is_active;
        this.salt = salt;
    }

    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Date getDate_inscription() {
        return date_inscription;
    }

    public void setDate_inscription(Date date_inscription) {
        this.date_inscription = date_inscription;
    }

    public String getPhoto_profil() {
        return photo_profil;
    }

    public void setPhoto_profil(String photo_profil) {
        this.photo_profil = photo_profil;
    }

    public int getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}


