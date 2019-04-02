 class robodog extends robot implements pet{

public robodog (String creator, int parts, String name){
    super(creator, parts, name);

}
public String attack() {
    return "All robodogs attack enemies.";
}
public String toys() {
    return "All robodogs play with machine guns";

}
public String love() {
    return "All robodogs love their masters.";
}
 }


