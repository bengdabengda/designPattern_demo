package com.sun.demo.jianzaozhe;

/**
 * 产品对象，由多个部件组成
 */
public class Person {
    private String head;
    private String body;
    private String hand;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "一个拥有" + head +"，" + body +"," + hand + "的人";
    }
}
