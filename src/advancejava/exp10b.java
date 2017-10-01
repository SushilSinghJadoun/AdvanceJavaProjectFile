package advancejava;
class A{
    void show(){
        System.out.println("Welcome to class A");
    }
}
class B extends A{
    @Override
    void show(){
        super.show();
        System.out.println("Welcome to class B");
        super.show();
    }
}
public class exp10b{   
    public static void main(String []args){
        B b=new B();
        b.show();
    }    
}