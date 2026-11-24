import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList
        implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private final ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (nom.equalsIgnoreCase(employe.getNom())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> comparateur =
                Comparator.comparing(Employe::getNomDepartement)
                        .thenComparingInt(Employe::getGrade)
                        .thenComparing(Employe::getNom);

        Collections.sort(employes, comparateur);
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();

        for (Employe employe : employes) {
            if (nomDepartement.equalsIgnoreCase(employe.getNomDepartement())) {
                resultat.add(employe);
            }
        }

        return resultat;
    }
}