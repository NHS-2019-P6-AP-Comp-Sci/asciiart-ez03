/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 
public class ASCIIArt {
	public static void lantern() {
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println("  |  |");
	}
	public static void house() {
		System.out.println(" [  O ]"); 
	}
	public static void tower() {
		System.out.println(" |    |");
	}
	public static void shore() {
		System.out.println("-----");
	}
	public static void main (String [] args) {
		System.out.println();
		lantern();
		house(); 
		house(); 
		tower();
		tower();
		tower();
		tower(); 
		System.out.print("      "); shore(); 
		System.out.print("\t   "); shore();
		System.out.print("\t\t"); shore();
		System.out.println();
		System.out.println("   ******************\n   AP CS lighthouse!!\n   ******************");
	}
}