public class Person {
    private int age;	
  
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public Person(int initialAge) {
        if (initialAge < 0) {
            setAge(0);
            System.out.println("Age is not valid, setting age to 0."); 
        } else {
            this.age = initialAge;
        }   
    }

    public void amIOld() {
        if (getAge() < 13){
            System.out.println("You are young.");        
        } else if (getAge() >= 13 && getAge() < 18) {
            System.out.println("You are a teenager.");        
        } else {
            System.out.println("You are old.");                    
        }
    }

    public void yearPasses() {
        // Increment this person's age.
        setAge(++age);
    }

    public static void main(String[] args) {
        Person person = new Person(18);

        // just testing what could happen
        person.yearPasses();
        person.yearPasses();
        person.yearPasses();
        System.out.println(person.getAge());
        
        person.amIOld();
    }
}
