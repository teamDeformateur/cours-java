/**
 * 
 */
package edu.formation.heritagesimple;

/**
 * @author Seme
 *
 */
public class MainHeritageSimple
{
    public static void main(String[] args)
    {
        Personne p1 = new Personne("Ladalle", "Roger", "M.");
        Personne p2 = new Personne("Dupont", "Caroline", "Mlle");

        Etudiant e1 = new Etudiant("Dupuis", "Pascal", "M.");
        Etudiant e2 = new Etudiant("Edwige", "Ilant", "Mme");
    }
}