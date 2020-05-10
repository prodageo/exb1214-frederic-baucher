public class Principal
{
	public static void main(String[]args)
    {
		// commande > java Principal mot
		// decomposition de la commande :
		// - nom de la commande : java
		// - argument 1 : fichier "compiled" de bytecode chargee : Main.class
		// - argument 2 : parametre 1 du programme Main.class
		// rappel : la commande java charge en RAM le bytecode de la classe qui va utilise la CPU pour s'executer.
		
		// exemple de palindrome en Marocain : TAKHKAT , tarhrat, ...
		
		if ( args.length == 1 )
		{
			String motAverifier = args[0] ; // args[0] correspond a l'argument 2 de la commande java
		
			boolean isPalindrome = Palindrome.is_palindrome(motAverifier) ;
		
			System.out.println("----------------------------------------------------");
			System.out.println("Input : " + motAverifier + " >>> Output : " + isPalindrome );		
			System.out.println("----------------------------------------------------");		
		}
		else
		{
			System.out.println("Avertissement : Il faut fournir un mot pour que le programme fonctionne !" );		
		}
	}

}
