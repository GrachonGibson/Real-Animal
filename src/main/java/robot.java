public abstract class robot  {

    private String creator;
    private int parts;
    private String name;

    public robot ( String creator, int parts, String name) {
        this.creator = creator;
        this.parts = parts;
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator (String creator) {
        this.creator = creator;
    }

    public int getParts() {
        return parts;
    }

    public void setParts (int parts) {
        this.parts = parts;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;

    }
        public abstract String attack();




}
