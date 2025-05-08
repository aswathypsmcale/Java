public class Hospital
 {
public static void main(String args[])
 {
Surgeon s = new Surgeon();
s.Doctor_Details();
s.Surgeon_Details();
s.showDetails();
Doctor d= new Doctor();
d.Doctor_Details();
d.showDetails();
Doctor d1=new Surgeon();//Upcasting
d1.showDetails();
}
}



class Doctor {
void Doctor_Details() {
System.out.println("Doctor Details...");
}
void showDetails(){
System.out.println("I am a General Physician");
}
}

class Surgeon extends Doctor {
void Surgeon_Details() 
{
System.out.println("Surgen Detail...");
}

void showDetails(){
System.out.println("I am a Surgeon");
}
}

