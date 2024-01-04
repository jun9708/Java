package sub8;

public class RemoteLG implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println(" LG - powerOn ");
	}

	@Override
	public void powerOff() {
		System.out.println(" LG - powerOFF ");
		
	}

	@Override
	public void chUp() {
		System.out.println(" LG - chON ");		
	}

	@Override
	public void chDown() {
		System.out.println(" LG - chOFF ");		
	}

	@Override
	public void soundUp() {
		System.out.println(" LG - soundUP ");		
	}

	@Override
	public void soundDown() {
		System.out.println(" LG - soundOFF ");		
	}

}