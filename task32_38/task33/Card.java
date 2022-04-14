package task32_38.task33;

import java.io.Serializable;

public class Card implements Serializable {
    public transient String color;
    private double width;
    private double height;
    private double area;

    public static int i = 1;

    Card(String color, double height, double width){
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public void getSizeOfCard(){
        System.out.println("Card's size is:" +
                "\n\twidth = " + width +
                "\n\theight = " + height +
                "\n\tarea = " + area);
    }

    public void getArea(){
        area = width * height;
    }
}
