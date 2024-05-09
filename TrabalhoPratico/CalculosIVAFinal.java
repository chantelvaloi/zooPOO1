/*>Implemente a interface Calculo contendo a taxa de IVA 17%, que ser� aplicado ao pre�o. O c�lculo do valor do IVA e do valor Final 
 *  que s� � aplicado aos Shows e aos Restaurantes. O c�lculo do valor final para os Restaurantes dever� ser o lucro obtido menos o 
 *  valor do IVA, e o c�lculo do valor final do show dever� ser o valor total obtido pela venda dos bilhetes mais o valor do IVA.
 * 
 */
public interface CalculosIVAFinal {
	
	public static final float IVA = 0.17f;
	public abstract float valorFinal();

}
