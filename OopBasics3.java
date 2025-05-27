class square{
    int side;

    public int area(){
        return side *side;

    }
    public int perimeter(){
        return 4*side;

    }
}

public class OopBasics3 {
    public static void main(String[] args) {
        
        square s = new square();
        s.side = 3;
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
