package gb.HomeWorkApp4;

public class Wall implements Steeplechase {
    public int jupmHight;
    public Wall(int jupmHight){
        this.jupmHight=jump1();
    }

    @Override
    public int run1() {
        return 0;
    }

    @Override
    public int jump1() {
        jupmHight= (int) (Math.random() * 5);
        return jupmHight;
    }
}
