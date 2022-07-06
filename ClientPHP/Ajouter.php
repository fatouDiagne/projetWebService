<?php

    
   

if (isset($_POST['ajout'])) {
    $clientSOAP = new SoapClient("http://localhost:8580/EtudiantWS?wsdl");
  
    $etudiant = $clientSOAP->__soapCall("AjouterEtudiant",array());
}


?>
<form action="Ajouter.php" method="post">
    ID<input type="text" >
    PRENOM:<input type="text" >
    NOM:<input type="text" >
    <input name="ajout" type="submit" value ="AJOUTER">

</form>