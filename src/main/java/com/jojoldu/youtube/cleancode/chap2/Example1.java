package com.jojoldu.youtube.cleancode.chap2;

import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2018-12-12
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class Example1 {

    @SuppressWarnings("Duplicates")
    public Player getPlayer(List<Player> list){
        Player mp = null;
        int max = 0;

        for(Player player : list) {
            int playerPointSum = player.getPoint();
            if(playerPointSum > max){
                mp = player;
                max = playerPointSum;
            }
        }

        return mp;
    }


    @SuppressWarnings("Duplicates")
    public Player getWinner(List<Player> players){
        Player highestPlayer = null;
        int highestPoint = 0;

        for(Player player : players) {
            int playerPointSum = player.getPoint();
            if(playerPointSum > highestPoint){
                highestPlayer = player;
                highestPoint = playerPointSum;
            }
        }

        return highestPlayer;
    }

    public static class Player {

        public int getPoint() {
            return 0;
        }
    }
}
