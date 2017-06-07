/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonGame;

import java.util.Scanner;


public class NewGame {
    String username;
    Team pokemonTeam;
    Team opponent = new Team(1);
    
    public NewGame(String username){
        this.username = username;
    }
    
    public Team chooseTeam(){
        System.out.println("1 for Fire team | 2 for Water team | 3 for Grass team");
        Scanner sc = new Scanner(System.in);
        int team = sc.nextInt();
        pokemonTeam = new Team(team);
        return pokemonTeam;
    }
    
    public void fight(){
        System.out.println("Your team is: " + pokemonTeam.getP1() + " " + pokemonTeam.getP2() + " " + pokemonTeam.getP3());
        
        System.out.println("Get ready to battle\nYour opponent is: Trainer Joey");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Fist battle!\nWhich pokemon do you choose?");
        int p1 = sc.nextInt();
        String pokemon1 = pokePick(p1);
        System.out.println( username +" chooses " + pokemon1 );
        System.out.println( "Joey chooses " + opponent.getP1());
        battle(opponent.getP1(),pokemon1);
        
    }
    
    public String pokePick(int c){
         switch(c){
            case 1 : return pokemonTeam.getP1();
            case 2 : return pokemonTeam.getP2();
            case 3 : return pokemonTeam.getP3();
            default : return pokemonTeam.getP1();
        }
    }
    
   public void battle(String o,String p){
        int oHealth = 100;
        int pHealth = 100;
        System.out.println("Choose attack: 1 for Tackle | 2 for Trash");
        
    }
    
}
