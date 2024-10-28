package CuentaBanco;
import java.util.Scanner;

public class actividad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		String nombre, nacimiento, numCuenta, log = "", log2 = "";
		
		double saldo = 0, ingresos = 0,retiro = 0, dolares, libras, yuanes;
		
		int opcion1 = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0;
		
		System.out.println("Introduce ->");
		
		System.out.println("Nombre: ");
		nombre = entrada.nextLine();
		
		System.out.println("Fecha de nacimiento: ");
		nacimiento = entrada.nextLine();
		
		System.out.println("Número de cuenta: ");
		numCuenta = entrada.nextLine();
		
		
		
		while (opcion1 != 6) {
			
			System.out.println(

					"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
					+ "Gestiona tu cuenta bancaria, " + nombre.toUpperCase() + " >>\n"
					+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
					+ "1. - Datos de cuenta ->\n"
					+ "2. - Ingresar ->\n"
					+ "3. - Retirar ->\n"
					+ "4. - Equivalencia monetaria internacional ->\n"
					+ "5. - Historial bancario ->\n"
					+ "6. - Salir >>\n"
					+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
					
					);
		
			
			opcion1 = entrada.nextInt();
			
			switch (opcion1) {
			
			case 1:
				
				System.out.println("Datos de la cuenta >>\n");
				
				System.out.println("Nombre: " + nombre);
				
				System.out.println("Fecha de nacimiento: " + nacimiento);
				
				System.out.println("Número de cuenta: " + numCuenta + "\n");
				
				System.out.println("Saldo actual: " + saldo + "€");
				
				
				break;
				
			case 2:
				
				
					
				System.out.println("¿Cuanto deseas ingresar? >> ");
				ingresos = entrada.nextDouble();
				
				if (ingresos <= 0) {
					
					System.out.println("Error, No puedes ingresar valores menores o igual que 0. ");
					
					break;
					
				} else { 
				
				String monto = "+" + ingresos + "€";
				
				saldo += ingresos;
				
				log += monto + "\n";

				
				/* log += ("+%.2f", ingresos);
				ingresos = entrada.nextDouble();
				
				* log = variable declarada
				* f = float decimal
				* % = aplicacion de formato
				*/
				
				}
				
				break;
				
			case 3:
				
				System.out.println("¿Cuanto deseas retirar? >> ");
				retiro = entrada.nextDouble();
				
				if (retiro <= 0) {
					
					System.out.println("Error, No puedes ingresar valores menores o igual que 0. ");
					
				} else {
					
					if (saldo < retiro) {
						
						
						System.out.println(
							
							"---------------------------------------------------------\n"
							+ "¿Desea retirar una cantidad superior al saldo disponible?\n"
						    + "---------------------------------------------------------\n"
							+ "1. Si ->\n"
							+ "2. No ->\n"
							
							);
						
						 opcion2 = entrada.nextInt();;
						 switch (opcion2) {
						 
						 case 1:
							 
							 String monto2 = "-" + retiro + "€";
							 
							 saldo -= retiro;
							 log2 += monto2 + "\n";
							 
							 System.out.println("Retiro confirmado :D \n");
							 break;
							 
						 case 2:
							 break;
							  
						 default:
							 
								System.out.println("ERROR: opciónn desconocida.");
								break;
								
						 }
						 
						 break; 
							 
				} else if (saldo >= retiro) {
					
					String monto3 = "-" + retiro + "€";
					
					saldo -= retiro;
					log2 += monto3 + "\n";
					
					}
				
					
				}
					
				
				break;
				
			case 4:
				
				System.out.println(
						
						"-----------------------------------------\n"
						+ "Ver la equivalencia en otras monedas >>\n"
						+ "-----------------------------------------\n"
						+ "1. Dolares\n"
						+ "2. Libras\n"
						+ "3. Yuanes\n"		
						+ "4. Regresar"
						);
				
			opcion3 = entrada.nextInt();
			
			switch (opcion3) {
			
			case 1:
				
				dolares = (ingresos * 0.95);
				
				System.out.println("Saldo en dolares: "  + dolares + "$");
				
				break;
				
			case 2:
				
				libras = (ingresos * 1.15);
				
				System.out.println("Saldo en libras: " + libras + "£");
				
				break;
				
			case 3:
				
				yuanes = (ingresos * 0.13);
				
				System.out.println("Saldo en yuanes: " + yuanes + "¥");
				
				break;
				
			case 4:
				break;
				
			default:
				
				System.out.println("ERROR: opciónn desconocida.");
				
			}
			
			break;
			
		case 5:
			
			System.out.println(
					
					"---------------------------------------\n"
					+ "Cantidad realizada de: \n"
					+ "---------------------------------------\n"
					+ "1. Ingresos -> \n"
					+ "2. Retiros -> \n"
					+ "3. Volver al menú"
					
					);
			
			opcion4 = entrada.nextInt();
			
			switch (opcion4) {
			
			case 1: 
				
				System.out.println(log);
				break;
				
			case 2:	
				
				System.out.println(log2);
		
				break;
				
			case 3:
				break;
			}
			
			break;
			
		case 6:
			
			System.out.println("Gracias por confiar en nosotros :D  >>> ");
			break;
			
		default:
			System.out.println("ERROR: opción desconocida.");
				
				
			}
		}
		
	}

}
