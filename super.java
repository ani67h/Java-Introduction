// superclass
class Superclass{
    int number = 56;

}
// child class or subclass or derived class 
class Subclass extends Superclass{
    /* The same variable num ois declared in the Subclass
    which is already present in the Superclass */
    int number = 96;
    void printNumber(){
        System.out.println(number);
        // System.out.println(super.number);
    }
}

class Main{
    public static void main (String args[]){
        Subclass sub = new Subclass();
        sub.printNumber();
    }
}