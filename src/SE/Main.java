package SE;


public class Main {    
    
    public static void main(String[] args) {
        BaseHechos BH = new BaseHechos();
        Motor motor = new Motor();
        
            //Consultas al cliente
        BH.add(Var.BPosPod, Var.NO);
        BH.add(Var.MGestosis, Var.NO);
        BH.add(Var.MDiabG, Var.NO);
        BH.add(Var.PPosPrevCent, Var.NO);
        BH.add(Var.MProblCorazon, Var.NO);
        BH.add(Var.MProblRenal, Var.NO);
        BH.add(Var.MProblInfecc, Var.NO);
        BH.add(Var.BCabzGrande, Var.SI);
        BH.add(Var.CCanal, Var.NO);
        BH.add(Var.PlacDesprende, Var.NO);
        BH.add(Var.BRidmoC, Var.Irregular);
        BH.add(Var.BExplMec, Var.NO);
        
        int meta = Var.TIncision;
            //Llamar al FWC
        motor.FWC(BH, meta);
        
            //Mostrar resultados (módulo de diálogo)
        String nomMeta = Var.toString(meta);
        
        if (BH.contains(Var.SufrimientoFetal))
            System.out.println(nomMeta+"=" + Var.valorToString(meta));
        else
            System.out.println("No se encontraron conclusiones para "+nomMeta);
        
        System.out.println(BH);
        
    }  
}
