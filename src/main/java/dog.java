 class dog extends canine implements pet {


    public dog (int eyes, int legs ,String sound) {
        super (eyes, legs, sound );
    }
    public String eat(){
        return "Dogs eat dogfood.";
    }
    public String toys(){
        return "Dogs play with bones,";
    }
    public String love(){
        return "Dogs love their owners.";
    }
    
}
