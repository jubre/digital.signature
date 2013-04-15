package pe.gobconsult.ejecutorfirmas;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SignatureWriteTest {
	private SignatureWrite signatureWrite;
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
		String rutaSalidaPdfFile = "";
		String rutaEntradaPdfFile = "";
		String rutaFirmaDigitalFile = "store-firmas/keystore-1203-01.ks";
		String clavePrivada = "clavePrivada";
		String clavePublica = "clavePublica";

		signatureWrite = new SignatureWrite(rutaSalidaPdfFile,
				rutaEntradaPdfFile, rutaFirmaDigitalFile, clavePublica,
				clavePrivada);
	}

	@Test
	public void verifySignFileFirmante1() {
		boolean result = false;
		signatureWrite.setRutaEntradaPdfFile(rutaEntradaPdfFileSinFirma);
		signatureWrite.setRutaSalidaPdfFile(rutaSalidaPdfFileConPrimeraFirma);
		result = signatureWrite.signFile(1);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante2() {
		boolean result = false;
		signatureWrite.setRutaEntradaPdfFile(rutaSalidaPdfFileConPrimeraFirma);
		signatureWrite.setRutaSalidaPdfFile(rutaSalidaPdfFileConSegundaFirma);
		result = signatureWrite.signFile(2);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante3() {
		boolean result = false;
		signatureWrite.setRutaEntradaPdfFile(rutaSalidaPdfFileConSegundaFirma);
		signatureWrite.setRutaSalidaPdfFile(rutaSalidaPdfFileConTerceraFirma);
		result = signatureWrite.signFile(3);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante4() {
		boolean result = false;
		signatureWrite.setRutaEntradaPdfFile(rutaSalidaPdfFileConTerceraFirma);
		signatureWrite.setRutaSalidaPdfFile(rutaSalidaPdfFileConCuartaFirma);
		result = signatureWrite.signFile(4);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante5() {
		boolean result = false;
		signatureWrite.setRutaEntradaPdfFile(rutaSalidaPdfFileConCuartaFirma);
		signatureWrite.setRutaSalidaPdfFile(rutaSalidaPdfFileConQuintaFirma);
		result = signatureWrite.signFile(5);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante6() {
		boolean result = false;
		signatureWrite.setRutaEntradaPdfFile(rutaSalidaPdfFileConQuintaFirma);
		signatureWrite.setRutaSalidaPdfFile(rutaSalidaPdfFileConSextaFirma);
		result = signatureWrite.signFile(6);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante7() {
		boolean result = false;
		signatureWrite.setRutaEntradaPdfFile(rutaSalidaPdfFileConSextaFirma);
		signatureWrite.setRutaSalidaPdfFile(rutaSalidaPdfFileConSetimaFirma);
		result = signatureWrite.signFile(7);
		assertTrue(result);
	}

	@Test
	public void verifySignFileFirmante8() {
		boolean result = false;
		signatureWrite.setRutaEntradaPdfFile(rutaSalidaPdfFileConSetimaFirma);
		signatureWrite.setRutaSalidaPdfFile(rutaSalidaPdfFileConOctavaFirma);
		result = signatureWrite.signFile(8);
		assertTrue(result);
	}

}
