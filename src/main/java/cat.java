 class cat extends feline implements pet {

    public cat (int eyes, int legs, String sound) {
        super( eyes, legs, sound );
    }
    public String eat() {
        return " All cats eat catfood.";
    }
    public String toys() {
        return " All cats play with scratching posts.";
    }
    public String love() {
        return "All cats hate their owners.";
    }
}
