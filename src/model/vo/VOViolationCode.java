package model.vo;

/**
 * Esta clase representa el comparador dado un codigo de infracci�n y un FINEAMT promedio
 */
public class VOViolationCode implements Comparable<VOViolationCode> {
	
	//-----------------------------------------------------------------------
	// Atributos
	//-----------------------------------------------------------------------
	
	/**
	 * Codigo de la infracci�n.
	 */
	private String violationCode;
	
	/**
	 * Cantidad promedio a pagar por la infracci�n.
	 */
	private int promedioFINEAMT;
	
	//------------------------------------------------------------------------
	// Constructor
	//------------------------------------------------------------------------
	
	/**
	 * Inicializa el comparador
	 * <b>post:</b> los atributos estan inicializados
	 * @param pViolationCode Codigo de la infracci�n.
	 * @param pPromedioFINEAMT Valor del FINEAMT promedio.
	 */
	public VOViolationCode(String pViolationCode, int pPromedioFINEAMT) {
		// TODO Auto-generated constructor stub
		violationCode = pViolationCode;
		promedioFINEAMT = pPromedioFINEAMT;
	}
	
	//-------------------------------------------------------------------------
	// M�todos
	//-------------------------------------------------------------------------
	
	/**
	 * Retorna el codigo de la infracci�n.
	 * @return C�digo de la infracci�n
	 */
	public String getViolationCode () {
		return violationCode;
	}
	
	/**
	 * Retorna el FINEAMT promedio
	 * @return FINEAMT promedio 
	 */
	public int getFINEAMTProm () {
		return promedioFINEAMT;
	}

	@Override
	public int compareTo(VOViolationCode arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
