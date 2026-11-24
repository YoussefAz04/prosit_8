public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        societe.ajouterEmploye(new Employe(12, "Trabelsi", "Ali", "IT", 2));
        societe.ajouterEmploye(new Employe(8, "Ben Salah", "Ines", "IT", 2));
        societe.ajouterEmploye(new Employe(3, "Mansouri", "Sarra", "Finance", 4));
        societe.ajouterEmploye(new Employe(15, "Khelifi", "Amine", "IT", 1));

        System.out.println("Tri par identifiant");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTri par département, grade, puis nom");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\nEmployés du département IT");
        for (Employe employe : societe.rechercherParDepartement("IT")) {
            System.out.println(employe);
        }
    }
}