/*
Implementing the comparator interface

Input format
5           //Number of players
amy 100     //Name and scores of the Players
david 100
heraldo 50
aakansha 75
aleksa 150

Output: should be sorted list of players,
        if two players have same score they
        should be sorted by name alphabetically.
*/

import java.util.*;

class Checker implements Comparator<Player>{
    String name;
    int score;

    public int compare(Player a, Player b){
        if(a.score == b.score){
            return a.name.compareTo(b.name);
        }
        return b.score-a.score;
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Comparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
