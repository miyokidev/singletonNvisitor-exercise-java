/*
 * PROJET: Dans ce projet nous allons voir 2 types de design patterns (Singleton et Visitor).
 * 
 * Design Patterns:
 * 
 * Vous l'avez donc compris il existe plusieurs types de design pattern mais qu'est-ce qu'un design pattern?
 * 
 * Le design pattern ou patron de conception en français (il est mieux de connaître les termes anglais), est une solution générale et réutilisable à un problème
 * courant dans un contexte donné de la conception logicielle. Ce n'est pas une conception finie qui peut être transformée directement en code source ou machine.
 * Il s'agit plutôt d'une description ou d'un modlèle sur la façon de résoudre un problème qui peut être utilisé dans de nombreuses situations différentes.
 * Les design patterns représentent les meilleures pratiques utilisées par les développeurs de logiciels orientés objet experimentés. Ils sont des
 * solutions aux problèmes généraux auxquels les développeurs de logiciels ont été confrontés lors du développement de logiciels. Ces solutions ont été obtenues par
 * différents essais et erreurs par de nombreux développeurs de logiciels sur une période assez longue.
 * 
 * Il existe 23 design patterns qui peuvent être classés en trois catégories: Creational, Structural et Behavioral patterns.
 * 
 * Creational Patterns (EXEMPLE: SINGLETON): Ces design patterns offrent un moyen de créer des objets tout en masquant la logique de création, plutôt que d'instancier
 *  des objets directement à l'aide d'un nouvel opérateur. Cela donne au programme plus de flexibilité pour décider quels objets doivent être créés pour un cas 
 *  d'utilisation donné.
 * 
 * Structural Patterns: Ces design patterns concernent la composition des classes et des objets. Le concept d'héritage permet de composer des interfaces et de définir
 * des manières de composer des objets pour obtenir de nouvelles fonctionnalités.
 * 
 * Behavioral Paterns (EXEMPLE: VISITOR): Ces design patterns concernent spécifiquement la communication entre les objets.
 * 
 * Les design patterns que nous allons voir:
 * 
 * Singleton: Vous permet de vous assurer qu'une classe n'a qu'une seule instance, tout en fournissant un point d'accès global à cette instance.
 * 
 * Visitor: Permmet de séparer les algorithmes des objets sur lesquels ils opèrent.
 * 
 * sources sur les design patterns:
 * https://refactoring.guru/design-patterns/csharp
 * https://www.tutorialspoint.com/design_pattern/design_pattern_overview.htm
 * 
 * 
 * Class Generic (non vu finalement dans cet exercice):
 * Une classe générique est une classe qui peut être réutilisée pour des objets de différents types.
 * 
 * sources:
 * http://blog.paumard.org/cours/java-api/chap02-generiques-premier-exemple.html
 * 
 * 
 */
public class Program {

	public static void main(String[] args) {
		/*
		 * Pour cette exercice on va prendre en exemple un magasin d'éléctronique où l'on prend un chariot (notre liste d'éléments) et on voudra calculer le prix total 
		 * des éléments qu'on a dans le chariot à l'aide d'une classe qui calculera (une classe utilisant le design pattern singleton) on aura besoin de l'aide du design
		 * pattern visitor pour visiter chaque objet.
		 */
		
		// On crée un paniers
		ShoppingCartClient client = new ShoppingCartClient();
		
		// On y ajoute des éléments
		client.addItem(new Mouse("121",101));
		client.addItem(new Mouse("212", 60));
		client.addItem(new Keyboard("111",120));
		client.addItem(new Keyboard("233",200));
		
		// On veut afficher le total de chaque de notre panier
		client.printTotal();
	}

}
