package modele;

import java.util.Comparator;

class EmployeComparatorCours implements java.util.Comparator<Employe> {
    @Override
    public int compare(Employe a, Employe b) {
        return a.getCours().compareTo(b.getCours());
    }
}
