package WeekendAssignments;

//Problem Statement : Multiple Inheritance using JAVA interface
//Interfaces//
interface Camera
{
void takePhoto();	
}

interface MusicPlayer
{
void playMusic();
}

interface SmartFeatures
{
void connectToWifi();
}


//Class//
class SmartPhone implements Camera,MusicPlayer,SmartFeatures

{
	
public void takePhoto()
{
	System.out.println("Photo captured successfully");
	
	

}
public void playMusic()
{
	
	System.out.println("Playing music...");
}

public void connectToWifi()
{
	
	System.out.println("Connected to WiFi");
}


}
public class Assignment6_Q3_MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone spObj = new SmartPhone();
		
		System.out.println("Expected Output : ");
		spObj.takePhoto();
		spObj.playMusic();
		spObj.connectToWifi();
	}

}
