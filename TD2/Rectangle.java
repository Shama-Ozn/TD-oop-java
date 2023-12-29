public class Rectangle {
    private int height;
    private int width;
//_______constructors________________________    
    public Rectangle()
    {
        this.height=0;
        this.width=0;
    }
    public Rectangle ( int height, int width)
    {
        this.height=(height>0)? height: 0;// if the condition (height>0) is true ? use the entred value , else use this value height:0 
        this.width=(width>0)? width: 0;
    }
    public Rectangle(Rectangle rectangle)
    {
        this(rectangle.height,rectangle.width);
    }
//____________setters_________________
public void setHeight(int height) {
    this.height = (height>0)? height: 0;
}
public void setWidth(int width) {
    this.width = (width>0)? width: 0;
}
//_____________getters________________
public int getHeight() {
    return height;
}
public int getWidth() {
    return width;
}
//_______________methods________________
public int perimetre(int height, int width)
{
    return 2*(height+width);
}
public int aire(int height, int width)
{
    return height*width;
}
public boolean isCarre(int height, int width)
{
    return height==width;//no need to use the if close if there's just one condition and its else 
}
//____________to String()________________
public String toString()
{
    return "height : "+height+" width : "+width+ " perimetre : "+ perimetre(height, width) +" aire : "+aire(height, width)+" isCarre : "+isCarre(height, width);
}
//________main to test _______________
static  public void main(String [] args)
{
    Rectangle testRectangle = new Rectangle();
    System.out.println(testRectangle.toString());
}
}
