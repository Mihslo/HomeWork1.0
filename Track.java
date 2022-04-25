package gb.HomeWorkApp4;

public class Track implements Steeplechase {
    public int runLenght;
    public Track (int runLenght){
        this.runLenght=run1();
    }
    @Override
    public int run1() {
        runLenght = (int) (Math.random() * 30);
        return runLenght;
    }

    @Override
    public int jump1() {
        return 0;
    }


}
