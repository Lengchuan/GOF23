package com.flyWeight;

/**
 * 棋盘
 * 外部状态
 * @authoor lengchuan
 * @date 16-6-3
 */
public class Chessboard {

    private int x,y;

    public Chessboard(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
