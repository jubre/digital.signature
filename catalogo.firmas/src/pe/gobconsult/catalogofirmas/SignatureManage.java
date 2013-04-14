package pe.gobconsult.catalogofirmas;

import sun.security.tools.KeyTool2;

public class SignatureManage {
	private String nombreUsuario;
	private String nombreOrganizacion;
	private String alias = "business";
	private String clavePublica;
	private String clavePrivada;
	private String ubicacionAlmacenamiento;
	private String nombreArchivoFirma;
	private String tiempoValidez;
	private String[] args = new String[13];
	private KeyTool2 kt = new KeyTool2();

	public SignatureManage(String nombreUsuario, String nombreOrganizacion,
			String clavePublica, String clavePrivada,
			String ubicacionAlmacenamiento, String nombreArchivoFirma,
			String tiempoValidez) {
		this.nombreUsuario = nombreUsuario;
		this.nombreOrganizacion = nombreOrganizacion;
		this.clavePublica = clavePublica;
		this.clavePrivada = clavePrivada;
		this.ubicacionAlmacenamiento = ubicacionAlmacenamiento;
		this.nombreArchivoFirma = nombreArchivoFirma;
		this.tiempoValidez = tiempoValidez;
	}

	public void generarFirma() {
		args[0] = "-genkeypair";
		args[1] = "-dname";
		args[2] = "cn=" + nombreUsuario + ", ou=" + nombreOrganizacion + ", o="
				+ nombreOrganizacion + ", c=PE";
		args[3] = "-alias";
		args[4] = alias;
		args[5] = "-keypass";
		args[6] = clavePublica;
		args[7] = "-keystore";
		args[8] = ubicacionAlmacenamiento + "/" + nombreArchivoFirma;
		args[9] = "-storepass";
		;
		args[10] = clavePrivada;
		args[11] = "-validity";
		args[12] = tiempoValidez;

		try {
			kt.run(args, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
