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
    	if (valeur==1) {
    		return "I";
    	} else if (valeur==2) {
    		return "II";
    	} else if (valeur==3) {
    		return "III";
    	} else if (valeur==4) {
    		return "IV";
    	}
    	else {
    		return "";
    	}
    }
}
