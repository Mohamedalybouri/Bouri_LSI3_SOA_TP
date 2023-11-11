package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService
public class BanqueService {
    List<Compte> comptes = new ArrayList<Compte>();
    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        return 3.3*montant;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code")int code) {
        return new Compte(code, 0, new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        Compte c1 = new Compte(0, 0, new Date());
        Compte c2 = new Compte(1, 0, new Date());
        comptes.add(c1);
        comptes.add(c2);
        return comptes;
    }
}
