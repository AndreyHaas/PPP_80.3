package Jahr2026;

public class Vorsatz {

 String vorsatz;
 boolean done;

 public Vorsatz(String vorsatz)
 {
     this.vorsatz = vorsatz;
     this.done = false;
 }
    void markAsDone(){
     done = true;
    }

    void showStatus(){

        System.out.println(vorsatz + " : " + (done ? "erledigt" : "offen"));

    }
}
