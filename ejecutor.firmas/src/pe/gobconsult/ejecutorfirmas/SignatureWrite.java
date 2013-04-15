package pe.gobconsult.ejecutorfirmas;

import java.io.File;

import net.sf.jsignpdf.BasicSignerOptions;
import net.sf.jsignpdf.firmantes.SignerLogicFirma1;
import net.sf.jsignpdf.firmantes.SignerLogicFirma2;
import net.sf.jsignpdf.firmantes.SignerLogicFirma3;
import net.sf.jsignpdf.firmantes.SignerLogicFirma4;
import net.sf.jsignpdf.firmantes.SignerLogicFirma5;
import net.sf.jsignpdf.firmantes.SignerLogicFirma6;
import net.sf.jsignpdf.firmantes.SignerLogicFirma7;
import net.sf.jsignpdf.firmantes.SignerLogicFirma8;
import net.sf.jsignpdf.types.CertificationLevel;
import net.sf.jsignpdf.types.HashAlgorithm;
import net.sf.jsignpdf.types.PDFEncryption;

import org.apache.commons.lang3.StringUtils;

public class SignatureWrite {

	private String rutaSalidaPdfFile;
	private String rutaEntradaPdfFile;
	private String rutaFirmaDigitalFile;
	private String alias = "business";
	private String clavePublica;
	private String clavePrivada;

	private BasicSignerOptions options = new BasicSignerOptions();
	private SignerLogicFirma1 SignerLogicFirma1 = new SignerLogicFirma1(options);
	private SignerLogicFirma2 SignerLogicFirma2 = new SignerLogicFirma2(options);
	private SignerLogicFirma3 SignerLogicFirma3 = new SignerLogicFirma3(options);
	private SignerLogicFirma4 SignerLogicFirma4 = new SignerLogicFirma4(options);
	private SignerLogicFirma5 SignerLogicFirma5 = new SignerLogicFirma5(options);
	private SignerLogicFirma6 SignerLogicFirma6 = new SignerLogicFirma6(options);
	private SignerLogicFirma7 SignerLogicFirma7 = new SignerLogicFirma7(options);
	private SignerLogicFirma8 SignerLogicFirma8 = new SignerLogicFirma8(options);

	public SignatureWrite(String rutaSalidaPdfFile, String rutaEntradaPdfFile,
			String rutaFirmaDigitalFile, String clavePublica,
			String clavePrivada) {
		this.rutaSalidaPdfFile = rutaSalidaPdfFile;
		this.rutaEntradaPdfFile = rutaEntradaPdfFile;
		this.rutaFirmaDigitalFile = rutaFirmaDigitalFile;
		this.clavePublica = clavePublica;
		this.clavePrivada = clavePrivada;
	}

	public boolean signFile(int numeroFirmante) {
		String tmpOut = rutaSalidaPdfFile;
		if (StringUtils.isNotEmpty(tmpOut)) {
			File tmpOutFile = new File(tmpOut);
			if (!tmpOut.toLowerCase().endsWith(".pdf") && !tmpOutFile.isFile()) {
				rutaSalidaPdfFile = tmpOut + ".pdf";
			}
		}
		storeToOptions();

		if (checkFileExists(rutaEntradaPdfFile) && checkInOutDiffers()) {
			if (numeroFirmante == 1) {
				return SignerLogicFirma1.signFile();
			} else if (numeroFirmante == 2) {
				return SignerLogicFirma2.signFile();
			} else if (numeroFirmante == 3) {
				return SignerLogicFirma3.signFile();
			} else if (numeroFirmante == 4) {
				return SignerLogicFirma4.signFile();
			} else if (numeroFirmante == 5) {
				return SignerLogicFirma5.signFile();
			} else if (numeroFirmante == 6) {
				return SignerLogicFirma6.signFile();
			} else if (numeroFirmante == 7) {
				return SignerLogicFirma7.signFile();
			} else if (numeroFirmante == 8) {
				return SignerLogicFirma8.signFile();
			}
		}
		return false;
	}

	private void storeToOptions() {
		options.setKsType("JKS");
		options.setAdvanced(true);
		options.setKsFile(rutaFirmaDigitalFile);
		options.setKsPasswd(clavePrivada);
		// options.setStorePasswords(chkbStorePwd.isSelected());
		// if (cbAlias.getSelectedItem() != options.getKeyAlias()
		// || cbAlias.getSelectedIndex() > -1) {
		options.setKeyAlias(alias);
		options.setKeyIndex(1);
		// }
		options.setKeyPasswd(clavePublica);
		options.setInFile(rutaEntradaPdfFile);
		options.setPdfEncryption(PDFEncryption.NONE);
		// options.setPdfOwnerPwd(pfPdfOwnerPwd.getPassword());
		// options.setPdfUserPwd(pfPdfUserPwd.getPassword());
		// options.setPdfEncryptionCertFile(tfEncCertFile.getText());
		options.setOutFile(rutaSalidaPdfFile);
		options.setReason("");
		options.setLocation("");
		options.setContact("");
		options.setCertLevel(CertificationLevel.NOT_CERTIFIED);
		options.setHashAlgorithm(HashAlgorithm.SHA1);
		options.setAppend(true);

		// options.setRightPrinting(PrintRight.ALLOW_PRINTING);
		// options.setRightCopy(true);
		// options.setRightAssembly(chkbAllowAssembly.isSelected());
		// options.setRightFillIn(chkbAllowFillIn.isSelected());
		// options.setRightScreanReaders(chkbAllowScreenReaders.isSelected());
		// options.setRightModifyAnnotations(chkbAllowModifyAnnotations
		// .isSelected());
		// options.setRightModifyContents(chkbAllowModifyContent.isSelected());

		options.setVisible(true);
	}

	private boolean checkFileExists(String aTF) {
		final String tmpFileName = aTF;
		try {
			if (tmpFileName != null) {
				File tmpFile = new File(tmpFileName);
				if (tmpFile.canRead() && !tmpFile.isDirectory()) {
					return true;
				}
			}
		} catch (Exception e) {
		}

		return false;
	}

	private boolean checkInOutDiffers() {
		final String tmpInName = rutaEntradaPdfFile;
		final String tmpOutName = rutaSalidaPdfFile;
		boolean tmpResult = true;
		if (tmpInName != null && StringUtils.isNotEmpty(tmpOutName)) {
			try {
				final File tmpInFile = (new File(tmpInName)).getAbsoluteFile();
				final File tmpOutFile = (new File(tmpOutName))
						.getAbsoluteFile();
				if (tmpInFile.equals(tmpOutFile)) {
					tmpResult = false;
				}
			} catch (Exception e) {
				tmpResult = false;
			}
		}
		return tmpResult;
	}

	public String getRutaSalidaPdfFile() {
		return rutaSalidaPdfFile;
	}

	public void setRutaSalidaPdfFile(String rutaSalidaPdfFile) {
		this.rutaSalidaPdfFile = rutaSalidaPdfFile;
	}

	public String getRutaEntradaPdfFile() {
		return rutaEntradaPdfFile;
	}

	public void setRutaEntradaPdfFile(String rutaEntradaPdfFile) {
		this.rutaEntradaPdfFile = rutaEntradaPdfFile;
	}

	public String getRutaFirmaDigitalFile() {
		return rutaFirmaDigitalFile;
	}

	public void setRutaFirmaDigitalFile(String rutaFirmaDigitalFile) {
		this.rutaFirmaDigitalFile = rutaFirmaDigitalFile;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getClavePublica() {
		return clavePublica;
	}

	public void setClavePublica(String clavePublica) {
		this.clavePublica = clavePublica;
	}

	public String getClavePrivada() {
		return clavePrivada;
	}

	public void setClavePrivada(String clavePrivada) {
		this.clavePrivada = clavePrivada;
	}

}
