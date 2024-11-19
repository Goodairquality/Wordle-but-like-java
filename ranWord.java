import java.util.ArrayList;
import java.util.Random;

public class ranWord {
    
    private ArrayList <String> wordList = new ArrayList <> ();
    
    public ranWord () {
        // A
        wordList.add("aback");
        wordList.add("adore");
        wordList.add("agree");
        wordList.add("alarm");
        wordList.add("anvil");
        wordList.add("await");

        // B
        wordList.add("bacon");
        wordList.add("badge");
        wordList.add("baggy");
        wordList.add("basil");
        wordList.add("bluff");
        wordList.add("brief");

        // C
        wordList.add("cabin");
        wordList.add("cynic");
        wordList.add("cater");
        wordList.add("clove");
        wordList.add("climb");
        wordList.add("cream");

        // D
        wordList.add("dealt");
        wordList.add("dairy");
        wordList.add("drive");
        wordList.add("drool");
        wordList.add("drama");
        wordList.add("dwarf");

        // E
        wordList.add("eagle");
        wordList.add("email");
        wordList.add("evade");
        wordList.add("enemy");
        wordList.add("ennui");
        wordList.add("evict");

        // F
        wordList.add("fable");
        wordList.add("flair");
        wordList.add("fight");
        wordList.add("flake");
        wordList.add("forte");
        wordList.add("fresh");

                // G
        wordList.add("gable");
        wordList.add("gauge");
        wordList.add("gleam");
        wordList.add("globe");
        wordList.add("grape");
        wordList.add("guard");

        // H
        wordList.add("habit");
        wordList.add("haste");
        wordList.add("haven");
        wordList.add("heath");
        wordList.add("hinge");
        wordList.add("hoist");

        // I
        wordList.add("image");
        wordList.add("imply");
        wordList.add("inlet");
        wordList.add("input");
        wordList.add("irony");
        wordList.add("issue");

        // J
        wordList.add("jolly");
        wordList.add("joust");
        wordList.add("juice");
        wordList.add("jumbo");
        wordList.add("juror");
        wordList.add("jumpy");

        // K
        wordList.add("karma");
        wordList.add("kayak");
        wordList.add("kneel");
        wordList.add("knife");
        wordList.add("knock");
        wordList.add("knoll");

        // L
        wordList.add("label");
        wordList.add("latch");
        wordList.add("lodge");
        wordList.add("lunar");
        wordList.add("lurid");
        wordList.add("lyric");

        // M
        wordList.add("magic");
        wordList.add("mango");
        wordList.add("march");
        wordList.add("metal");
        wordList.add("mirth");
        wordList.add("mover");

        // N
        wordList.add("nadir");
        wordList.add("nanny");
        wordList.add("noble");
        wordList.add("niche");
        wordList.add("night");
        wordList.add("novel");

        // O
        wordList.add("oasis");
        wordList.add("ocean");
        wordList.add("offer");
        wordList.add("olive");
        wordList.add("orbit");
        wordList.add("order");

        // P
        wordList.add("pacer");
        wordList.add("paint");
        wordList.add("peace");
        wordList.add("pearl");
        wordList.add("piano");
        wordList.add("piper");

        // Q
        wordList.add("quail");
        wordList.add("quake");
        wordList.add("queen");
        wordList.add("quick");
        wordList.add("quilt");
        wordList.add("quirk");

        // R
        wordList.add("rabid");
        wordList.add("ranch");
        wordList.add("reach");
        wordList.add("realm");
        wordList.add("relax");
        wordList.add("river");

        // S
        wordList.add("saber");
        wordList.add("scale");
        wordList.add("scout");
        wordList.add("serve");
        wordList.add("shade");
        wordList.add("smile");

        // T
        wordList.add("table");
        wordList.add("taste");
        wordList.add("tempo");
        wordList.add("thing");
        wordList.add("thorn");
        wordList.add("track");

        // U
        wordList.add("ultra");
        wordList.add("umbra");
        wordList.add("uncle");
        wordList.add("unite");
        wordList.add("upper");
        wordList.add("urban");

        // V
        wordList.add("vague");
        wordList.add("valid");
        wordList.add("vapor");
        wordList.add("vivid");
        wordList.add("voice");
        wordList.add("vital");

        // W
        wordList.add("wager");
        wordList.add("waist");
        wordList.add("whale");
        wordList.add("wheel");
        wordList.add("whole");
        wordList.add("wrist");

        // X
        wordList.add("xenon");
        wordList.add("xerox");
        wordList.add("xylem");
        wordList.add("xenic");
        wordList.add("xeric");

        // Y
        wordList.add("yacht");
        wordList.add("yahoo");
        wordList.add("yield");
        wordList.add("young");
        wordList.add("youth");
        wordList.add("yummy");

        // Z
        wordList.add("zebra");
        wordList.add("zesty");
        wordList.add("zonal");
        wordList.add("zones");
        wordList.add("zoomy");


    }
    
    public String randWordChoice() {
        Random rand = new Random();
        return wordList.get(rand.nextInt(wordList.size()));
    }
    
}