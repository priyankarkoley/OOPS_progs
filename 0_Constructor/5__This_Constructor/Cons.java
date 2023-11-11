class Base1{
    int a;
    Base1(int a){
        this.a=a;
    }
    Base1(){
        this(5);
    }
}

class Base2{
    int a;
    Base2(int a){
        this();
        this.a=a;
    }
    Base2(){
        System.out.println("Base2 Cons Called");
    }
}

class Base3{
    int a,b;
    Base3(int a){
        this.a=a;
    }
    Base3(int a, int b){
        this(a);
        this.b=b;
    }
}

public class Cons {
    public static void main(String[] args){
        Base1 obj1 = new Base1();
        Base2 obj2 = new Base2(56);
        Base3 obj3 = new Base3(5,6);
        System.out.print(obj1.a+"\n\n");
        System.out.print(obj2.a+"\n\n");
        System.out.print("a= "+obj3.a+"\nb= "+obj3.b);
    }
}
