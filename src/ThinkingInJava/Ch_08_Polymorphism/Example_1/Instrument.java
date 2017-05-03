package ThinkingInJava.Ch_08_Polymorphism.Example_1;

/**
 * Created by Home on 28.12.2016.
 */

class Instrument {
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
    public String what() {
        return "Instrument";
    }
    public void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
   public void play(Note n){
       System.out.println("Wind.play()" + n);
   }
   public String what() {
        return "Wind";
    }
    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    public void play(Note n) {
        System.out.println("Percussion.play()" + n);
    }
    public String what() {
        return "Percussion";
    }
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play()" + n);
     }
    public String what() {
        return "Stringed";
    }
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Instrument {
    public void play(Note n){
        System.out.println("Brass.play()" + n);
     }
    public String what() {
        return "Brass";
    }
    public void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    public void play(Note n){
        System.out.println("Woodwind.play()" + n);
    }
    public String what() {
        return "Woodwind";
    }
    public void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}

class Music {
   public static void tune(Instrument i) {
       i.play(Note.MIDDLE_C);
   }

   public static void tuneAll(Instrument[] instruments) {
       for (Instrument instrument : instruments) {
           tune(instrument);
       }
   }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
