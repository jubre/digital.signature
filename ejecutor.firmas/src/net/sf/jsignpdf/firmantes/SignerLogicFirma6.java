package net.sf.jsignpdf.firmantes;

import net.sf.jsignpdf.BasicSignerOptions;
import net.sf.jsignpdf.SignerLogic;

import org.apache.log4j.Logger;

import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfSignatureAppearance;

public class SignerLogicFirma6 extends SignerLogic {

	private final static Logger LOGGER = Logger
			.getLogger(SignerLogicFirma6.class);

	public SignerLogicFirma6(BasicSignerOptions anOptions) {
		super(anOptions);
	}

	public void asignarUbicacionFirmaEnDocumento(
			final PdfSignatureAppearance sap) {
		sap.setVisibleSignature(new Rectangle(
				ConstantesUbicacionFirma.DEFVAL_LLX_6,
				ConstantesUbicacionFirma.DEFVAL_LLY_6,
				ConstantesUbicacionFirma.DEFVAL_URX_6,
				ConstantesUbicacionFirma.DEFVAL_URY_6),
				ConstantesUbicacionFirma.DEFVAL_PAGE, null);
	}
}
