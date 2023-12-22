package Interface.Flyable;

public class user {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.flyObj();

        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.flyObj();

        Helicopter helicopter = new Helicopter();
        helicopter.flyObj();
    }
    
}
