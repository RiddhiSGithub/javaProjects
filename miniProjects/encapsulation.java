public class encapsulation {

    private String name;
    private String middlname;
    private String surname;

    // diffrance between getter and setter setter set input and getter provide you output
    // note that in set____ this.______ is the variable that we defined privete and  = ______ is a variable that we defined in (__ ___)
    // in get___ return is the variable that we defined privet
    // name
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    // middlename
    public void setMiddlename(String middlename){this.middlname = middlename;}
    public String getMiddlename(){return middlname;}
    // surname
    public void setSurname(String surname){this.surname = surname;}
    public String getSurname(){return surname;}

    public static void fullname(){
        encapsulation var = new encapsulation();
        System.out.println(var.getName()+" "+var.getMiddlename()+" "+var.getSurname());
    }

    public static void main(String[] args) {
        encapsulation newVariable = new encapsulation();
        newVariable.setName("Riddhi");
        newVariable.setMiddlename("Jayantbhai");
        newVariable.setSurname("Makwana");

        System.out.println(newVariable.getName()+" "+newVariable.getMiddlename()+" "+newVariable.getSurname());
        fullname();        
    }
}
