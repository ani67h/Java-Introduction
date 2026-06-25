class Parent(
    public void sayHello(){
        System.out.println("Hello from parent");
    }
)

class Child extends Parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from Child");
    }
}

class Main{
    public static void main (String[] args){
        Parent p = new Child(); // for calling hello from child 
        // parent p = new Parent(); // for calling hello from parent 
        p.sayHello();
    }
}