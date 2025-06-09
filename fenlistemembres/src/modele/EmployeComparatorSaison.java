package modele;

class EmployeComparatorSaison implements java.util.Comparator<Employe> {
    @Override
    public int compare(Employe a, Employe b) {
        return a.getSaison().compareTo(b.getSaison());
    }
}
