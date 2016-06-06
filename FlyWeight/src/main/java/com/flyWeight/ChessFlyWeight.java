package com.flyWeight;

/**
 * 享元类
 * 棋子
 * @authoor lengchuan
 * @date 16-6-3
 */
public interface ChessFlyWeight {
    void setCorlor(String corlor);
    String getColor();
    void  display(Chessboard chessboard);
}
