public class Main {
    public static void main(String[] args){
        SocieteArrayList s=new SocieteArrayList();
        Employe e1 =new Employe(3,"mohamed amine","mannai","IJK",1);
        Employe e2 =new Employe(2,"mohamed","abidi","kef",20);
        Employe e3 =new Employe(1,"ahmed","salmawi","borej",-20);
        Employe e4 =new Employe(4,"omar","hasnaoui","g",5);
        s.ajouterEmploye(e1);
        s.ajouterEmploye(e2);
        s.ajouterEmploye(e3);
        s.ajouterEmploye(e4);
        System.out.println(s.rechercherEmploye("hasnaoui"));
        s.displayEmploye();
        s.trierEmployeParId();



    }
}
