package patientintake;

public enum Doctor {
    avery("Ralph Avery"),
    johnson("Beth Johnson"),
    murphy("Pat Murphy"),
    silva("Leonardo Silva");

    private String name;

    Doctor(String name ){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
