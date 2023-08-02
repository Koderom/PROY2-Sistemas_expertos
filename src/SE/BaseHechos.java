package SE;

import java.util.ArrayList;

public class BaseHechos{ 
    //private Float V[];
    
    private ArrayList<Hecho> H;
    
    public BaseHechos(){
        Var.crear(this);
        H = new ArrayList<>();
    }
   
    public void clear(){    //Hace que la BH quede vacía.
        H.clear();
    }
    
    public void add(int variable, float valor){ 
        if (contains(variable)){
            if (get(variable) != valor)
                throw new RuntimeException("Base de hechos: Contradicción con la variable: " + Var.toString(variable));
            
            return;    
        }
        H.add(new Hecho(variable, valor));
    }
    
   
    public boolean contains(int variable){
        for(Hecho hc : H)
            if(hc.variable == variable) return true;
        return false;
    }
    
    public int length(){
        return H.size();
    }
    
    public float get(int variable){   //Devuelve el valor de la variable.
        for(Hecho hc : H)
            if(hc.variable == variable) return hc.valor;
        return Float.NaN;
    }
    
    @Override
    public String toString(){ 
        String S = "[";
        String coma="";
       
        for(Hecho h: H){
            S += coma + Var.toString(h.variable)+"="+Var.valorToString(h.variable);
            coma=", ";
        }
        return S+"]";
    }
    
}
