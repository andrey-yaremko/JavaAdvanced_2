package ua.lviv.lgs;

public class Magazines {
    private String name;
    private int date_of_relese;
    private int nomber_of_relese;


    public Magazines(String name, int date_of_relese, int nomber_of_relese) {
        this.name = name;
        this.date_of_relese = date_of_relese;
        this.nomber_of_relese = nomber_of_relese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate_of_relese() {
        return date_of_relese;
    }

    public void setDate_of_relese(int date_of_relese) {
        this.date_of_relese = date_of_relese;
    }

    public int getNomber_of_relese() {
        return nomber_of_relese;
    }

    public void setNomber_of_relese(int nomber_of_relese) {
        this.nomber_of_relese = nomber_of_relese;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "name='" + name + '\'' +
                ", date_of_relese=" + date_of_relese +
                ", nomber_of_relese=" + nomber_of_relese +
                '}';
    }
}
