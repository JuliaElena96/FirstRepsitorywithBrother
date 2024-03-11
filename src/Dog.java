public class Dog extends Animal{

    public Dog(String colour){
        super(colour);
    }

    public void bark(){
        System.out.println("Wuff");
    }
    public void sayColour(){
        System.out.println("Meine Farbe ist: " + this.getColour());
    }
}
