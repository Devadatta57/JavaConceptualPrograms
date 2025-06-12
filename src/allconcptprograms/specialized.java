package allconcptprograms;
class plane{
  int a;
  int b;
  void plane(){
      System.out.println("plane method inherited");
  }
  void met(){
      System.out.println(" method in plane");
  }
}
class cargoplane extends plane{
    void met(){
        System.out.println("method overided");
    }
    void cargoplane(){//cant inherit in passengerplane
        System.out.println("specialized method");
    }

}
class passengerplane extends plane{
    void plane(){
        System.out.println("plane overided");
    }
    void passengerplane(){
        System.out.println("passengerplane specialized");
    }
}
public class specialized {
    public static void main(String[] args) {
        cargoplane cg=new cargoplane();
        cg.plane();
        cg.met();
        cg.cargoplane();

        System.out.println();

        passengerplane pg=new passengerplane();
        pg.plane();
        pg.passengerplane();

    }
}

