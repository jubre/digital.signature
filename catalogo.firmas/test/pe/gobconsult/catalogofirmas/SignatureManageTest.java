package pe.gobconsult.catalogofirmas;

import java.io.File;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SignatureManageTest {

	private SignatureManage signatureManage;

	@Test
	public void verifyGenerarFirma() {
		String nombreUsuario = "Junior Corman Medina Gob";
		String clavePrivada = "clavePrivada";
		String clavePublica = "clavePublica";
		String nombreOrganizacion = "GobConsult SA";
		String ubicacionAlmacenamiento = "store-firmas";
		String nombreArchivoFirma = "keystore_20130414_2308.ks";
		String tiempoValidez = "360";

		signatureManage = new SignatureManage(nombreUsuario,
				nombreOrganizacion, clavePublica, clavePrivada,
				ubicacionAlmacenamiento, nombreArchivoFirma, tiempoValidez);

		signatureManage.generarFirma();
		
		File f = new File(ubicacionAlmacenamiento + "/" + nombreArchivoFirma);
		assertTrue(f.exists());		
	}
}

