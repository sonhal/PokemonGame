
package pokemonGame;

import java.util.Scanner;
public class PokemonGame {
    
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Menu\ntype 1 to Quit | 2 to play a new Game | 3 to view Scoreboard");
        int choice = sc.nextInt();
        return choice;
    }
    
    public static void menuHandler(int choice){
        switch(choice){
            
            case 2 : runGame();
            case 3 : break;
            case 1 : break;
        }
    }
    
    public static void runGame(){
        
        
    }
    
    
    
    
    public static void main(String[] args){
        String username;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Welcome to the Pokemon game \nWhat is your name?");
        username = sc.nextLine();
        System.out.print("Welcome " + username);
        
        
    }
    
    
    
    
    
}
