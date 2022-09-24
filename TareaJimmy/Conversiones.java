ghfimport java.util.Scanner;
class Conversiones{
  public static void main (String[] args){
    double temperatura;
    double centigrados;
    double kelvin;
    double Rankine;
    int conversion;
    Scanner entrada = new Scanner(System.in);
    try{
        System.out.println("Elaborado por Luis Armando Ibarra Landeros");
        System.out.println("Introduce la temperatura en Farenheight que desees convertir");
        temperatura = entrada.nextDouble();
        System.out.println("¿Con que conversion desea trabajar?");
        System.out.println("1-Centigrados");
        System.out.println("2-Kelvin");
        System.out.println("3-Rankine");
        conversion = entrada.nextInt();

        switch(conversion){
            case 1:
            centigrados = ((temperatura - 32) * 5) / 9;
            System.out.println("El resultado de la conversion es " + centigrados + "°C");
            break;
        case 2:
            kelvin = ((temperatura - 32) * 5) / 9 + 273.15;
            System.out.println("El resultado de la conversion es " + kelvin + "°K");
            break;
        case 3:
            Rankine = temperatura + 459.67;
            System.out.println("El resultado de la conversion es " + Rankine + "°R");
            break;
            }
        }catch(java.util.InputMismatchException e1){
		  System.out.println(e1.getMessage() + \n "Error de sistema, introdusca de manera correcta los datos que se le piden porfa :)");
        }
    }
}