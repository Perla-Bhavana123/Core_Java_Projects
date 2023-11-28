

class Msoffice1 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("Spellcheck")) {
			spellcheck();
		}
		else
		{
			saving();
		}
	}

	private void typing() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Typing---------");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

	private void spellcheck() {
		for(; ;) {
			try {
				System.out.println("spellcheck---------");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

	private void saving() {
		for(; ;) {
			try {
				System.out.println("Saving---------");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}


public class RaceConditionSolution {
	public static void main(String[] args) {
		Msoffice1 ms1=new Msoffice1();
		Msoffice1 ms2=new Msoffice1();
		Msoffice1 ms3=new Msoffice1();

		ms1.setName("Typing");
		ms2.setName("Spellcheck");
		ms3.setName("saving");

        ms2.setDaemon(true);
        ms3.setDaemon(true);
        
        ms2.setPriority(8);
        ms3.setPriority(9);
        
		ms1.start();
		ms2.start();
		ms3.start();

	}
}




