package net.sf.jsignpdf.firmantes;

import net.sf.jsignpdf.BasicSignerOptions;
import net.sf.jsignpdf.SignerLogic;

import org.apache.log4j.Logger;

import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfSignatureAppearance;

public class SignerLogicFirma3 extends SignerLogic {

	private final static Logger LOGGER = Logger
			.getLogger(SignerLogicFirma3.class);

	public SignerLogicFirma3(BasicSignerOptions anOptions) {
		super(anOptions);
	}

	public void asignarUbicacionFirmaEnDocumento(
			final PdfSignatureAppearance sap) {
		sap.setVisibleSignature(new Rectangle(
				ConstantesUbicacionFirma.DEFVAL_LLX_3,
				ConstantesUbicacionFirma.DEFVAL_LLY_3,
				ConstantesUbicacionFirma.DEFVAL_URX_3,
				ConstantesUbicacionFirma.DEFVAL_URY_3),
				ConstantesUbicacionFirma.DEFVAL_PAGE, null);
	}
}
