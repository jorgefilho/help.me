package help.me.password;

import org.jboss.security.auth.spi.Util;

public class SecurityUtil {
 
	public static byte[] criptografar(String senha){
		String hash = Util.createPasswordHash("SHA-256", 
				"base128", null, null, senha);
		return hash.getBytes();
	}
 
	public static void main(String[] args) {
 
		byte[] hash = SecurityUtil.criptografar("admin");
		System.out.println(new String(hash));
 
	}
 
}
