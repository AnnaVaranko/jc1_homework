package Task32_38.Task33;

public class Card {
    private String color;
    private double width;
    private double height;
    private double area;

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
