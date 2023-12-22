package AbstractClass.Loptop;

public  abstract class Sample implements loptop{

    @Override
    public void copy() {
        System.out.println("Copy Operation");
    }

    @Override
    public void paste() {
        System.out.println("Paste Operation");
    }

    public abstract void cut();

    public abstract void keyboard();

    
}
