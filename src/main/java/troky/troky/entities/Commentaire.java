package troky.troky.entities;

public class Commentaire {

        private int id;
        private int commenteur_id;
        private int blog_id;
        private String contenu;
        private String statut;

        // Constructeur

        public Commentaire() {
        }

        public Commentaire(int id, int commenteur_id, int blog_id, String contenu, String statut) {
            this.id = id;
            this.commenteur_id = commenteur_id;
            this.blog_id = blog_id;
            this.contenu = contenu;
            this.statut = statut;
        }

        //getter and setter

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCommenteur_id() {
            return commenteur_id;
        }

        public void setCommenteur_id(int commenteur_id) {
            this.commenteur_id = commenteur_id;
        }

        public int getBlog_id() {
            return blog_id;
        }

        public void setBlog_id(int blog_id) {
            this.blog_id = blog_id;
        }

        public String getContenu() {
            return contenu;
        }

        public void setContenu(String contenu) {
            this.contenu = contenu;
        }

        public String getStatut() {
            return statut;
        }

        public void setStatut(String statut) {
            this.statut = statut;
        }
    }


