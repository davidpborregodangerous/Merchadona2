/**
Se pide el hacer el programa que va controlar las cajas de la aplicación. Para abrir una caja se pondrá un empleado, y venderán productos.

Los empleados son de dos tipos, cajeros y reponedores, los cajeros venderán y los reponedores añaden stock a los productos. 
Todos los empleados tienen un nombre, y un id (número) que los identifica, los cajeros tienen el precio total de productos vendidos.
Los reponedores tienen el total del número de productos que han respuesto.

El empleado un número 1 no se puede dar de alta porque será el administrador, esté será el encargado de dar de alta empleados y productos.

Los empleados se guardarán en un HashMap en el cual se pondrá de índice el id del empleado.

Los productos a vender tienen un nombre, un precio base, y una cantidad en stock. 
Los tenemos de dos tipos perecederos e imperecederos. 
Los que caducan tendrán una fecha de reposición (LocalDateTime), según pasa tiempo desde esa fecha el precio del producto se va reduciendo, 
cada 10 segundos que pasa el precio se reduce un 10%, y si pasa 1 minuto el producto ya no se podrá vender. 
Cada vez que un reponedor agrega productos se resetea la fecha del producto.

La funcionalidad del programa es según el tipo de usuario que se haya identificado.
Si es el id 1, puede dar de alta empleados y productos, además de darlos de baja. 
Se le permite sacar una lista de cajeros con sus totales.
Si es de reponedor, podrá reponer productos, y ver una lista de las cantidades de cada producto que quedan en stock.
Si es cajero, irá metiendo los productos vendidos en el programa así como sus cantidades, si mete más cantidad de las que hay en stock tiene que avisar de que no hay stock. 
Al finalizar la compra se actualiza el stock de cada producto y se saca por pantalla el total de la compra, además de acumularla en sus totales.
El programa principal dispondrá de una lista de productos, y un hashmap de empleados.

Sugerencias: En el programa principal utilizar funciones, no pongáis todo el código en el main. 
También podéis crear una clase Merchadona, con todos los datos y la funcionalidad, y una clase Main, en la que tengas los menús para acceder al sistema.
 * @author David Portillo Borrego, Alberto Ferrero y Luis Cristobal Colón
 * @version 1.5
 *
*/
public class Cajeros extends Empleados{
	/**
	 * Atributo de precio total
	 */
	private double precioTotal;
	
	/**
	 * Constructor con 3 parámetros. Crea objetos empleados con la ID, nombre y numTotalProductosResp.
	 * @param id ID del Empleado
	 * @param nombre Nombre del Empleado
	 * @param numTotalProductosResp Número total de productos que han repuesto
	 */
	Cajeros(int id, String nombre, double precioTotal){
		super(id, nombre);
		this.precioTotal = precioTotal;
	}
}