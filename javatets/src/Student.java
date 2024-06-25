public class Student {
    String name;
    String lastname;
    int matricola;

    public Student(String name, String surname, int matricola){
        this.name=name;
        this.lastname=surname;
        this.matricola=matricola;
    }
    public String getDetails(){
        return "nome: " + name + " cognome: " + lastname + " - matricola: " + matricola ;
    
    }
    public String toString(){
        return "Student: " + getDetails();
    }
}
