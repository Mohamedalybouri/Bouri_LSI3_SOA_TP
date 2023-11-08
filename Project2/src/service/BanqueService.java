package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService {
	 List<Compte> comptes = new ArrayList<Compte>();
	    public double conversion(double montant) {
	        return 3.3*montant;
	    }
	    public Compte getCompte(int code) {
	        return new Compte(code, 0, new Date());
	    }
	    public List<Compte> getComptes(){
	        Compte c1 = new Compte(0, 0, new Date());
	        Compte c2 = new Compte(1, 0, new Date());
	        comptes.add(c1);
	        comptes.add(c2);
	        return comptes;
	    }
}
