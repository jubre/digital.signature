package net.sf.jsignpdf.firmantes;

import net.sf.jsignpdf.BasicSignerOptions;
import net.sf.jsignpdf.SignerLogic;

import org.apache.log4j.Logger;

import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfSignatureAppearance;

public class SignerLogicFirma7 extends SignerLogic {

	private final static Logger LOGGER = Logger
			.getLogger(SignerLogicFirma7.class);

	public SignerLogicFirma7(BasicSignerOptions anOptions) {
		super(anOptions);
	}

	public void asignarUbicacionFirmaEnDocumento(
			final PdfSignatureAppearance sap) {
		sap.setVisibleSignature(new Rectangle(
				ConstantesUbicacionFirma.DEFVAL_LLX_7,
				ConstantesUbicacionFirma.DEFVAL_LLY_7,
				ConstantesUbicacionFirma.DEFVAL_URX_7,
				ConstantesUbicacionFirma.DEFVAL_URY_7),
				ConstantesUbicacionFirma.DEFVAL_PAGE, null);
	}
}
