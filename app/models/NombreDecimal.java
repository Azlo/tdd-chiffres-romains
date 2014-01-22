package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }

    public String en_romain() {
    	return en_romain_unites(valeur);
    }

    public static String[] table_unites = {
        "","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII",
        "XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV"
    };

    public String en_romain_unites(int n) {
        return table_unites[n];
    }

}
