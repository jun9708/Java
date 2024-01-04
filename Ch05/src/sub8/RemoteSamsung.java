package sub8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println(" Samsung - powerOn ");
	}

	@Override
	public void powerOff() {
		System.out.println(" Samsung - powerOFF ");
		
	}

	@Override
	public void chUp() {
		System.out.println(" Samsung - chON ");		
	}

	@Override
	public void chDown() {
		System.out.println(" Samsung - chOFF ");		
	}

	@Override
	public void soundUp() {
		System.out.println(" Samsung - soundUP ");		
	}

	@Override
	public void soundDown() {
		System.out.println(" Samsung - soundOFF ");		
	}

}
