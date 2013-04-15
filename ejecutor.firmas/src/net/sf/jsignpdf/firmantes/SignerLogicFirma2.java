package net.sf.jsignpdf.firmantes;

import net.sf.jsignpdf.BasicSignerOptions;
import net.sf.jsignpdf.SignerLogic;

import org.apache.log4j.Logger;

import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfSignatureAppearance;

public class SignerLogicFirma2 extends SignerLogic {

	private final static Logger LOGGER = Logger
			.getLogger(SignerLogicFirma2.class);

	public SignerLogicFirma2(BasicSignerOptions anOptions) {
		super(anOptions);
	}

	public void asignarUbicacionFirmaEnDocumento(
			final PdfSignatureAppearance sap) {
		sap.setVisibleSignature(new Rectangle(
				ConstantesUbicacionFirma.DEFVAL_LLX_2,
				ConstantesUbicacionFirma.DEFVAL_LLY_2,
				ConstantesUbicacionFirma.DEFVAL_URX_2,
				ConstantesUbicacionFirma.DEFVAL_URY_2),
				ConstantesUbicacionFirma.DEFVAL_PAGE, null);
	}
}
