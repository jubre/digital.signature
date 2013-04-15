package pe.gobconsult.ejecutorfirmas;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SignatureWriteWSTest {
	private SignatureWriteWS signatureWriteWS;

	private static final String rutaFirmaDigitalFile = "store-firmas/keystore-1203-01.ks";
	private static final String clavePrivada = "clavePrivada";
	private static final String clavePublica = "clavePublica";

	private static final String rutaEntradaPdfFileSinFirma = "store/pdf-prueba-1.pdf";
	private static final String rutaSalidaPdfFileConPrimeraFirma = "store/documento-firmado-con-1-firma.pdf";
	private static final String rutaSalidaPdfFileConSegundaFirma = "store/documento-firmado-con-2-firma.pdf";
	private static final String rutaSalidaPdfFileConTerceraFirma = "store/documento-firmado-con-3-firma.pdf";
	private static final String rutaSalidaPdfFileConCuartaFirma = "store/documento-firmado-con-4-firma.pdf";
	private static final String rutaSalidaPdfFileConQuintaFirma = "store/documento-firmado-con-5-firma.pdf";
	private static final String rutaSalidaPdfFileConSextaFirma = "store/documento-firmado-con-6-firma.pdf";
	private static final String rutaSalidaPdfFileConSetimaFirma = "store/documento-firmado-con-7-firma.pdf";
	private static final String rutaSalidaPdfFileConOctavaFirma = "store/documento-firmado-con-8-firma.pdf";

	@Before
	public void init() {
		signatureWriteWS = new SignatureWriteWS();
	}

	@Test
	public void verifySignFile() {
		boolean result = false;
		result = signatureWriteWS.signFile(rutaSalidaPdfFileConPrimeraFirma,
				rutaEntradaPdfFileSinFirma, rutaFirmaDigitalFile, clavePublica,
				clavePrivada);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante1() {
		boolean result = false;
		result = signatureWriteWS.signFileByFirmante(
				rutaSalidaPdfFileConPrimeraFirma, rutaEntradaPdfFileSinFirma,
				rutaFirmaDigitalFile, clavePublica, clavePrivada, 1);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante2() {
		boolean result = false;
		result = signatureWriteWS.signFileByFirmante(
				rutaSalidaPdfFileConSegundaFirma,
				rutaSalidaPdfFileConPrimeraFirma, rutaFirmaDigitalFile,
				clavePublica, clavePrivada, 2);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante3() {
		boolean result = false;
		result = signatureWriteWS.signFileByFirmante(
				rutaSalidaPdfFileConTerceraFirma,
				rutaSalidaPdfFileConSegundaFirma, rutaFirmaDigitalFile,
				clavePublica, clavePrivada, 3);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante4() {
		boolean result = false;
		result = signatureWriteWS.signFileByFirmante(
				rutaSalidaPdfFileConCuartaFirma,
				rutaSalidaPdfFileConTerceraFirma, rutaFirmaDigitalFile,
				clavePublica, clavePrivada, 4);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante5() {
		boolean result = false;
		result = signatureWriteWS.signFileByFirmante(
				rutaSalidaPdfFileConQuintaFirma,
				rutaSalidaPdfFileConCuartaFirma, rutaFirmaDigitalFile,
				clavePublica, clavePrivada, 5);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante6() {
		boolean result = false;
		result = signatureWriteWS.signFileByFirmante(
				rutaSalidaPdfFileConSextaFirma,
				rutaSalidaPdfFileConQuintaFirma, rutaFirmaDigitalFile,
				clavePublica, clavePrivada, 6);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante7() {
		boolean result = false;
		result = signatureWriteWS.signFileByFirmante(
				rutaSalidaPdfFileConSetimaFirma,
				rutaSalidaPdfFileConSextaFirma, rutaFirmaDigitalFile,
				clavePublica, clavePrivada, 7);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante8() {
		boolean result = false;
		result = signatureWriteWS.signFileByFirmante(
				rutaSalidaPdfFileConOctavaFirma,
				rutaSalidaPdfFileConSetimaFirma, rutaFirmaDigitalFile,
				clavePublica, clavePrivada, 8);
		assertTrue(result);
	}
}
