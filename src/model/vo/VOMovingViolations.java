package model.vo;

/**
 * Representation of a Trip object
 */
public class VOMovingViolations implements Comparable<VOMovingViolations>{
	
	//----------------------------------------------------------------------
	// Atributos
	//----------------------------------------------------------------------
	
	/**
	 * Identificador �nico de la infracci�n
	 */
	private int objectId;
	
	/**
	 * Direcci�n en formato de texto
	 */
	private String location;
	
	/**
	 * Cantidad a pagar por la infracci�n en USD
	 */
	private int sumaFINEAMT;
	
	/**
	 * Fecha cuando se puso la infracci�n
	 */
	private String ticketIssueDate;
	
	/**
	 * Cuanto dinero pag� el que recibio la infracci�n en USD
	 */
	private int totalPaid;
	
	/**
	 * Si hubo acciente o no
	 */
	private String accidentIndicator;
	
	/**
	 * C�digo de la infracci�n
	 */
	private String violationCode;
	
	/**
	 * Descripci�n textual de la infracci�n
	 */
	private String violationDescription;
	
	//--------------------------------------------------------------------------------------------------
	// Constructor
	//--------------------------------------------------------------------------------------------------
	
	/**
	 * Inicializa la clase.
	 * @param pObjectId Identificador �nico de la infracci�n.
	 * @param pLocation Direcci�n en formato de texto.
	 * @param pSumaFINEAMT Cantidad a pagar por la infracci�n en USD.
	 * @param pTicketIssueDate Fecha cuando se puso la infracci�n.
	 * @param pTotalPaid Cuanto dinero pago el que recibio la infracci�n en USD.
	 * @param pAccidentIndicator Si hubo accidente o no.
	 * @param pViolationCode Codigo de la infracci�n.
	 * @param pViolationDescription Descripci�n textual de la infracci�n.
	 */
	public VOMovingViolations(int pObjectId, String pLocation, int pSumaFINEAMT, String pTicketIssueDate, int pTotalPaid, String pAccidentIndicator, String pViolationCode, String pViolationDescription){
		objectId = pObjectId;
		location = pLocation;
		sumaFINEAMT = pSumaFINEAMT;
		ticketIssueDate = pTicketIssueDate;
		totalPaid = pTotalPaid;
		accidentIndicator = pAccidentIndicator;
		violationCode = pViolationCode;
		violationDescription = pViolationDescription;
	}
	
	//-----------------------------------------------------------------------------------------
	// M�todos
	//-----------------------------------------------------------------------------------------
	
	/**
	 * Retorna el objectId
	 * @return id - Identificador �nico de la infracci�n
	 */
	public int objectId() {
		return objectId;
	}	
	
	
	/**
	 * Retorna la direcci�n
	 * @return location - Direcci�n en formato de texto.
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * Retorna la cantidad a pagar por la  infracci�m
	 * @return sumaFINEAMT - Cantidad a pagar por la infracci�n
	 */
	public int getSumaFINEAMT() {
		return sumaFINEAMT;
	}

	/**
	 * Retorna la fecha en la que se puso la infracci�n
	 * @return date - Fecha cuando se puso la infracci�n .
	 */
	public String getTicketIssueDate() {
		return ticketIssueDate;
	}
	
	/**
	 * @return totalPaid - Cuanto dinero efectivamente pagó el que recibió la infracción en USD.
	 */
	public int getTotalPaid() {
		return totalPaid;
	}
	
	/**
	 * @return accidentIndicator - Si hubo un accidente o no.
	 */
	public String  getAccidentIndicator() {
		return accidentIndicator;
	}
	/**
	 * Retorna el c�digo de la infracci�n
	 * @return violationCode - C�digo de la infracci�n
	 */
	public String  getViolationCode() {
		return violationCode;
	}
		
	/**
	 * Retorna la descripci�n textual de la infracci�n
	 * @return description - Descripci�n textual de la infracci�n.
	 */
	public String  getViolationDescription() {
		return violationDescription;
	}

	@Override
	public int compareTo(VOMovingViolations arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
