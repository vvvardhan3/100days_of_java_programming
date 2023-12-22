package Interface.loptop;

public class Apple implements loptop {
    @Override // No Need. With or with this @Override, The program runs successfully!
    public void copy() {
        System.out.println("Apple Copy Code!");        
    }

    @Override
    public void cut() {
        System.out.println("Apple Cut Code!");        
    }

    @Override
    public void paste() {
        System.out.println("Apple Paste Code!");
        
    }

    @Override
    public void read() {
        System.out.println("Apple Read Code!");
        
    }

    @Override
    public void write() {
        System.out.println("Apple Write Code!");
        
    }
}
