
public class Phone {

	String phonebook;
	int listofcalls;
	int textmsg;
	void clear()
	{
		this.phonebook=null;
		this.listofcalls=0;
		this.textmsg=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Cameraphone cp=new Cameraphone();
 cp.phonebook="aswathy";
 cp.listofcalls=10;
 cp.textmsg=15;
 cp.album="Gallery";
 cp.display();
 cp.clear();
 cp.display();
	}

}
class Cameraphone extends Phone
{
	String album;
	void clear()
	{
		super.clear();
		this.album=null;
	}
	void display()
	{
		System.out.println("PhoneBook:"+phonebook+"\nlist of calls:"+listofcalls+"\nText Msg:"+textmsg+"\nAlbums:"+album);
	}
}
