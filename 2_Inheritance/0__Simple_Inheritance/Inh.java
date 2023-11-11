class Base{
    public int x;
    public char s;
    void display (){System.out.print("\n\nx = "+ x +"\ns = "+ s +"\n");}
}

class Sub extends Base{

    Sub(int x, char s){
        this.x = x;
        this.s = s;
    }
}

public class Inh{
    public static void main(String[] args) {
        int x=5;
        char s = 'P';
        Sub obj = new Sub(x,s);
        System.out.print("\nAt first--->");
        obj.display();
        
        obj.x=1001;
        obj.s='g';

        System.out.print("\nAfter updation--->");
        obj.display();
    }
}
