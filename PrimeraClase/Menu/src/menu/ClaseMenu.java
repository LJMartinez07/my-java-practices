
package menu;

/**
 *
 * @author Luis Martinez
 */
public final class ClaseMenu {
    
    public ClaseMenu(){
        //constructror
        opciones();//despliega la opciones
    }
    
    Integer opcion=0;
    
    public void setMenu(int opc){
        opcion=opc; // valor del menu
        
         switch(opcion){
             case 1: //caso 1 opcion==1
                 System.out.println("Caso 1"
                         + "\neste es el switch");
                 break;
             case 2:
                 System.out.println("Caso 2");
                 break;
             case 3:
                 System.out.println("Salir");
                 break;
             default:
                 throw new AssertionError();
            
         }
              
    }
    public void opciones(){
        System.out.println("1-) Opcion numero uno");
        System.out.println("2-) Opcion numero dos");
        System.out.println("3-) Opcion salir");
    }
    
    public void setAnidado(int opc){
       
        opcion=opc;
        
        if (opcion==1) {
            System.out.println("Caso1");
        } else{
            if(opcion==2){
                System.out.println("Caso2");
            }else {
                if(opcion==3){
                    System.out.println("Proceso finalizado");
                } else {
                    System.out.println("No esxiste");
                }
            }
        }
                
    }
}
