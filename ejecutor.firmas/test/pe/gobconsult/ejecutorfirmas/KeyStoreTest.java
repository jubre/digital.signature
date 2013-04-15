package pe.gobconsult.ejecutorfirmas;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStore.PasswordProtection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;

import org.junit.Test;

public class KeyStoreTest {

	@Test
	public void verify() throws KeyStoreException, NoSuchAlgorithmException,
			CertificateException, IOException {
		KeyStore ks = KeyStore.getInstance("JKS");

		// get user password and file input stream
		char[] password = "clavePrivada".toCharArray();

		java.io.FileInputStream fis = null;
		try {
			fis = new java.io.FileInputStream(
					"store-firmas/keystore-1203-01.ks");
			ks.load(fis, password);
		} finally {
			if (fis != null) {
				fis.close();
			}
		}

		PasswordProtection passwordProtection = new PasswordProtection(
				"clavePrivada".toCharArray());

		KeyStore.PrivateKeyEntry pkEntry = null;
		try {
			pkEntry = (KeyStore.PrivateKeyEntry) ks
					.getEntry("privateKeyAlias", passwordProtection);
		} catch (UnrecoverableEntryException e) {
			System.out.print("Error UnrecoverableEntryException");
		}
		
		PrivateKey myPrivateKey = pkEntry.getPrivateKey();
	}
}
