/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonGame;

/**
 *
 * @author sondr
 */
public class Team {
     int teamChoice;
     String[][] teams = {{"Charmander","Ponyta","Magmar"},{"Squirtle","Horsea","Tentacool"},{"Bulbasaur","Oddish","Bellsprout"}};
     String[] team;
     int health;
     
    public Team(int c){
        this.teamChoice = c;
        
        switch(teamChoice){
         
            case 1 : team = teams[1];
            case 2 : team = teams[2];
            case 3 : team = teams[3];
        
         }
  
  }
    
    
   public String getP1(){
        return team[0];
    }
   public String getP2(){
        return team[0];
    }
   public String getP3(){
        return team[0];
    }
   
   public void resetHealth(){
       health = 100;
   }
   public void attackHealth(int a){
       health =- a;
   }
   public int getHealth(){
       return health;
   }
}
