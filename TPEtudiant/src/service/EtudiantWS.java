package service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import metier.BDD;
import metier.Etudiant;


@WebService(name="EtudiantService")
public class EtudiantWS {

	private BDD db = new BDD();
	private int ok;

@WebMethod(operationName="AjouterEtudiant")
	public int add(String nom, String prenom) {
		String sql = "INSERT INTO etudiant VALUES(NULL, ?, ?)";
		try{
			db.initPrepar(sql);
			db.getPstm().setString(1, nom);
			db.getPstm().setString(2, prenom);

			ok = db.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return ok;
	}
@WebMethod(operationName ="GetEudiant")
	public List<Etudiant> getEtudiants()  {
	
     try {
    	 List<Etudiant> etudiants= new ArrayList<>();

         String sql= "select id,nom,prenom from etudiant ";
    	 	db.initPrepar(sql);
    	 	ResultSet res= db.executeQuery();
    	     while (res.next())
    	     {
    	         etudiants.add(new Etudiant(res.getInt("id"),res.getString("nom"),res.getString("prenom")));
    	     }
    	     return etudiants;
       
     } catch (Exception E) {
         System.out.println("Erreur");
     }
     return null;
}

@WebMethod(operationName="ModifierEtudiant")
public int update(Etudiant e) {
	String sql = "UPDATE etudiant SET id = ? where nom = ?";
	try{
		db.initPrepar(sql);
		db.getPstm().setInt(1,  e.getId());
		db.getPstm().setString(2, e.getNom());

		ok = db.executeUpdate();
	}catch(Exception ex){
		ex.printStackTrace();
	}
	return ok;
}

@WebMethod(operationName="SupprimerEtudiant")
public int delete(int id) {
	String sql = "DELETE FROM etudiant where id = ?";
	try{
		db.initPrepar(sql);
		db.getPstm().setInt(1, id);

		ok = db.executeUpdate();
	}catch(Exception ex){
			ex.printStackTrace();
		}
	return ok;
}


}
