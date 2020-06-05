import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author kuro_
 */
public class Cola 

{///////PUBLIC CLASS COLA
    private int MAX,FRENTE,FINAL;
    private String [] COLA;
 
    
    public  Cola()
    {////COLA ARRAY
        
        this.MAX=100;
        this.FRENTE=0;
        this.FINAL=0;
        this.COLA=new String[this.MAX+1];
       
    }////COLA ARRAY
    
    public Cola(int MAX)
    {
        this.MAX=MAX;
        this.FRENTE=0;
        this.FINAL=0;
        this.COLA=new String[this.MAX+1];
        
    }
    
    public  boolean ColaLLena()
    {//////COLA LLENA
     if(this.FINAL==this.MAX)
     {
         return true;
     }
     else
     {
         return false;
     }
    }////////COLA LLENA
    public boolean ColaVacia()
    {///////COLA VACIA
        if(this.FRENTE==this.FINAL)
        {
            return true;
           
        }
        else 
        {
            return false;
        }
    }/////COLA VAcIA
    public void INGRESAR()
    {
        
        if(this.ColaLLena())
        {
           JOptionPane.showMessageDialog(null,"LA COLA ESTÁ LLENA");
        }
        else
        {
                String DATOS;
            DATOS = (JOptionPane.showInputDialog(null,"INGRESE EL NOMBRE PORFAVOR"));
            this.FINAL++;
            this.COLA[FINAL]= DATOS;
        }
    }
    
    public void Eliminar()
    
    {
    if(this.FRENTE==this.FINAL)
    {
        JOptionPane.showMessageDialog(null,"LA COLA ESTA VACIA");
    }
    else
    
    {
     for(int i=FRENTE;i<FINAL-1;i++)
     
     {
      COLA[i]=COLA[i];   
     }
     FINAL--;
    }
    }
    
    public void Mostrar()
    {
    if(this.ColaVacia()) 
    {
        JOptionPane.showMessageDialog(null,"LA COLA ESTÁ VACIA\n NO HAY DATOS QUE MOSTRAR","MOSTRAR NOMBRES",JOptionPane.WARNING_MESSAGE);
    }
    else
    {
        String MOSTRAR="";
        for(int i=FRENTE+1;i<=FINAL;i++)
        {
            MOSTRAR =MOSTRAR+COLA[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,"SE TIENEN ESTOS DATOS EN LA COLA ACTUALMENTE: "+this.FINAL+"\n"+"LOS NOMBRES SON: \n"+MOSTRAR,"MOSTRAR NOMBRES",JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    
    public static Cola COLAA;
    public static void main(String[] args) 
 
    {//////////MAIN
        
        int MAX;
        MAX= Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL TAMAÑO DE LA COLA"));
        COLAA=new Cola(MAX);
        MenuCola();  
    }//////////MAIN
    public static void MenuCola()
    {
        int opcion;
        do
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR NOMBRES \n"+
                    "2. MOSTRAR NOMBRES\n"+
                    "3. ELIMINAR NOMBRES\n"+
                    "4. SALIR\n"+
                    "****************************************\n"+
                    "ESCOJA UNA OPCION","MENU COLA",JOptionPane.QUESTION_MESSAGE));
            switch(opcion)
            {
                
                case 1: COLAA.INGRESAR();break;
                case 2: COLAA.Mostrar();break;
                case 3: COLAA.Eliminar();break;
                case 4: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(true);
    }
    
}///////PUBLIC CLASS COLA
