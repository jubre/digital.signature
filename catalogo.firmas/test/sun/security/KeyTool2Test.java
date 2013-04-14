package sun.security;

import org.junit.Before;
import org.junit.Test;

import sun.security.tools.KeyTool2;

public class KeyTool2Test {

	private KeyTool2 keyTool2;
	
	@Before
	public void init(){
		keyTool2 = new KeyTool2();
	}
	
	@Test
	public void verificar1() throws Exception{
		String[] args = new String[13];
        args[0] = "-genkeypair";
        args[1] = "-dname";
        args[2] = "cn=Junior Corman Medina, ou=GobConsultX, o=GobConsultX, c=PE";
        args[3] = "-alias";
        args[4] = "business";
        args[5] = "-keypass";
        args[6] = "kpi135";
        args[7] = "-keystore";
        args[8] = "store-firmas/keystore_20130414_1251.ks";
        args[9] = "-storepass";;
        args[10] = "ab987c";
        args[11] = "-validity";
        args[12] = "180";
        
        keyTool2.run(args, System.out);
	} 
}
