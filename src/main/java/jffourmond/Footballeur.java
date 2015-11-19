package jffourmond;

import java.util.List;
import java.util.Optional;

class Footballeur {
  
  String nom;
  Integer nbButs;
  
  Footballeur(String nom, Integer nbButs){
	  this.nom = nom;
	  this.nbButs = nbButs;
  }
  
  static Optional<Footballeur> getMeilleurButeur(List<Footballeur> footballeurs){
    return footballeurs.stream().
    		max((f1, f2) -> f1.nbButs - f2.nbButs);
  }
}
