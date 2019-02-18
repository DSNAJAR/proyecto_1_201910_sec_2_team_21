package model.vo;

/**
 * Esta clase representa el comparador
 */
public class VODaylyStatistic implements Comparable<VODaylyStatistic>{
	
	//------------------------------------------------------------------------------------------------------
	// Atributos
	//------------------------------------------------------------------------------------------------------
	
	/**
	 * Fecha del d�a
	 */
	private String fechaDelDia;
	
	/**
	 * Numero de accidentes en el d�a
	 */
	private int numeroAccidentes;
	
	/**
	 * Numero de infracciones en el d�a
	 */
	private int numeroInfracciones;
	
	/**
	 * Cantidad a pagar por la infracci�n
	 */
	private int sumaFINEAMT;
	
	//------------------------------------------------------------------------------------
	// Constructor
	//------------------------------------------------------------------------------------
	
	/**
	 * Asigna valores a los atributos de esta clase. <br>
	 * <b>post:</b> los atributos estan inicializados.
	 * @param pFechaDelDia Fecha del d�a.
	 * @param pNumeroAccidente Numero de accidentes en el d�a.
	 * @param pNumeroInfracciones Numero de infracciones cometidas en el d�a.
	 * @param pSumaFINEMAT Cantidad a pagar por la infracci�n.
	 */
	public VODaylyStatistic(String pFechaDelDia, int pNumeroAccidente, int pNumeroInfracciones, int pSumaFINEMAT) {
		fechaDelDia = pFechaDelDia;
		numeroAccidentes = pNumeroAccidente;
		numeroInfracciones = pNumeroInfracciones;
		sumaFINEAMT = pSumaFINEMAT;
	}
	
	//-------------------------------------------------------------------------------------
	// Atributos
	//-------------------------------------------------------------------------------------
	
	/**
	 * Retorna la fecha del d�a
	 * @return fechaDelDia Fecha del d�a.
	 */
	public String getFechaDelDia() {
		return fechaDelDia;
	}
	
	/**
	 * Retorna el numero de accidentes en el d�a
	 * @return numeroAccidentes Numero de accidentes en el d�a
	 */
	public int getNumeroAccidentes() {
		return numeroAccidentes;
	}
	
	/**
	 * Retorna el numero de infracciones en el d�a
	 * @return numeroInfracciones Numero de infracciones en el d�a 
	 */
	public int getNumeroInfracciones() {
		return numeroInfracciones;
	}
	
	/**
	 * Retorna la cantidad a pagar por la infracci�n
	 * @return sumaFINEAMT Cantidad a pagar por la infracci�n
	 */
	public int getsumaFINEAMT() {
		return sumaFINEAMT;
	}
	
	@Override
	public int compareTo(VODaylyStatistic arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
