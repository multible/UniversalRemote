
public class SoundSystem implements ElectronicDevice{
	
	private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("SoundSystem is on!");
		
	}

	@Override
	public void off() {
		System.out.println("SoundSystem is off!");
		
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("SoundSystem Volume is at" + volume);
		
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("SoundSystem Volume ist at " + volume);
		
	}


}
