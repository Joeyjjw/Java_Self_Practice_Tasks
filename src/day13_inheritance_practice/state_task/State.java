package day13_inheritance_practice.state_task;

public class State {
    private String name, abbreviation;
    private String politicalParty;
    private String governor, senator;
    private int population;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.politicalParty = politicalParty;
        this.governor = governor;
        this.senator = senator;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Name must not be null, empty, or blank");
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation == null ||abbreviation.isEmpty() || abbreviation.isBlank()){
            throw new RuntimeException("Abbreviation must not be null, empty, or blank");
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty == null || politicalParty.isEmpty() || politicalParty.isBlank())
            throw new RuntimeException("Political party must not be null, empty, or blank");
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor == null || governor.isEmpty()|| governor.isBlank()){
            throw new RuntimeException("Governor must not be null, empty, or blank");
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator == null || senator.isEmpty() || senator.isBlank()){
            throw new RuntimeException("Senator must not be null, empty, or blank");
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population <= 0){
            throw new RuntimeException("Population must be greater than zero");
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}

/*
Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.
 */
