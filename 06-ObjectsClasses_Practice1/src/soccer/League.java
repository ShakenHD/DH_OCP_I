/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

/**
 *
 * @author danho
 */
public class League {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.playerName = "Bob";
        
        Player player2 = new Player();
        player2.playerName = "Rob";
        
        Player player3 = new Player();
        player3.playerName = "Gob";
        
        Player[] thePlayers = {player1, player2, player3};
        
        Team team1 = new Team();
        team1.teamName = "Blues";
        team1.playerArray = thePlayers;
        
        player1.playerName = "Bobby Jenkins";
        
        
        Team team2 = new Team();
        team2.teamName = "Reds";
        team2.playerArray = new Player[3];
        
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Reddings";
        
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Ruby Rubelite";
        
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Randy Rabbit";
        
        
        for (Player thePlayer: team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }
        
        for (Player thePlayer: team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }
        
        
        
        
        
    }
}
