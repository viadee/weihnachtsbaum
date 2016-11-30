/**
                    p
                   ack
                  age c
                  hristm
                 as;public
                class Gree
                tings {priv
              ate static fin
              al  int  KOMPLE
             XITÄT = 28; priv
           ate static final Str
           ing  BEGREIFEN  =  "*
         ";private static final int
         LÖSUNGEN  =  10;   private
        static final  String  SCHAF
       FEN = "**"; public static voi
      d center(String msg) { for (int
     i = 0; i < (KOMPLEXITÄT - msg.le
    ngth()) >> 1; i++) {System.out.pri
    nt(" ");} System.out.println(msg);}
   public static void main(String[]args)
  {String line=BEGREIFEN; for(int i=0; i
  < LÖSUNGEN; i++){center(line);line+=SCH
 AFFEN;} center("*");center("*\n");center
 ("Frohe Weihnachten"); center("wünscht Ih
r Team der"); center("viadee Unternehmensbe
                   ratun
                   g");}}
 */

package christmas;

public class Greetings {
    private static final int KOMPLEXITÄT = 28;
    private static final String BEGREIFEN = "*";
    private static final int LÖSUNGEN = 10;
    private static final String SCHAFFEN = "**";

    public static void center(String msg) {
        for (int i = 0; i < (KOMPLEXITÄT - msg.length()) >> 1; i++) {
            System.out.print(" ");
        }
        System.out.println(msg);
    }

    public static void main(String[] args) {
        String line = BEGREIFEN;
        for (int i = 0; i < LÖSUNGEN; i++) {
            center(line);
            line += SCHAFFEN;
        }
        center("*");
        center("*\n");
        center("Frohe Weihnachten");
        center("wünscht Ihr Team der");
        center("viadee Unternehmensberatung");
    }
}
