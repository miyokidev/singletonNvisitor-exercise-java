/*
 * PROJET: Dans ce projet nous allons voir 2 types de design patterns (Singleton et Visitor).
 * 
 * Design Patterns:
 * 
 * Vous l'avez donc compris il existe plusieurs types de design pattern mais qu'est-ce qu'un design pattern?
 * 
 * Le design pattern ou patron de conception en fran�ais (il est mieux de conna�tre les termes anglais), est une solution g�n�rale et r�utilisable � un probl�me
 * courant dans un contexte donn� de la conception logicielle. Ce n'est pas une conception finie qui peut �tre transform�e directement en code source ou machine.
 * Il s'agit plut�t d'une description ou d'un modl�le sur la fa�on de r�soudre un probl�me qui peut �tre utilis� dans de nombreuses situations diff�rentes.
 * Les design patterns repr�sentent les meilleures pratiques utilis�es par les d�veloppeurs de logiciels orient�s objet experiment�s. Ils sont des
 * solutions aux probl�mes g�n�raux auxquels les d�veloppeurs de logiciels ont �t� confront�s lors du d�veloppement de logiciels. Ces solutions ont �t� obtenues par
 * diff�rents essais et erreurs par de nombreux d�veloppeurs de logiciels sur une p�riode assez longue.
 * 
 * Il existe 23 design patterns qui peuvent �tre class�s en trois cat�gories: Creational, Structural et Behavioral patterns.
 * 
 * Creational Patterns (EXEMPLE: SINGLETON): Ces design patterns offrent un moyen de cr�er des objets tout en masquant la logique de cr�ation, plut�t que d'instancier
 *  des objets directement � l'aide d'un nouvel op�rateur. Cela donne au programme plus de flexibilit� pour d�cider quels objets doivent �tre cr��s pour un cas 
 *  d'utilisation donn�.
 * 
 * Structural Patterns: Ces design patterns concernent la composition des classes et des objets. Le concept d'h�ritage permet de composer des interfaces et de d�finir
 * des mani�res de composer des objets pour obtenir de nouvelles fonctionnalit�s.
 * 
 * Behavioral Paterns (EXEMPLE: VISITOR): Ces design patterns concernent sp�cifiquement la communication entre les objets.
 * 
 * Les design patterns que nous allons voir:
 * 
 * Singleton: Vous permet de vous assurer qu'une classe n'a qu'une seule instance, tout en fournissant un point d'acc�s global � cette instance.
 * 
 * Visitor: Permmet de s�parer les algorithmes des objets sur lesquels ils op�rent.
 * 
 * sources sur les design patterns:
 * https://refactoring.guru/design-patterns/csharp
 * https://www.tutorialspoint.com/design_pattern/design_pattern_overview.htm
 * 
 * 
 * Class Generic (non vu finalement dans cet exercice):
 * Une classe g�n�rique est une classe qui peut �tre r�utilis�e pour des objets de diff�rents types.
 * 
 * sources:
 * http://blog.paumard.org/cours/java-api/chap02-generiques-premier-exemple.html
 * 
 * 
 */
public class Program {

	public static void main(String[] args) {
		/*
		 * Pour cette exercice on va prendre en exemple un magasin d'�l�ctronique o� l'on prend un chariot (notre liste d'�l�ments) et on voudra calculer le prix total 
		 * des �l�ments qu'on a dans le chariot � l'aide d'une classe qui calculera (une classe utilisant le design pattern singleton) on aura besoin de l'aide du design
		 * pattern visitor pour visiter chaque objet.
		 */
		
		// On cr�e un paniers
		ShoppingCartClient client = new ShoppingCartClient();
		
		// On y ajoute des �l�ments
		client.addItem(new Mouse("121",101));
		client.addItem(new Mouse("212", 60));
		client.addItem(new Keyboard("111",120));
		client.addItem(new Keyboard("233",200));
		
		// On veut afficher le total de chaque de notre panier
		client.printTotal();
	}

}
