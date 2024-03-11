public class Cat extends Animal{

    public Cat(String colour){
        super(colour);
    }
    public void purr(){
        System.out.println("Schnurr Schnurr");
    }
    public void sayColour(){
        System.out.println("Meine Farbe ist: " + this.getColour());
    }
}
