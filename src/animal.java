public class animal {

    private String type;
    private String NikName;
    private String action; //эмне кыла алат
    private int year;
    private int weight;
    private String country;

    public String getType() {
        return type;
    }

    public String getNikName() {
        return NikName;
    }

    public int getYear() {
        return year;
    }
    public String getCountry(){
        return country;
    }

    public int getWeight() {
        return weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNikName(String nikName) {
        NikName = nikName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "animal{" +
                "type='" + type + '\'' +
                ", NikName='" + NikName + '\'' +
                ", action='" + action + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", country='" + country + '\'' +
                '}';
    }
}

