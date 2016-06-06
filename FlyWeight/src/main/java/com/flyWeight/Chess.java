package com.flyWeight;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-3
 */
public class Chess implements ChessFlyWeight{

    private String color;
    public void setCorlor(String corlor) {
        this.color = corlor;

    }

    public String getColor() {
        return color;
    }

    public Chess(String color) {
        this.color = color;
    }

    public void display(Chessboard chessboard) {
        System.out.println("棋子颜色-->"+color);
        System.out.println("棋子位置-->X:"+chessboard.getX());
        System.out.println("棋子位置-->Y:"+chessboard.getY());
    }
}
