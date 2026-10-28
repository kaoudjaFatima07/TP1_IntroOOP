
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student1 = new Student();
        student1.name = "Ahmed";
        student1.id = 2026001;
        student1.major = "computer engineer";
        student1.email = "Ahmed2026@gmail.com";
        
        Student student2 = new Student();
        student2.name = "Sara";
        student2.id = 2026002;
        student2.major = "cybersecurity";
        student2.email = "Sara2026@gmail.com";
        
        Student student3 = new Student();
        student3.name = "Fatima";
        student3.id = 2026002;
        student3.major = "computer science";
        student3.email = "Fatimakaoudja@gmail.com";
        
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
	}

}
