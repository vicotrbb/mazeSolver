package Util;

import java.util.ArrayList;

public class Maze {

    private char[][] maze = new char[12][12];
    private boolean[][] mazeConcept = new boolean[12][12];
    private int startY, startX;
    private int endY, endX;

    public char[][] getMaze() {
        return maze;
    }

    public void setMaze(char[][] maze) {
        this.maze = maze;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void desenhaLabirinto() {
        for (int y = 1; y < 12; y++) {
            for (int x = 1; x < 12; x++) {
                System.out.print(maze[y][x]);
            }
            System.out.println("");
        }
    }

    public void converteLabirinto() {
        for (int y = 1; y < 12; y++) {
            for (int x = 1; x < 12; x++) {
                mazeConcept[x][y] = maze[y][x] != '*';
            }
        }
    }

    public void resolveLabirinto() {
        int X = startX;
        int Y = startY;
        ArrayList<int[][]> path = new ArrayList();
        converteLabirinto();
        
    }
    
    public boolean andaLabirinto(int X, int Y){
        //norte
        if (mazeConcept[X][Y] && true) {
            
        }
        //sul
        if (mazeConcept[X][Y] && true) {
            
        }
        //leste
        if (mazeConcept[X][Y] && true) {
            
        }
        //oeste
        if (mazeConcept[X][Y] && true) {
            
        }
       return true;
    }
}

