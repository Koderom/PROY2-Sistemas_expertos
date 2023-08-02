package SE;

public class Motor {  
    
    public void FWC(BaseHechos BH, int meta){
        while (true){
            int l = BH.length();          
            
                //Reglas (Pasada)
            if (BH.get(Var.BPosPod) == Var.SI || BH.get(Var.MGestosis) == Var.SI || 
                BH.get(Var.MDiabG) == Var.SI || BH.get(Var.PPosPrevCent) == Var.SI ||
                BH.get(Var.MProblCorazon) == Var.SI || BH.get(Var.MProblRenal) == Var.SI ||
                    BH.get(Var.MProblInfecc) == Var.SI)
                BH.add(Var.RiesgoPrev, Var.SI); // R1
            
            if (BH.get(Var.BPosPod) == Var.NO && BH.get(Var.MGestosis) == Var.NO &&
                BH.get(Var.MDiabG) == Var.NO && BH.get(Var.PPosPrevCent) == Var.NO &&
                BH.get(Var.MProblCorazon) == Var.NO && BH.get(Var.MProblRenal) == Var.NO &&
                    BH.get(Var.MProblInfecc) == Var.NO)
                BH.add(Var.RiesgoPrev, Var.NO); // R2
            
            if(BH.get(Var.RiesgoPrev) == Var.SI)
                BH.add(Var.TCesarea, Var.Prevista); // R3
            
            if (BH.get(Var.BCabzGrande) == Var.SI && BH.get(Var.CCanal) == Var.NO && BH.get(Var.RiesgoPrev) == Var.NO)
                BH.add(Var.TCesarea, Var.Improvisada); // R4

            if (BH.get(Var.BCabzEncaja) == Var.NO && BH.get(Var.RiesgoPrev) == Var.NO)
                BH.add(Var.TCesarea, Var.Improvisada); // R5

            if (BH.get(Var.BRidmoC) == Var.Irregular || BH.get(Var.BExplMec) == Var.SI)
                BH.add(Var.SufrimientoFetal, Var.SI); // R6

            if (BH.get(Var.BRidmoC) == Var.Regular && BH.get(Var.BExplMec) == Var.NO)
                BH.add(Var.SufrimientoFetal, Var.NO); // R7

            if (BH.get(Var.SufrimientoFetal) == Var.SI && BH.get(Var.RiesgoPrev) == Var.NO)
                BH.add(Var.TCesarea, Var.Improvisada); // R8

            if (BH.get(Var.PlacDesprende) == Var.SI && BH.get(Var.RiesgoPrev) == Var.NO)
                BH.add(Var.TCesarea, Var.Improvisada); // R9

            if (BH.get(Var.PlacDesprende) == Var.SI && BH.get(Var.TCesarea) == Var.Improvisada)
                BH.add(Var.TIncision, Var.UP); // R10

            if (BH.get(Var.PlacDesprende) == Var.NO || BH.get(Var.TCesarea) == Var.Prevista)
                BH.add(Var.TIncision, Var.TB); // R11

            if (BH.get(Var.TIncision) == Var.UP) {
                BH.add(Var.CorteIncision, Var.Vertical); // R12
            }
            if (BH.get(Var.TIncision) == Var.UP) {
                BH.add(Var.CicatrizVisible, Var.NO); // R13
            }

            if (BH.get(Var.TIncision) == Var.TB) {
                BH.add(Var.CorteIncision, Var.Horizontal); // R14
            }
            
            if (BH.get(Var.TIncision) == Var.TB) {
                BH.add(Var.CicatrizVisible, Var.NO); // R15
            }

            if (BH.get(Var.TIncision) == Var.DJC)
                BH.add(Var.CorteIncision, Var.Horizontal); // R16
            
                //Comprobación de salida
            if (l == BH.length() || BH.contains(meta))
                break;
        } //End while      
    }
    
}
