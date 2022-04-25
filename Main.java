package gb.HomeWorkApp4;

public class Main {

    public static void main(String[] args) {
    Units[] units={
            new Human("Tom",10,1),
            new Human("Vasil",12,2),
            new Robobcop("Arnold",15,4),
            new Robobcop("Fggg",16,5),
            new Cat("Barsik",12,3),
            new Cat("Mars",13,4),

                };
    Steeplechase[] steeplechases={
            new Track(20),
            new Wall(5)
    };
        for(Units u:units){
            for(Steeplechase s:steeplechases){
                if(u.run()>= s.run1() && u.jump()>=s.jump1()){
                    System.out.printf("%s  преодалел дитсанцию %dm и препятсвие высотой %dm,\n",u.getName(),s.run1(),s.jump1());
                }
                System.out.printf("%s не преодалел дитсанцию %dm и препятсвие высотой %dm,\n",u.getName(),u.run(),u.jump());
            }
        }
    }
}
