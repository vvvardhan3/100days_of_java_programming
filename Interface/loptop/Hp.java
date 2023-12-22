package Interface.loptop;

public class Hp implements loptop {

    @Override // No Need. With or with this @Override, The program runs successfully!
    public void copy() {
        System.out.println("Hp Copy Code!");        
    }

    @Override
    public void cut() {
        System.out.println("Hp Cut Code!");        
    }

    @Override
    public void paste() {
        System.out.println("Hp Paste Code!");
        
    }

    @Override
    public void read() {
        System.out.println("Hp Read Code!");
        
    }

    @Override
    public void write() {
        System.out.println("Hp Write Code!");
        
    }
    
}
