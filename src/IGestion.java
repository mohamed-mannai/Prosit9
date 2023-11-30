public interface IGestion<Employe> {

    public void ajouterEmploye(Employe e);
    public boolean rechercherEmploye(String nom);
    public boolean rechercherEmploye(Employe e);
    public void supprimerEmploye(Employe e);
    public void displayEmploye();
    public void trierEmployeParId();
    public void trierEmployeParNomDépartementEtGrade();
}
