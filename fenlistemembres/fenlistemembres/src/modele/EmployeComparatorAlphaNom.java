package modele;

import java.util.Comparator;

class EmployeComparatorAlphaNom implements java.util.Comparator<Employe> {
    @Override
    public int compare(Employe a, Employe b) {
        return a.getNom().compareTo(b.getNom());
    }
}
