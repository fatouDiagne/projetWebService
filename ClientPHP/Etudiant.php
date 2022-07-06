<?php

    
        
        $clientSOAP = new SoapClient("http://localhost:8580/EtudiantWS?wsdl");
        $etudiant = $clientSOAP->__soapCall("GetEudiant",array());
    
 
   


if (isset($_POST['modif'])) {
    $clientSOAP = new SoapClient("http://localhost:8580/EtudiantWS?wsdl");
    $etudiant = $clientSOAP->__soapCall("ModifierEtudiant",array());
}
if (isset($_POST['sup'])) {
    $clientSOAP = new SoapClient("http://localhost:8580/EtudiantWS?wsdl");
    $etudiant = $clientSOAP->__soapCall("SupprimerEtudiant",array());
}

?>
<html>
    <body>
        
      
     <?php if (isset($etudiant)) {?>
        <table border= "1">
            <tr>
                <th>ID</th>
                <th>NOM</th>
                <th>PRENOM</th>
                <th>AJOUTER</th>
                <th>Modifier</th>
                <th>Supprimer</th>
            </tr>
            <?php  foreach($etudiant->return as $et) ?>
            <tr>
                <td> <?php echo($et->id)?></td>
                <td> <?php echo($et->nom)?></td>
                <td><?php echo($et->prenom)?></td>
                <td><a href="Ajouter.php">Ajouter</a></td>
                <td><a href="Modifier.php">Modifier</a></td>
                <td><input name="sup" type="submit" value ="supprimer"></td>
            </tr>

            <?php ?>
        </table>
            
     <?php   } ?>
    </body>
</html>