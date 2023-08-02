package SE;

public class Var {
    static int 
            BPosPod, 
            MGestosis, 
            MDiabG, 
            PPosPrevCent, 
            MProblCorazon, 
            MProblRenal,
            MProblInfecc,
            BCabzGrande,
            CCanal,
            BCabzEncaja,
            BRidmoC,
            BExplMec,
            SufrimientoFetal,
            PlacDesprende,
            TCesarea,
            TIncision,   //Variables
            CorteIncision,
            CicatrizVisible,
            RiesgoPrev;
    static final int SIZE=19;                            //Cantidad de variables
    
        //Valores de las variables (dominio)
    static final float  NO = 0, SI = 1,
                        Regular = 2, Irregular = 3,
                        Prevista = 4, Improvisada = 5,
                        UP = 6, TB = 7, DJC = 8,
                        Vertical = 9, Horizontal = 10
            ;
    
       
    static void crear(BaseHechos HB){    // (Usado por la class BaseHechos):Iniciar las variables (índices de la BH)
        BPosPod = 0; 
        MGestosis = 1; 
        MDiabG = 2; 
        PPosPrevCent = 3; 
        MProblCorazon = 4; 
        MProblRenal = 5;
        MProblInfecc = 6;
        BCabzGrande = 7;
        CCanal = 8;
        BCabzEncaja = 9;
        BRidmoC = 10;
        BExplMec = 11;
        SufrimientoFetal = 12;
        PlacDesprende = 13;
        TCesarea = 14;
        TIncision = 15;
        CorteIncision = 16;
        CicatrizVisible = 17;
        RiesgoPrev = 18;
        BH = HB;
    }
    
    static float getValor(int variable){
        return BH.get(variable);
    }
    
    static BaseHechos BH;
    
//-------------------------------- Pantalleo -----------------------------------
    private static final String NOMvar[]={  //Poner en el mismo orden que lo declarado
        "BPosPod","MGestosis","MDiabG","PPosPrevCent","MProblCorazon","MProblRenal","MProblInfecc","BCabzGrande", "CCanal",
        "BCabzEncaja","BRidmoC","BExplMec", "SufrimientoFetal", "PlacDesprende", "TCesarea","TIncision", "CorteIncision",
        "CicatrizVisible", "RiesgoPrev"
    };
    
    private static final String VALOR[]={  //Poner en el mismo orden que lo declarado
      "NO", "SI", "Regular", "Irregular", "Prevista", "Improvisada", "Umbilico pubica", "Transversal baja", "De Joel Coell", "Vertical", "Horizontal"
    };
    
    public static String toString(int variable){
        return NOMvar[variable];
    }
    
    public static String valorToString(int variable){
        if (!BH.contains(variable))
            return null;    //La variable no está unificada
        
        float valor = getValor(variable);
        //System.out.println(valor);
        if (variable == BPosPod || variable == MGestosis || variable == MDiabG || variable == PPosPrevCent ||
            variable == MProblCorazon || variable == MProblRenal || variable == MProblInfecc || variable == BCabzGrande ||
            variable == CCanal || variable == BCabzEncaja || variable == BRidmoC || variable == BExplMec ||
            variable == SufrimientoFetal || variable == PlacDesprende || variable == TCesarea || variable == TIncision ||
            variable == CorteIncision || variable == CicatrizVisible || variable == RiesgoPrev)
            
            return VALOR[(int)valor];
        
            
        return ""+valor;
    }
    
    
}
