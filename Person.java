import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person extends Employee{
    public String name;
    public Date dob;


    public Person(String name, String dob) {
        this.name = name;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            this.dob = sdf.parse(dob);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD-MM-YYYY.");
        }
    }

 
    public void displayPersonName() {
        System.out.println("Employee Name: " + name);
    }


    public void displayAge() {
        if (dob != null) {
            Date currentDate = new Date();
            long ageInMillis = currentDate.getTime() - dob.getTime();
            long ageInYears = ageInMillis / (1000L * 60 * 60 * 24 * 365);
            System.out.println("Age: " + ageInYears + " years");
        } else {
            System.out.println("Date of birth not set.");
        }
    }

    public static void main(String[] args) {                    

        Person person= new Person("Saadhvi shet", "07-11-2003");
        System.out.println("Employee Information:");
        person.displayPersonName();
        person.displayAge();
        person.get_empid();
        person.get_salary();
    }
}
