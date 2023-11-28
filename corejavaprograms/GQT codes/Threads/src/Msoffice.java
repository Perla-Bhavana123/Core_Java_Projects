class Msoffice3 extends Thread{
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
		for(int i=0;i<5;i++) {
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
		for(int i=0;i<5;i++) {
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


public class Msoffice{

	public static void main(String[] args) {
		Msoffice3 ms1=new Msoffice3();
		Msoffice3 ms2=new Msoffice3();
		Msoffice3 ms3=new Msoffice3();

		ms1.setName("Typing");
		ms2.setName("Spellcheck");
		ms3.setName("saving");


		ms1.start();
		ms2.start();
		ms3.start();

	}

}

