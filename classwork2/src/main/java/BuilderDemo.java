class ClassToBuild{

private int a;
private int b;

public ClassToBuild(int a, int b ) {
        this.a = a;
        this.b = b;
    }
}
//name of class your are building + " builder"

class CLassToBuildBuilder{
    private int a;
    private int b;
    //builder style is return type of builder + it returns itself
public CLassToBuildBuilder setA (int a){
    this.a = a;
    return this;
}
    //builder style is return type of builder + it returns itself
    public CLassToBuildBuilder setb (int b){
        this.b = b;
        return this;
    }
    public ClassToBuild build(){
    return new ClassToBuild(a,b);
    }


}



public class BuilderDemo {
    public static void main(String[] args) {
        //without builder
        ClassToBuild a = new ClassToBuild(1,2);

        //with builder
        CLassToBuildBuilder b = new CLassToBuildBuilder();
        b.setA(3);
        // things can happen in between.
        b.setb(4);
        ClassToBuild bb = b.build();

        ClassToBuild c = new CLassToBuildBuilder() //fancier builder style setters
        .setA(1)
        .setb(2)
        .build();
    }

}
