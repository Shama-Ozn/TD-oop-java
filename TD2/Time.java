public class Time {
    private int hour ;//0-23
    private int minute ;//0-59
    private int second ; //0-59
//________constructors________________________    
    public Time()
    {
        this.hour= 00;
        this.minute= 00;
        this.second=00;
    }
    public Time(int hour)
    {
        this();
        this.hour=hour;
    }
    public Time(int hour, int minute)
    {
        this(hour);
        this.minute=minute;
    }
    public Time(int hour, int minute, int second)
    {
        this(hour,minute);
        this.second=second;
    }
    public Time (Time time)
    {
        this(time.hour,time.minute,time.second);
    }
//_____________setters___________________
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
//____________getters_______________________
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
//______Add methods____________________________
    public void addHour(int h)
    {
        hour+=h;
    }
    public void addMinute(int m)
    {
        minute+=m;
    }
    public void addSecond(int s)
    {
        second+=s;
    }
//_______________to String()____________________
    public String toString()
    {
        return String.format("%02d:%02d:%02d", hour ,minute ,second);//The String.format method is a powerful tool for formatting strings in Java. It allows you to create a formatted string using placeholders for various data types. The placeholders are defined using the % character followed by a conversion character (such as d for integers, f for floating-point numbers, etc.).
    }// %02d : This is a placeholder for an integer (d stands for "decimal") that will be formatted with a minimum width of 2 characters and padded with leading zeros if necessary. This is used for the hour.
public static void main(String [] args )
{
    //Time tesTime=new Time(23,0);
    Time tesTime=new Time(23,0,15);
    Time tesTime2=new Time(tesTime);
    tesTime2.setHour(23);
    tesTime2.addMinute(7);
    System.out.println(tesTime2.toString());
}
}
