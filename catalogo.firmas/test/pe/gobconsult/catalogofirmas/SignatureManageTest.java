package pe.gobconsult.catalogofirmas;

import org.junit.Test;

public class SignatureManageTest {

	private SignatureManage signatureManage;

	@Test
	public void verifyGenerarFirma() {
		String nombreUsuario = "Junior Corman Medina Gob";
		String clavePrivada = "clavePrivada";
		String clavePublica = "clavePublica";
		String nombreOrganizacion = "GobConsult SA";
		String ubicacionAlmacenamiento = "store-firmas";
		String nombreArchivoFirma = "keystore-20121230-02.ks";
		String tiempoValidez = "360";

		signatureManage = new SignatureManage(nombreUsuario,
				nombreOrganizacion, clavePublica, clavePrivada,
				ubicacionAlmacenamiento, nombreArchivoFirma, tiempoValidez);

		signatureManage.generarFirma();
	}
}
