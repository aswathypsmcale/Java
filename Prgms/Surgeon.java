final class Doctor
{
}

class Surgeon extends Doctor
{
void showDetails()
{
System.out.println("I am a Surgeon");
}

public static void main(String args[])
{
Surgeon S= new Surgeon();
S.showDetails();
}
}
