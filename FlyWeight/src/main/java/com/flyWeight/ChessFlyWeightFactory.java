package com.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @authoor lengchuan
 * @date 16-6-3
 */
public class ChessFlyWeightFactory {

    //享元池
    private static Map<String, ChessFlyWeight> chessFlyWeightMap = new HashMap<String, ChessFlyWeight>();

    public static ChessFlyWeight getChess(String color) {
        if (chessFlyWeightMap.get(color) != null) {
            return chessFlyWeightMap.get(color);
        } else {

            ChessFlyWeight chessFlyWeight = new Chess(color);
            chessFlyWeightMap.put(color,chessFlyWeight);
            return chessFlyWeight;

        }

    }

}
