package zad5;

public enum Months {
    JAN,
    FRB,
    MAR,
    APR,
    MAY,
    JUNE,
    JULY,
    AUG,
    SEP,
    OCT,
    NOV,
    DEC
}
class Month{
    Months m;
    @Override
    public String toString() {
        switch (m){
            case JAN -> {return "January";}
            case FRB -> {return "February";}
            case MAR -> {return "March";}
            case APR -> {return "April";}
            case MAY -> {return "May";}
            case JUNE -> {return "June";}
            case JULY -> {return "July";}
            case AUG -> {return "August";}
            case SEP -> {return "September";}
            case OCT -> {return "October";}
            case NOV -> {return "November";}
            case DEC -> {return "December";}
        }
        return null;
    }
}
