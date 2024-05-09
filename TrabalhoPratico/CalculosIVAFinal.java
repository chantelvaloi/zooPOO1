/*>Implemente a interface Calculo contendo a taxa de IVA 17%, que será aplicado ao preço. O cálculo do valor do IVA e do valor Final 
 *  que só é aplicado aos Shows e aos Restaurantes. O cálculo do valor final para os Restaurantes deverá ser o lucro obtido menos o 
 *  valor do IVA, e o cálculo do valor final do show deverá ser o valor total obtido pela venda dos bilhetes mais o valor do IVA.
 * 
 */
public interface CalculosIVAFinal {
	
	public static final float IVA = 0.17f;
	public abstract float valorFinal();

}
