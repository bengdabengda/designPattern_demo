/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Test
 * Author:   sun
 * Date:     2019/3/8 15:42
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/8 15:42           v1.0.0
 */
package com.sun.demo.xiangyuan;

import java.util.HashMap;

/**
 * 享元模式
 *
 * @author sun
 * @create 2019/3/8
 * @since v1.0.0
 */
public class Test {
    public static void main(String[] args) {
        PieceFactory pieceFactory = PieceFactory.getPieceFactory();
        Piece w1,w2,w3,b1,b2;
        w1 = pieceFactory.createPiece("w");
        w2 = pieceFactory.createPiece("w");
        w3 = pieceFactory.createPiece("w");
        b1 = pieceFactory.createPiece("b");
        b2 = pieceFactory.createPiece("b");
        System.out.println(w1 == w2);
        System.out.println(b1 == b2);
        w1.display(new Position(2,3));
        w2.display(new Position(5,1));
        w3.display(new Position(3,7));
        b1.display(new Position(2,4));
        b2.display(new Position(6,3));
    }
}

/**
 * Position：位置，非共享享元对象
 */
class Position{
    private int x;
    private int y;

    public Position(int x, int y) {
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

/**
 * Piece：棋子类,抽象享元类
 */
abstract class Piece{
    public abstract String getColor();

    public void display(Position position){
        System.out.println("位置为(" + position.getX() + "," + position.getY() + ")的" + getColor() + "棋子");
    }
}

/**
 * WritePiece：白色棋子,具体享元类
 */
class WritePiece extends Piece{
    public WritePiece() {
        System.out.println("创建白色棋子");
    }

    public String getColor() {
        return "白色";
    }
}

/**
 * BlackPiece：黑色棋子,具体享元类
 */
class BlackPiece extends Piece{
    public BlackPiece() {
        System.out.println("创建黑色棋子");
    }

    public String getColor() {
        return "黑色";
    }
}

/**
* Size：大小，非共享享元类
*/

/**
 * PieceFactory：享元工厂类
 */
class PieceFactory{
    private static PieceFactory pieceFactory = new PieceFactory();
    private static HashMap<String,Piece> map = new HashMap<>();

    private PieceFactory(){

    }

    public static PieceFactory getPieceFactory(){
        return pieceFactory;
    }

    public Piece createPiece(String color){
        System.out.println("生成一个棋子");
        if(map.containsKey(color)){
            return map.get(color);
        } else{
            Piece piece;
            if(color.equalsIgnoreCase("w")){
                piece = new WritePiece();
            } else if (color.equalsIgnoreCase("b")){
                piece = new BlackPiece();
            }else{
               return null;
            }
            map.put(color,piece);
            return piece;
        }
    }
}