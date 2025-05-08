

class Author {
	private String name;
	private String email;
	private char gender;
	
	//public String getEmail() {
		//return email;
	//}
	public void setEmail(String email) {
		this.email = email;
	}
	//public String getName() {
		//return name;
	//}
	//public char getGender() {
		//return gender;
	//}
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
	String display() {
		return ("name:"+this.name+"\n"+"email:"+this.email+"\n"+"gender:"+this.gender);
	}
}
	class TestAuthor{
	public static void main(String[] args) {
		System.out.println("your details are:");
		Author anAuthor = new Author("Anish", "anish@somewhere.com", 'm');
		System.out.println(anAuthor.display());
		System.out.println();
		anAuthor.setEmail("abc@nowhere.com");
		System.out.println("After update your details:");
		System.out.println(anAuthor.display());

	}
	

}
