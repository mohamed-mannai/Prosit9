public class Employe implements idComparable<Employe> {

    private int identifiant,grade;
    private String nom,prenom,nomDepartement;

    public Employe(){}
    public Employe(int identifiant,String prenom,String nom,String nomDepartement,int grade){

        this.identifiant = identifiant;
        this.prenom  = prenom;
        this.nom = nom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;

    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public boolean equals(Object obj){
        if(this==obj)return true;
        if(null==obj)return false;

        if(obj instanceof Employe employe){
            return this.nom.equals(nom)&&this.identifiant==identifiant;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                '}';
    }

    public int compareTo(Employe e){
        return  this.identifiant - e.identifiant;
    }


}
