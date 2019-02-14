package problem02;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute( String function ) {
		if (function.equals("≈Î»≠")) {
			System.out.println(call());
			return;
		}
		
		if (function.equals("¿Ωæ«")) {
			System.out.println(playMusic());
			return;
		}
		
		if (function.equals("æ€")) {
			System.out.println(runApp());
			return;
		}
		
		super.execute(function);
	}
	
	public String runApp() {
		return "æ€Ω««‡";
	}
	
	public String playMusic() {
		return "Ω∫∆Æ∏Æπ÷";
	}
	
}