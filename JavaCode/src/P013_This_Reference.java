class Point{
    int x,y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    Point(){
        this(10,10);
    }

    Point setX(int x){
        this.x=x;
        return this;
    }

    Point setY(int y){
        this.y=y;
        return this;
    }

}
public class P013_This_Reference {
    public static void main(String[] args){
        Point p1=new Point(1,2);
        Point p2=new Point();
        //Chaining of functions
        p1.setX(4).setY(5);
    }
}
