package main;

public class Program {
    
    public static void main(String[] args) {
        Avatar a1 = new Avatar("Jake","Erdei","Íj",290,100,20);
        Avatar a2 = new Avatar("Quaritch","Hybrid","Ököl",290,100,20);
        
        //tesztek
        System.out.println(a1.allapot());
        System.out.println(a2.allapot());
        
        System.out.println("Egyformák: " + (a1.egyforma(a2)));
        
        nezet(!(a1.egyforma(a2)), "Ellenseg!");
        nezet(!(a1.egyforma(a1)), "Ellenseg!");
        System.out.println(a1.getNev() +" harcol " + a2.getNev()+ " " +a1.harc(a2));
        
    }//main
    
    private static void nezet(boolean feltetel, String uzenet) {
        if (feltetel) {
            System.out.println(uzenet);
        }
    }
}//class
