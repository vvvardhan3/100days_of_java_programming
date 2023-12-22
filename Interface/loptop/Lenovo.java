package Interface;

public class Lenovo implements loptop {

    // No Need. With or with this @Override, The program runs successfully!
    public void copy() {
        System.out.println("Lenovo Copy Code!");        
    }

    
    public void cut() {
        System.out.println("Lenovo Cut Code!");        
    }

    
    public void paste() {
        System.out.println("Lenovo Paste Code!");
        
    }

    
    public void read() {
        System.out.println("Lenovo Read Code!");
        
    }

    
    public void write() {
        System.out.println("Lenovo Write Code!");
        
    }
    
    @Override
    public void security(){
        System.out.println("Lenovo Security Code");
    }

    
    
}
