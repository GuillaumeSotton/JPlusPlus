import java.util.*;
import java.awt.*;


public class Grille {

  //Attributs
  private int nbLignes;
  private int nbCol;
  private char [][] grille;


  //Constructeur
  public Grille(int l, int c)
  {
    nbLignes=l;
    nbCol=c;
    grille = new char [nbLignes][nbCol];

    for (int i=0;i<nbLignes;i++)
    {
      for (int j=0;j<nbCol;j++)
      {
        grille[i][j]= '-';
      }
    }
  }

//FONCTION AFFICHAGE DE LA GRILLE
  public void afficher()
  {
    System.out.println("\n");

    for (int i=0;i<nbLignes;i++)
    {
      for (int j=0;j<nbCol;j++)
      {
        System.out.print(" | " + grille[i][j]);
      }
        System.out.println(" | ");
    }
    System.out.println();
  }


//FONCTION PLACEMENT DES METABOLITES , ENZYMES ET LIPIDES
  public void placerEnzymes(int l,int c,char t)
  {
    l=l-1;
    c=c-1;

    //On regarde si on se trouve dans la grille
    if (l<0 || c<0 || l>nbLignes || c>nbCol)
    {
      System.out.print("Vous vous êtes trompés , erreur de placement !");
      return;
    }

    //On regarde si les coordonnées sont égales aux motifs '-'
    if (grille[l][c]=='-')
    {
      grille[l][c]=t;
    }

    else
    {
      Random r = new Random();
      int valeur = 1 + r.nextInt(16 - 1);
      int valeur1 = 5+r.nextInt(12-5);
      placerEnzymes(valeur1,valeur,'M');
      //System.out.println("Vous vous êtes trompés , cette zone est prise !");
    }
  }

  //PLACEMENT DES ENZYMES ET METABOLITES
      for (int i=1;i<=15;i=i+2)
      {
        plateau.placerEnzymes(1,i,'E');
        plateau.placerEnzymes(15,i,'E');
      }

      for (int k=2;k<=14;k=k+2)
      {
        for (int l=2;l<5;l++)
        {
        plateau.placerEnzymes(l,k,'L');
        }
        for (int m=12;m<=14;m++)
        {
        plateau.placerEnzymes(m,k,'L');
        }
    }

  //PLACEMENT ALEATOIRE DES METABOLITES
        Random r = new Random();
        int valeur = 1 + r.nextInt(16 - 1);
        int valeur1 = 5+r.nextInt(12-5);
        for (int j=0;j<10;j++)
        {
        plateau.placerEnzymes(valeur1,valeur,'M');
        plateau.placerEnzymes(valeur1,valeur,'M');
        plateau.placerEnzymes(valeur1,valeur,'M');
        plateau.placerEnzymes(valeur1,valeur,'M');
        }
        //AFFICHAGE DE LA GRILLE
          plateau.afficher();
      }



}
