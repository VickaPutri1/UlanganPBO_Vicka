package UTSVicka;
	public class String_UTSVicka{

		public static void main (String[]args) {
			String saya = "VICKA PUTRI\n<!--ABCDEFGHIJKLMNOPQRSTUVWXYZ-->";
			
			System.out.println(saya.substring(0,saya.indexOf('\n')));
			System.out.println(saya.split("\n", 0)[0]);
			
		}
	}