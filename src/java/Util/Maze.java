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

    private ArrayList<int[][]> path = new ArrayList();

    public void resolveLabirinto() {
        int X = startX;
        int Y = startY;
        converteLabirinto();
        if (andaLabirinto(X, Y)){


        }
    }

    public boolean andaLabirinto(int X, int Y) {
        if (X == endX && X == endY){
            return true;
        }
        //norte
        if (mazeConcept[X + 1][Y] && true) {
            path.add(new int[X + 1][Y]);
            andaLabirinto(X + 1, Y );
        }
        //sul
        if (mazeConcept[X - 1][Y] && true) {
            path.add(new int[X - 1][Y]);
            andaLabirinto(X - 1, Y );
        }
        //leste
        if (mazeConcept[X][Y + 1] && true) {
            path.add(new int[X][Y + 1]);
            andaLabirinto(X, Y + 1);
        }
        //oeste
        if (mazeConcept[X][Y - 1] && true) {
            path.add(new int[X][Y - 1]);
            andaLabirinto(X, Y - 1);
        }
        return false;
    }
}

