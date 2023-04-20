public class Cup {
    public String color;
    public String liquid;
    public String size;
    public  String temp;

    public Cup(String color, String liquid, String size, String temp) {
        this.color =  color;
        this.liquid = liquid;
        this.size = size;
        this.temp = temp;
    }

    public String getInfo () {
        return String.format("color: %s%nliquid: %s%nsize: %s%ntemp: %s%n ", color, liquid, size, temp);
    }


    public static void main(String[] args) {
        Cup cup1 = new Cup("white", "coffee", "medium", "hot");
        System.out.println(cup1.getInfo());
    }
}
