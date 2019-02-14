package problem02;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute( String function ) {
		if (function.equals("��ȭ")) {
			System.out.println(call());
			return;
		}
		
		if (function.equals("����")) {
			System.out.println(playMusic());
			return;
		}
		
		if (function.equals("��")) {
			System.out.println(runApp());
			return;
		}
		
		super.execute(function);
	}
	
	public String runApp() {
		return "�۽���";
	}
	
	public String playMusic() {
		return "��Ʈ����";
	}
	
}