package pe.gobconsult.ejecutorfirmas;

public class SignatureWriteWS {

	private SignatureWrite signatureWrite;

	public boolean signFile(String rutaSalidaPdfFile,
			String rutaEntradaPdfFile, String rutaFirmaDigitalFile,
			String clavePublica, String clavePrivada) {
		signatureWrite = new SignatureWrite(rutaSalidaPdfFile,
				rutaEntradaPdfFile, rutaFirmaDigitalFile, clavePublica,
				clavePrivada);

		return signatureWrite.signFile(1);
	}
	
	public boolean signFileByFirmante(String rutaSalidaPdfFile,
			String rutaEntradaPdfFile, String rutaFirmaDigitalFile,
			String clavePublica, String clavePrivada, int numeroFirmante) {
		signatureWrite = new SignatureWrite(rutaSalidaPdfFile,
				rutaEntradaPdfFile, rutaFirmaDigitalFile, clavePublica,
				clavePrivada);

		return signatureWrite.signFile(numeroFirmante);
	}
}
