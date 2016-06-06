package com.flyWeight;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-3
 */
public class FlyWeightTest1 {
    public static void main(String[] args) {

        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");

        System.out.println(chess1);
        System.out.println(chess2);

        //增加外部状态的处理
        System.out.println("增加外部状态的处理");
        chess1.display(new Chessboard(10,10));
        chess2.display(new Chessboard(100,100));

    }
}
