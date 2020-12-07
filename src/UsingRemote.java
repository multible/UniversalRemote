import java.util.ArrayList;
import java.util.List;

public class UsingRemote {

	public static void main(String[] args) {
		
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		//-------------------------
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		onPressed = new DeviceButton(offCommand);
		
		onPressed.press();
		
		//------------------------
		
		TurnTVUp upCommand = new TurnTVUp(newDevice);
		
		onPressed = new DeviceButton(upCommand);
		
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		//------------------------
		
		SoundSystem theSoundSystem = new SoundSystem();
		
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		
		allDevices.add(theSoundSystem);
		allDevices.add(newDevice);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		
		turnThemOff.press();
		
		//------------------------
		
		turnThemOff.pressUndo();

	}

}
