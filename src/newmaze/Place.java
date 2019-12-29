/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmaze;

/**
 *
 * @author Michail Sitmalidis
 */
public class Place {
    
    private int x;
    private int y;
    private String mark;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getMark() {
        return mark;
    }
    
    
}
