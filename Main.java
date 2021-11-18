public class Main {
    public static void main(String[] args)  {
        System.out.println("###############Exception###############");
        try{
            String mensajes[]= {"uno", "dos","tres"};
            for (int i = 0; i <=3; i++) {
               System.out.println(mensajes[i]);            
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e);
            System.out.println("Erorr: "+e.getMessage());
        }    
        System.out.println("Esta linea está cool"); 
        System.out.println("###############Exception Anidada###############");
        try{
            Integer denominador = 0;
            float equis = 5/denominador; 
            System.out.println(equis);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }// CON DOS CASOS ESTA BIEN YA DESPUES PONER LA NORMAL
        System.out.println("###################Propagación de Exception####################");
        try {
            imprimirArreglo();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error-> "+e.getMessage());
        }finally{
            System.out.println("Cualquer cosa que suceda, entra en el finally");
        }

        System.out.println("######################Creación de Exception##################");
        Cuenta cuenta = new Cuenta();
        try {
            cuenta.depositar(2000);
            cuenta.consultaSaldo();
            cuenta.retirar(800);
            cuenta.consultaSaldo();
            cuenta.retirar(1100);
            cuenta.consultaSaldo();
            cuenta.retirar(500);
            cuenta.consultaSaldo();
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: "+e.getMessage());
            ofrecerTarjetaCredito();
        }catch(MaximoVecesRetiroException e){
            System.out.println("Error: "+e.getMessage());
        }catch(DepositoMaximoException e){
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("######################Actividad Extra 1##################");
        Cuenta cuenta2= new Cuenta();
        try {
            cuenta2.depositar(12000);
            cuenta2.consultaSaldo();
            cuenta2.retirar(800);
            cuenta2.consultaSaldo();
            cuenta2.depositar(40000);
        }catch (SaldoInsuficienteException e) {
            System.out.println("Error: "+e.getMessage());
            ofrecerTarjetaCredito();
        }catch(MaximoVecesRetiroException e){
            System.out.println("Error: "+e.getMessage());
        }catch(DepositoMaximoException e){
            System.out.println("Error: "+e.getMessage());
        }

    

        System.out.println("######################Actividad Extra 2##################");
        Cuenta cuenta3= new Cuenta();
        try {
            cuenta3.depositar(15000);
            cuenta3.consultaSaldo();
            cuenta3.retirar(800);
            cuenta3.consultaSaldo();
            cuenta3.retirar(1100);
            cuenta3.consultaSaldo();
            cuenta3.retirar(1000);
            cuenta3.consultaSaldo();
            cuenta3.retirar(1000);
        }catch (SaldoInsuficienteException e) {
            System.out.println("Error: "+e.getMessage());
            ofrecerTarjetaCredito();
        }catch(MaximoVecesRetiroException e){
            System.out.println("Error: "+e.getMessage());
        }catch(DepositoMaximoException e){
            System.out.println("Error: "+e.getMessage());
        }

    }

    public static void imprimirArreglo()throws ArrayIndexOutOfBoundsException {//Esto íltimo es para la compilacion
        String mensajes[]= {"uno", "dos","tres"};
            for (int i = 0; i <=3; i++) {
               System.out.println(mensajes[i]);            
            }                
    }

    public static void ofrecerTarjetaCredito(){
        System.out.println("Te interesa sacar una tarjeta de credito?");
    }
}
