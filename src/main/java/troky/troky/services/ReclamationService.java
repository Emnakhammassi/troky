package troky.troky.services;

import troky.troky.entities.Reclamation;
import troky.troky.interfaces.IReclamation;
import troky.troky.tools.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class ReclamationService implements IReclamation<Reclamation> {

    @Override
    public void addReclamation(Reclamation reclamation) {

        // Obtention de la date actuelle
        Timestamp dateActuelle = new Timestamp(System.currentTimeMillis());

        // Préparation de la requête SQL avec des paramètres de substitution
        String requete = "INSERT INTO Reclamation (date_reclamation, description_reclamation, statut_reclamation, type,image_path) VALUES (?, ?, ?, ?,?)";

        try (Connection connection = new MyConnection().getCnx();
             PreparedStatement statement = connection.prepareStatement(requete)) {

            // Attribution des valeurs aux paramètres de la requête
            statement.setTimestamp(1, dateActuelle); // Date actuelle
            statement.setString(2, reclamation.getDescription_reclamation());
            statement.setString(3, "En attente"); // Statut par défaut
            statement.setString(4, reclamation.getType());
            statement.setString(5, reclamation.getImage_path());

            // Exécution de la requête d'insertion
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Réclamation ajoutée avec succès !");
            } else {
                System.out.println("Échec de l'ajout de la réclamation !");
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout de la réclamation : " + e.getMessage());
        }

    }

    @Override
    public void deleteReclamation(Reclamation reclamation) {

    }

    @Override
    public void updateReclamation(Reclamation reclamation) {

    }

    @Override
    public List<Reclamation> getData() {
        return null;
    }
}