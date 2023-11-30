import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public  class SocieteArrayList implements IGestion<Employe>{

    List<Employe> employees= new ArrayList<>();

    public void ajouterEmploye(Employe e){
        employees.add(e);
    }

    public boolean rechercherEmploye(String nom){

        for(Employe e :employees)
            if(e.getNom().equals(nom)){
                return true;
            }
        return false;



    }
    public boolean rechercherEmploye(Employe e){
        return  employees.contains(e);
    }

    public void supprimerEmploye(Employe e){

        employees.remove(e);

    }
    public void displayEmploye(){

        System.out.println(employees);

    }
    public void trierEmployeParId(){
        Collections.sort(employees,Employe::compareTo);
        System.out.println(employees);


    }
    Comparator<Employe> nomDepartementComparator=new Comparator<Employe>() {
        @Override
        public int compare(Employe e1, Employe e2) {
            return e1.getNom().compareTo(e2.getNom());
        }
    };
    Comparator<Employe> GradeComparator=new Comparator<Employe>(){
        @Override
        public int compare(Employe e1,Employe e2){
            return e1.getGrade()-e2.getGrade();
        }
    };
    public void trierEmployeParNomDépartementEtGrade(){

        Collections.sort(employees,nomDepartementComparator);
        System.out.println("Liste triee selon le nomDepartement"+employees);

        Collections.sort(employees,nomDepartementComparator.thenComparing(GradeComparator));
        System.out.println("Liste triee:"+employees);


    }


}
